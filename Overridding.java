import java.util.Scanner;
class RBI{
    float ROI(){
       return 8.8f;
    }
}
class PNB extends RBI{
    float ROI(){
       return 11.8f;
    }
}
class SBI extends RBI{
    float ROI(){
       return 10.8f;
    }
}
class HDFC extends RBI{
    float ROI(){
       return 9.8f;
    }
}
class ICICI extends RBI{
    float ROI(){
       return 83.8f;
    }
}
class Overridding {
    public  void main(String[] args){
        System.out.println(" 1 for PNB\n 2 for SBI\n 3 for HDFC\n 4 for ICICI : ");
        System.out.println("Enter your choice");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a){
            case 1:
            PNB p = new PNB();
            System.out.println("Rate of interest of PNB "+ p.ROI());
            break;
            case 2:
            SBI s = new SBI();
            System.out.println("Rate of interest of SBI "+ s.ROI());
            break;
            case 3:
            HDFC t = new HDFC();
            System.out.println("Rate of interest of PNB "+ t.ROI());
            break;
            case 4:
            ICICI u = new ICICI();
            System.out.println("Rate of interest of PNB "+ u.ROI());
            break;
            default:
            System.out.println("Invalid input");
            break;

        }
    }
    
}
