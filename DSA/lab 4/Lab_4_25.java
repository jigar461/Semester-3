public class Lab_4_25 {
    public static void main(String[] args) {
        int arr[] = {8,9,5,2,10,11,12,8};
        int newArr[] = new int[arr.length-1];
        int temp = 0;
        int dupli = 0;
        int dupliInd = 0;
        for(int i=0;i<arr.length;i++){
            temp = arr[i];
            for(int j=0;j<arr.length;j++){
                if(j!=i && arr[j]==temp){
                    dupli = temp;
                    dupliInd = i;
                    break;
                }
            }
        }
        for(int i=0;i<newArr.length;i++){
            if(i<dupliInd){
                newArr[i] = arr[i];
            }else if(i==dupliInd){
                newArr[i] = arr[i+1];
            }else if(i>dupliInd){
                newArr[i] = arr[i+1];
            }
        }
        for(int i=0;i<newArr.length;i++){
            System.out.println(newArr[i] + " ");
        }
    }
}
