public class PrefixSum {
    public static void main(String[] args) {
        int i=0;
        int[] arr = {3, 1, 4, 1, 5, 9, 2};
        int[] prefix = new int[arr.length];
        prefix[0]=arr[0];
       System.out.println(prefix[0]);
        for (i = 1; i<arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        System.out.println(prefix[i]);
        }
    }
}
