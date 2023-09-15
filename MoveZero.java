import java.util.Arrays;
import java.util.Scanner;

public class MoveZero {
    //optimal solution:

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                k=i;
                break;
            }
        }
        for(int i=k+1;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                k++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
