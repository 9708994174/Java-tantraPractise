class Animal{
    Animal(){
    System.out.println("Animal has four legs");
    }
}
class Dog extends Animal{
    Dog(){
    System.out.println("Dog also has four legs");
    }
}
class Cat extends Animal{
    Cat(){
    System.out.println("Cat also has four legs");
    }
}
public class inheritance1{
    public static void main(String[] args){
        Cat obj = new Cat();
        Dog obj1 = new Dog();
    }
}