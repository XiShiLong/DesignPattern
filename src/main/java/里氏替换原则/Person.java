package 里氏替换原则;

public class Person {
    private AbstractAnimal animal;
    public void feedAnimal(AbstractAnimal animal){
        this.animal=animal;
    }

    public void walkAnimal(){
        this.animal.dance();
    }
}
