package 建造者模式;

public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder=builder;
    }

    public Product construct(){
        builder.buildCement();
        builder.buildGround();
        builder.buildRoot();
        return builder.buildProduct();
    }
}
