public class Lab_4_26 {
    public static void main(String[] args) {
        int ar1[] = {2,4,10,7,11};
        int ar2[] = {3,5,9,10};
        int ar[] = new int[ar1.length+ar2.length];
        for(int i=0;i<ar.length;i++){
            if(i<ar1.length){
                ar[i] = ar1[i];
            }else{
                ar[i] = ar2[i-ar1.length]; 
            }
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
