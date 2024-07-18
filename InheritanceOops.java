class Tiger{
    void eat(){
        System.out.println("Tiger is Eating");
    }
    void sleep(){
        System.out.println("Tiger is Sleeping");
    }
}
class Cub extends Tiger{

}
public class InheritanceOops {
    public static void main(String[] args) {
        Cub c = new Cub();
        c.eat();
        c.sleep();
    }
}
