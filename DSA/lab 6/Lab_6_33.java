import java.util.Scanner;
public class Lab_6_33{
    public static void swape(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number x : ");
        int x = sc.nextInt();
        System.out.println("Enter number y : ");
        int y = sc.nextInt();
        swape(x,y);
    }
}