package 组合模式;

public abstract class Component {

    private String name;//设备或者部门名称

    public String getName(){
        return name;
    }

    public Component(String name){
        this.name=name;
    }

    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void display(int depth);
}
