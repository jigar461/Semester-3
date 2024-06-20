import java.util.Scanner;
public class Lab_3_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sixe of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter number :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Choose the first number from the array : ");
        int firstNum = sc.nextInt();
        System.out.println("Choose the second number  : ");
        int secondNum  = sc.nextInt();
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == firstNum){
                arr[i] = secondNum; 
                index = i;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" "+"\n");
        }
        System.out.println("Index of the replaced number : "+index);
    }
}
