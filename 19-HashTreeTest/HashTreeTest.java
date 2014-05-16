//Cardy Wei, Anish Malhotra
//Pd.1

import java.util.*;

public class HashTreeTest{
    public static void main(String[] args){

	HashMap<Integer, Integer> hash=new HashMap<Integer, Integer>();
	TreeMap<Integer, Integer> tree=new TreeMap<Integer, Integer>();

	//adding values to heap
	long hashbegin=System.currentTimeMillis();
	long hashbeginnano=System.nanoTime();
	for (int i=0;i<10000;i++){
	    hash.put(i, (int)Math.random()*10000);
        }
	long hashend=System.currentTimeMillis();
	long hashendnano=System.nanoTime();
	System.out.println("Time for HashMap adding: "+(hashend-hashbegin)+" milliseconds or "+ (hashendnano-hashbeginnano)+" nanoseconds");

	long treebegin=System.currentTimeMillis();
	long treebeginnano=System.nanoTime();
	for (int x=0; x<10000; x++){
	    tree.put(x, (int)Math.random()*10000);
	}
	long treeend=System.currentTimeMillis();
	long treeendnano=System.nanoTime();
	System.out.println("Time for TreeMap adding: "+(treeend-treebegin)+" milliseconds or "+(treeendnano-treebeginnano)+" nanoseconds");

	hashbegin=System.currentTimeMillis();
	hashbeginnano=System.nanoTime();
	for(int y=0;y<10000;y++){
	    int j=hash.get(y);
	}
	hashend=System.currentTimeMillis();
	hashendnano=System.nanoTime();
	System.out.println("Time for HashMap accessor: "+(hashend-hashbegin)+" milliseconds or "+ (hashendnano-hashbeginnano)+" nanoseconds");

	treebegin=System.currentTimeMillis();
	treebeginnano=System.nanoTime();
	for (int z=0; z<10000; z++){
	    int c=tree.get(z);
	}
	treeend=System.currentTimeMillis();
	treeendnano=System.nanoTime();
	System.out.println("Time for TreeMap accessor: "+(treeend-treebegin)+" milliseconds or "+(treeendnano-treebeginnano)+" nanoseconds");

    }
}