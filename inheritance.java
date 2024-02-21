class A{
    A(){
        System.out.println("This is class A");
    }

}
class B extends A{
    void fun(){
        System.out.println("This is class B");
    }
}

class C extends A{
    C(){
        System.out.println("This is class C");
    }
}
public class inheritance{
    public static void main(String[] args){
        B obj = new B();
        C obj1 = new C();
    }
}
