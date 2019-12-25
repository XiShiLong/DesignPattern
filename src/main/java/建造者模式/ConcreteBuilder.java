package 建造者模式;

public class ConcreteBuilder implements Builder {

    private final Product product = new Product();

    public void buildGround() {
        System.out.println("build地基");
        product.setGround("build地基");
    }

    public void buildCement() {
        System.out.println("build水泥");
        product.setGround("build水泥");
    }

    public void buildRoot() {
        System.out.println("build楼顶");
        product.setGround("build楼顶");
    }

    public Product buildProduct() {
        System.out.println("建造完毕!");
        return product;
    }
}
