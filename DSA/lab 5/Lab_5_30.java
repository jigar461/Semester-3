import java.util.Scanner;
public class Lab_5_30{
    public static void main(String[] args) {
        int ar1[][] = new int[2][2];
        int ar2[][] = new int[2][2];
        int ar[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of the first array : ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("Enter number : ");
                ar1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of the second array : ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("Enter number : ");
                ar2[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                ar[i][j] = ar1[i][j] + ar2[i][j];
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}