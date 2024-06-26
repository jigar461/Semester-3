import java.util.Scanner;

public class Lab_6_36 {
    public static float convertTemp(float c){
        float f =  (9/5)*c + 32;
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();
        float f = convertTemp(c);
        System.out.println("F = "+f);
    }
}
