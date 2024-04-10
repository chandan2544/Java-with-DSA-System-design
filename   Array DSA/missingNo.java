// find the missing no in an array
// TC = O(n)
// SC = O(1)

public class missingNo {
    public static void main(String[] args) {
        int arr[]={1,2,4,7,6,5};
        int n=arr.length;

        // sum of natural numbers in an array
        int naturalNoSum=((n+1)*(n+2))/2;
        int sum=0;

        // sum of current element present in an array
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }

        int missingElement=0;
        missingElement=naturalNoSum-sum;
        System.out.println("mising no in  an array : "+missingElement);

    }
}
