package 组合模式;

public class Leaf extends Component {

    public Leaf(String name){
        super(name);
    }

    public void add(Component component) {
        throw new UnsupportedOperationException("leaf can't add device");
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException("leaf can't remove device");
    }

    public void display(int depth) {
        for(int i=0;i<depth;i++){
            System.out.print("*");
        }
        System.out.println(getName());
    }
}
