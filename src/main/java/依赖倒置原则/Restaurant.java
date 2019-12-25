package 依赖倒置原则;

import java.sql.ResultSet;

public class Restaurant {

    public static void eat(Customer customer){
        customer.eat();
    }

    public static void main(String [] args){
        MisLi li=new MisLi();
        MisWang wang=new MisWang();
        Restaurant.eat(li);
        Restaurant.eat(wang);

    }
}
