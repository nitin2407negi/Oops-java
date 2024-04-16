class Parent{
    Parent(){
        System.out.println("non param constructor of parent");
    }
    Parent(int x)
    {
        System.out.println("param constructor of parent"+x);
    }
}
class Child extends Parent{
    Child(){
        System.out.println("non param const of child");
    }
    Child(int y)
    {
        System.out.println("param constructor of Child");
    }
    Child(int x,int y)
    {
        super(x);  //is used to call a parent class
        System.out.println("2 param of child"+y);
    }
}

public class ParamConst{
    public static void main(String args[])
    {
        Child ob=new Child(20,10);
    }
}