package 里氏替换原则;

public class Application {
    public static void main(String[] args) {
       Person person=new Person();
       person.feedAnimal(new Cat() {
           @Override
           public void dance() {
               System.out.println("cat dance");
           }
       });
       person.walkAnimal();
    }
}
