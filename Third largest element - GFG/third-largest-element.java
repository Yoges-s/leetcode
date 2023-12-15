//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    if(n < 3){
	        return -1;
	    }
	    
	    PriorityQueue<Integer> heap = new PriorityQueue<>();
	   // PriorityQueue<Integer> pq =new PriorityQueue<>((x, y) -> Integer.compare(y, x));
	    for(int i=0;i<3;i++){
	        heap.add(a[i]);
	    }
	    
	    
	    for(int i=3; i< n; i++){
	        if(heap.peek() < a[i]){
	            heap.poll();
	            heap.add(a[i]);
	        }
	    }
	    
	   // System.out.println(heap);
	    
	    return heap.peek();
	    
    }
}
