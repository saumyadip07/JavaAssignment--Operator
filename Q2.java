import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);

    int x=sc.nextInt();
    int y=sc.nextInt();

    System.out.println("x= "+x+" y= "+y);

    x=x+y;
    y=x-y;
    x=x-y;

    System.out.println("x= "+x+" y= "+y);

    }



}
