class Animal {
    
}

class Dog extends Animal {
    
}

class Cat extends Animal {
    
}

class InstanceOf {
    public static void main(String[] args) {
        Animal dog1 = new Dog();
        Animal cat1 = new Cat();

        if (dog1 instanceof Animal) {
            System.out.println("Dog1 is an instance of Animal");
        } else {
            System.out.println("Dog1 is not an instance of Animal");
        }

        if (cat1 instanceof Animal) {
            System.out.println("Cat1 is an instance of Animal");
        } else {
            System.out.println("Cat1 is not an instance of Animal");
        }
    }
}
