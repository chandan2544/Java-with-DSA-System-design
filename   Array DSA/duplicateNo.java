// program to check the duplicate element  in an array
//TC = O(n pow 2)

public class duplicateNo {
    public static void main(String[] args) {
        int arr[]={2,3,3,6,6};
        int n=arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]==arr[j]) {
                    System.out.println("duplicate element found is "+arr[i]);
                }
            }
        }
    }
}
