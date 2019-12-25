package 工厂模式;

public class EmailSender implements Sender {
    public void send() {
        System.out.println("Email send");
    }
}
