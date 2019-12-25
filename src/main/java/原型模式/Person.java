package 原型模式;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {
    private int age;
    private Date birth;


    public Person(int age,Date birth){
        this.age=age;
        this.birth=birth;
    }

    public Person(){}

    public Date getBirth() {
        return birth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
