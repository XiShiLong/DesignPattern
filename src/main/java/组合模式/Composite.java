package 组合模式;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    public Composite(String name){
        super(name);
    }

    private ArrayList<Component> componentArrayList=new ArrayList<Component>();

    public void add(Component component) {
        this.componentArrayList.add(component);
    }

    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }

    public void display(int depth) {
        for(int i=0;i<depth;i++){
            System.out.print("*");
        }
        System.out.println(getName());
        for(Component component : componentArrayList){
            component.display(depth+1);
        }
    }
}
