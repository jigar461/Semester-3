import java.util.Scanner;
public class Lab_5_31{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar1[][] = new int[3][2];
		int ar2[][] = new int[2][3];
		int ar[][] = new int[3][3];
		System.out.println("Enter elements for first array : ");
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				System.out.println("Enter number :");
				ar1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter elements for second array : ");
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.println("Enter number :");
				ar2[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<2;k++){
					ar[i][j] += ar1[i][k]*ar2[k][j];
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