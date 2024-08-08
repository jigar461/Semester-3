public class Lab_19_92{
    static int[] bubblesort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=arr.length-2;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int[] arr = {20,15,5,100,-1,50,30,7,10,2,10,25,300,1};
        int[] newArr = bubblesort(arr);
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }
}