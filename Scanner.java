import java.util.*;
public class a {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b,c,d;
        System.out.println("enter the no of coffees per day :");
        b=a.nextInt();
        System.out.println("enter the price of coffee :");
        c=a.nextInt();
        System.out.println("enter the number of days :");
        d=a.nextInt();

        System.out.printf("total expenses on coffee in %d days is %d ",d,(b*c*d));

    }
}
