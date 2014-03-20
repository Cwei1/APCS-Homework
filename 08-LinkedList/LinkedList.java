public class LinkedList{
    private Node head;

    public LinkedList(){
		head=null;
    }

    public void add(String s){
		Node tmp=new Node(s);
		tmp.setNext(head);
		head=tmp;
    }

    public void add(int i, String s){
		Node addition=new Node(s);
		Node tmp=head;
		i-=1;
		while (i>0){
		    tmp=tmp.getNext();
		    i--;
		}
		addition.setNext(tmp.getNext());
		tmp.setNext(addition);
    }
    
    public String get(int i){
		Node tmp=head;
		while (i>0){
		    tmp=tmp.getNext();
		    i--;
		}
		return tmp.getData();
    }
    
    public String set(int i, String s){
    	Node addition=new Node(s);
		Node tmp=head;
		i-=1;
		while (i>0){
		    tmp=tmp.getNext();
		    i--;
		}
		addition.setNext(tmp.getNext().getNext());
		tmp.setNext(addition);
		return tmp.getNext().getData();
    }

    public String remove(int i){
		Node tmp=head;
		i-=1;
		while (i>0){
		    tmp=tmp.getNext();
		    i--;
		}
		String retStr=tmp.getNext().getData();
		tmp.setNext(tmp.getNext().getNext());
		return retStr;
    }

    public int find(String s){
    	Node tmp=head;
    	int index=0;
    	for (Node x=head;!(x==null);x=x.getNext()){
		    if (x.getData()==s){
		    	break;
		    }
		    else{
		    	index++;
		    }
		}
		return index;
    }

    public int length(){
    	int length=0;
    	for (Node x=head;!(x==null);x=x.getNext()){
    		length++;
    	}
    	return length;
    }

    public String toString(){
		String s="{ ";
		for (Node x=head;!(x==null);x=x.getNext()){
		    s+=x+" ";
		}
	    return s+"}";
    }

    public static void main(String[] args){
		LinkedList x= new LinkedList();
		x.add("Bob");
		x.add("John");
		x.add("Juan");
		x.add("Zamansky");
		x.add("Hello");

		System.out.println(x);

		x.add(3, "Inserted");
		System.out.println("Added: "+x.get(3));
		System.out.println(x);

		System.out.println("Replaced: "+x.set(3, "NewInsert"));
		System.out.println(x);

		System.out.println("Removed: "+x.remove(2));
		System.out.println(x);

		System.out.println("Found at index : "+x.find("John"));
		System.out.println(x);

		System.out.println("length: "+x.length());
		System.out.println(x);
    }
}