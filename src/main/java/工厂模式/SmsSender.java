package 工厂模式;

import 工厂模式.Sender;

public class SmsSender implements Sender {
    public void send(){
        System.out.println("Smssender send something");
    }
}
