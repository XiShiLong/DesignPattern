package 里氏替换原则;

public class Dog extends AbstractAnimal {
    @Override
    public void dance() {
        System.out.println("dog dance");
    }
}
