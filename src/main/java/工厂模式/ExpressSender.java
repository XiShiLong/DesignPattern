package 工厂模式;

import 工厂模式.Sender;

public class ExpressSender implements Sender {
    public void send(){
        System.out.println("express send something");
    }
}
