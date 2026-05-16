public class arr15 {
    public static void main(String[] args) {
        int [] arr = {2,3,6,2,8,3,7,9,6};
        for (int i =0;i<arr.length;i++){
            for (int j= i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("duplicate-:"+arr[i]);
                }
            }
        }
    }
}
