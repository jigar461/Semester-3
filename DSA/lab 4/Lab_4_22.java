import java.util.Scanner;
public class Lab_4_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter number : ");
            arr[i] = sc.nextInt();
        }
        int newArr[] = new int[n-1];
        int loc = 0;
        do{
            System.out.println("Enter the index of the element that you want to delete :");
            loc = sc.nextInt();
        }while(loc>n);
        for(int i=0;i<newArr.length;i++){
            if(i<loc){
                newArr[i] = arr[i];
            }else if(i==loc){
                newArr[i] = arr[i+1];
            }else if(i>loc){
                newArr[i] = arr[i+1];
            }
        }
        System.out.println("Updated array : ");
        for(int i=0;i<newArr.length;i++){
            System.out.println(newArr[i]+" ");
        }
    }
}
