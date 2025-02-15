public class DLList {
    private DLNode head;
    private int size;
    public DLList(){
        head = null;
        size = 0;
    }
    public void addy(Song s){
        DLNode newNode = new DLNode(s);
        if (head==null){
            head=newNode;
        }else{
            DLNode current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        size++;
    }
    public void removey(int pos){
        if (pos < 0 || pos >= size){
            System.out.println("Invalid position");
        }
        if (pos == 0){
            head = head.next;
            if (head!= null){
                head.prev = null;
            }
        }else{
            DLNode current = head;
            for (int i = 0; i <pos; i++){
                current = current.next;
            }
            if(current.next !=null){
                current.next.prev = current.prev;
            }
            current.prev.next = current.next;
        }
        size--;
    }
    public String toString(){
        String result = "";
        DLNode current = head;
        while(current != null){
            result += current.song.toString();
            current = current.next;
        }
        return result;
    }
}
