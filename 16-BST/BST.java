public class BST{

    private Node root;
    
    public BST(){ 
    	root=null; 
    }
    
    public void insert(Node current, int data){
        if (current==null){
            current=new Node(data);
        }
        else if (data<current.getData()){
            insert(current.getLeft(),data);
        }
        else if (data>current.getData()){
            insert(current.getRight(),data);
        }
    }


    public Node searchI(int data){
        Node temp=root;
        while (temp!=null){
            if (data<temp.getData()){
                temp=temp.getLeft();
            }
            else if (data>temp.getData()){
                temp=temp.getRight();
            }
            else{
                break;
            }
        }
        return temp;
    }
    

    public Node searchR(Node current, int data){
        if (current==null){
            return null;
        }
        else if (data<current.getData()){
            return searchR(current.getLeft(),data);
        }
        else if (data>current.getData()){
            return searchR(current.getRight(),data);
        }
        else{    
            return null;
        }
    }
}