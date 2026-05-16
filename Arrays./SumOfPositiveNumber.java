public class arr16 {
    public static void main(String[] args) {
        int[] arr = {5,-2,8,-7,10,-3};
        int sum=0;
        for(int i =0; i<arr.length;i++){
            if(arr[i]>0){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
