// The + operator can be used between strings to combine them. This is called concatenation:
class HelloWorld {
    public static void main(String[] args) {
        String firstName= "siddhi";
        String lastName="patel";
        System.out.println(firstName + " "+ lastName);
        
    }
}

//You can also use the concat() method to concatenate two strings:

class HelloWorld {
    public static void main(String[] args) {
        String firstName= "siddhi";
        String lastName="patel";
        System.out.println(firstName.concat(lastName));
        
    }
    
    
    
}


// If you add two numbers, the result will be a number:


class HelloWorld {
    public static void main(String[] args) {
        int x= 10;
        int y=20;
        int z= x+y;
        System.out.println(z);
    }
}

//// If you add one string and a number , the result will be a string:

class HelloWorld {
    public static void main(String[] args) {
        String x= "10";
        int y=20;
        int z= x+y;
        System.out.println(z);
    }
}
