import java.util.Scanner;

class Q1{
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);

        int x=sc.nextInt();

        x=x+8;
        x=x/3;

        x=x%5;
        x=x*5;

        System.out.println(x);


    }
}