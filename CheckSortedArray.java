import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		    
		}
		int c=0;
		for(int i=0;i<n-2;i++)
		{
		    if(arr[i]<arr[i+1])
		    {
		        
		    }
		    else{
		        c=1;
		        break;
		    }
		}
		if(c==0)
		{
		System.out.print("true");
		}
		if(c==1)
		{
		    System.out.print("false");
		}
	}
}
