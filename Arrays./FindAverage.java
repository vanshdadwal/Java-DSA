public class arr2 {
    public static void main(String[] args) {
        int arr[] = {2,7,8,11,14,15};
       int  sum =0;
        for(int i =0;i<arr.length;i++){
            sum = sum +arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println("Average-:"+avg);
    }
}
