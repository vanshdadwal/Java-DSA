public class arr13 {
    public static void main(String[] args) {
        int arr[] = {2,4,7,9,15};
        boolean sorted = true;
        for(int i = 0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                sorted =false;
                break;
            }
        }
        if(sorted){
            System.out.println("Array is sorted.....");
        }
        else {
            System.out.println("Array is not sorted.....");
        }
    }
}
