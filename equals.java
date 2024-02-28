class hello{
    int a=10;
    int b=20;
    void fun(){

    }
    public String toString(){
        return "Rahul kumarr";
    }
    public boolean equals(Object neww){
        return this.a==neww.a && this.b==neww.b; 
    }
}
public class equals {
    public static void main(String[] args){
        hello s = new hello();
        hello s1 = new hello();
        System.out.println(s);
        System.out.println(s1.tostring());
        System.out.println(s.equals(s));
    }
}
