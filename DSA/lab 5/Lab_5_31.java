import java.util.Scanner;
public class Lab_5_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar1[][] = new int[3][2];
        int ar2[][] = new int[2][3];
        System.out.println("For matrix 1: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.println("Enter number : ");
                ar1[i][j] = sc.nextInt();
            }
        }
        System.out.println("For matrix 2: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter number : ");
                ar2[i][j] = sc.nextInt();
            }
        }
        int ar[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==0 && j==0){
                    ar[0][0] = ar1[0][0]*ar2[0][0] + ar1[0][1]*ar2[1][0];
                }else if(i==0 && j==1){
                    ar[0][1] = ar1[0][0]*ar2[0][1] + ar1[0][1]*ar2[1][1];
                }else if(i==0 && j==2){
                    ar[0][2] = ar1[0][0]*ar2[0][2] + ar1[0][1]*ar2[1][2];
                }else if(i==1 && j==0){
                    ar[1][0] = ar1[1][0]*ar2[0][0] + ar1[1][1]*ar2[1][0];
                }else if(i==1 && j==1){
                    ar[1][1] = ar1[1][0]*ar2[0][1] + ar1[1][1]*ar2[1][1];
                }else if(i==1 && j==2){
                    ar[1][2] = ar1[1][0]*ar2[0][2] + ar1[1][1]*ar2[1][2];
                }else if(i==2 && j==0){
                    ar[2][0] = ar1[2][0]*ar2[0][0] + ar1[2][1]*ar2[1][0];
                }else if(i==2 && j==1){
                    ar[2][1] = ar1[2][0]*ar2[0][1] + ar1[2][1]*ar2[1][1];
                }else if(i==2 && j==2){
                    ar[2][2] = ar1[2][0]*ar2[0][2] + ar1[2][1]*ar2[1][2];
                } 
                else{
                    break;
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
