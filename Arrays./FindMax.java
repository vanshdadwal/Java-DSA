public class arr3 {
    public static void main(String[] args) {
        int arr[]={5,2,18,7,11};
        int max =arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("max num is -:"+max);
    }
}
