package 原型模式;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.Date;

public class test {
    public static void main(String[] args) {
        Date date =new Date();
        Person p1=new Person(12,date);
        Person p2=null;
        //将p1序列化存储
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        ObjectOutputStream oos=null;
        try{
           oos =new ObjectOutputStream(bos);
           oos.writeObject(p1);
        }catch (IOException e){
            e.printStackTrace();
        }
        //反序列化来实现p1的拷贝
        byte [] bytes=bos.toByteArray();
        ByteArrayInputStream bis=new ByteArrayInputStream(bytes);
        ObjectInputStream ois=null;
        try{
            ois=new ObjectInputStream(bis);
        }catch (IOException e){
            e.printStackTrace();
        }
        try{
            p2=(Person)ois.readObject();
        }catch (ClassNotFoundException e1){
           e1.printStackTrace();
        }catch (IOException e2){
            e2.printStackTrace();
        }
        System.out.println(p1==p2);
        System.out.println(p1.getBirth()==p2.getBirth());
        System.out.println(p1.getAge()==p2.getAge());
    }
}
