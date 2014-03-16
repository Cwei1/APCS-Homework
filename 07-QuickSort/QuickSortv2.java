import java.util.*;

//incomplete version.
 
public class QuickSortv2{
 	
    public static int[] qsort(int[] a, int L, int R){
	int wall = L;
	Random random=new Random();
	int y=random.nextInt(R-L)+L;
	int pivot =a[y];
	for(int x = L + 1; x <= R; x++){
	    if(a[x] <= pivot){
		int tmp = a[wall];
		a[wall] = a[x];
		a[x] = tmp;
		wall++;	    
	    }
                 
	}
	a[L] = a[R];
	a[R] = pivot;
             
	return a;
    }
    
    public static void main(String[] args){
	double start=System.nanoTime();
	int [] a = new int[1000];
	Random z=new Random();
	for (int x=0; x<a.length;x++){
	    a[x]=z.nextInt(100000);}
	System.out.println(Arrays.toString(qsort(a,0,a.length - 1)));
	double end=System.nanoTime();
	double total=end-start;
	System.out.println("Time: "+total+" nanoseconds.");
    }
 
}