import java.util.Scanner;
public class Lab_4_24{
    public static void main(String[] args) {
        int ar[] = {2,4,10,12,17,18};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to delete ");
        int x = sc.nextInt();
        int newar[] = new int[ar.length-1];
        for(int i=0;i<newar.length;i++){
            if(ar[i]<x){
                newar[i] = ar[i];
            }else if(ar[i]==x){
                newar[i] = ar[i+1];
            }else if(ar[i]>x){
                newar[i] = ar[i+1];
            }
        }
        for(int i=0;i<newar.length;i++){
            System.out.print(newar[i]+" ");
        }
    }
}