import java.util.Scanner;
public class Lab_3_16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter number");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        int minInd = 0;
        int maxInd = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
                minInd = i;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                maxInd = i;
            }
        }
        System.out.println("Maximun number "+max+" is on the "+maxInd+" index.");
        System.out.println("Minimum number "+min+" is on the "+minInd+" index.");
    }
}