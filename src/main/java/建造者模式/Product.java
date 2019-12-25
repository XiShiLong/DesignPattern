package 建造者模式;

public class Product {
    private String ground;
    private String cement;
    private String roof;
    private String product;

    public String getCement() {
        return cement;
    }

    public String getGround() {
        return ground;
    }

    public String getProduct() {
        return product;
    }

    public String getRoof() {
        return roof;
    }

    public void setCement(String cement) {
        this.cement = cement;
    }

    public void setGround(String ground) {
        this.ground = ground;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }
}
