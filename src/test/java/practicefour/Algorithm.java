package practicefour;

public class Algorithm {
   int d[];
	///bubble sort
	public int[] bubbleSort(int[] a){
	    int tmp;
		for(int i = 0;i<a.length;i++)
		   for(int j =a.length-1;j>i;--j)
			   if(a[j]<a[j-1]){
				   tmp = a[j];
		           a[j]=a[j-1];
		           a[j-1]=tmp;
			   }
		return a;
	}
	
	
	///quick sort
	public int partition(int[] a,int left,int right){
		int k = a[left];
		    while(left<right){
		        while(left<right&&a[right]>=k) right--;
		         a[left] = a[right];
		    	
		        while(left<right&&a[left]<=k) left++;
		        a[right] = a[left];
	
		    }

		a[left]=k;
		return left;
	}
	
	public int[] quickSort(int[] a,int left,int right){
		if(left<right){
			int res = partition(a,left,right);
			quickSort(a,left,res-1);
			quickSort(a,res+1,right);
			
		}
		return a;
	}
	
///binarySearch
	public int binarySearch(int[] d,int t,int low,int high){
		int index = 0;
		int m = low+high/2;
		if(d[m]==t)
			index =  m;
		else if(d[m]<t)
		    binarySearch(d,t,m+1,high);
		else
			 binarySearch(d,t,low,m-1);
		return index;
	}
	
   public static void main(String[] args){
		int[] d;
	   int[] data = {44,22,2,32,54,22,88,77,99,11};
	   Algorithm a = new Algorithm();
	
	  /*data = a.bubbleSort(data);
	   for(int i=0;i<data.length;i++)
		   System.out.print(data[i]);*/
	   
	  
	   d=a.quickSort(data,0, data.length-1);
	   for(int i=0;i<d.length;i++){
		   System.out.print(d[i]);
	       System.out.print(" ");
	   }
	   
	   System.out.println(" ");
	   System.out.print(a.binarySearch(data, 32, 0, data.length-1));
	}
	
	
}
