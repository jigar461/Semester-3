import java.util.Scanner;
public class Lab_3_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter number");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int temp = arr[i];
            for(int j=0;j<=arr.length;j++){
                if(j!=i && temp==arr[j]){
                    System.out.println(temp+" is a duplicate number");
                    break;
                }
            }
        }
    }
}
