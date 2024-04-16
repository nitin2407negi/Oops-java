class Parent{
    Parent(){
        System.out.println("parent constructor");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("child constructor");
    }
}
class GrandChild extends Child{
    GrandChild(){
        System.out.println("grand child constructor");
    }
}
public class InheritConst{
    public static void main(String args[])
    {
        GrandChild ob=new GrandChild();
    }
}