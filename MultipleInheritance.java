interface A{
    int rollno = 12218918;
    void fun();

}
interface B{
    int name = "Rahul";
    void fun1();
}

class D{
    D(){
        System.out.println("This is class D");
    }
}
class E{
    E(){
        System.out.println("This is class E");
    }
}
class F extends D{
    F(){
        System.out.println("This is class F");
    }
}
class C implements A, B, F{
    public void fun(){
        System.out.println("this is the implements of multipleInhetritance");
    }
}

public class MultipleInheritance {
    public static void main(String[] args){
        C obj = new C();
        obj.fun();
    }
}
