import java.util.Scanner;
public class Lab_4_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,5,7,9,11};
        System.out.println("Enter the number to add in array : ");
        int x = sc.nextInt();
        int newArr[] = new int[arr.length+1];
        boolean flag = true;
        for(int i=0;i<arr.length;i++){
            if(x>arr[i]){
                newArr[i] = arr[i];
                newArr[i+1] = x;
                flag = false;
            }else if(x<arr[i]){
                newArr[i+1]=arr[i];
            }else{
                newArr[i] = arr[i];
            }
        }
        if(flag){
            newArr[0]=x;
        }
        for(int i=0;i<newArr.length;i++){
            System.out.println(newArr[i]+" ");
        }
    }
}
