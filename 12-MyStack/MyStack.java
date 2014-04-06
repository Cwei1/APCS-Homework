public class MyStack {

	private String[] stack;
    private Node top;
    private int numElts;

    public MyStack(){
    	stack=new String[10];
		top = null;
		numElts = 0;
    }

    private void expand(){
    	String[] another=new String[stack.length+1];
    	for (int x = 0; x<stack.length;x++){
    		another[x]=stack[x];
    	}
    	stack=another;
    }

    public  void push(String s){
    	if (numElts==stack.length){
    		expand();
    	}
    	stack[numElts]=s;
		numElts = numElts+1;
    }

    public String pop() {
    	String tmp=stack[numElts-1];
		stack[numElts-1]=null;
		numElts--;
		return tmp;
    }

    public String peek() {
		return stack[0];
    }

    public boolean isEmpty() {
		return stack[0] == null;
    }

    public int getSize() {
		return numElts;
    }
    
    public String toString(){
		String tmp = "";
		for (int i=0; i<numElts;i++){
			tmp+=stack[i];
		}
		return tmp;
    }
}