import java.util.Arrays;
import java.util.Scanner;

public class ArrangeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        for(int i=0;i<n;i+=2)
        {
            int t= arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=t;
        }
        System.out.print(Arrays.toString(arr));
    }
}
