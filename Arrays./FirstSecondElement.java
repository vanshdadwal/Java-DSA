public class arr5 {
    public static void main(String[] args) {
        int arr[]={5,2,18,7,11};
        int max = arr[0];
        int second = arr[0];
        for (int i =0 ; i<arr.length;i++){
            if(arr[i]>max){
                second=max;
                max=arr[i];
            } else if (arr[i]>second && arr[i] < max) {
                second = arr[i];
            }
        }
        System.out.println("max value is :-"+max);
        System.out.println("second highest is -:"+second);
    }
}
