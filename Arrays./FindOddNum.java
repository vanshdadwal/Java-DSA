public class FindOddNum {
    public static void main(String[] args) {
        int arr[]={2,7,8,11,14,15};
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println("odd:-"+arr[i]);
            }
        }
    }
}
