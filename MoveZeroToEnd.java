import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        // bruteforce approch;
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        int temp[]= new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0) {
                temp[j++]=arr[i];
            }

        }
        System.out.println(Arrays.toString(temp));
    }
}
