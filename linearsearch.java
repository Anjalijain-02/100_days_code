import java.util.Scanner;

public class linearsearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int index=-1;
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
           if(arr[i]==k)
        {
            index=i;
        }}
        System.out.println(index);
    }
}
