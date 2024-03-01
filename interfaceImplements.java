interface A{
    void prime();
}
class B {
    void prime(){
        System.out.println("This is class B");
    }
}
class C extends B implements A{
    public void prime(){
        System.out.println("This is class C");
    }
    
}
public class interfaceImplements{
    public static void main(String[] args){
        C ob = new C();
        ob.C();
    }
}
