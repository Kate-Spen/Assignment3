public class SLList {
    private SLNode head;
    private int size;
    public SLList(){
        head = null;
        size = 0;
    }
    public void addy(Song s){
        SLNode newNode = new SLNode(s);
        if (head == null){
            head = newNode;
        }else{
            SLNode current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    public void removey(int pos){
        if (pos < 0 || pos >= size){
            System.out.println("Invalid position");
        }
        if (pos == 0){
            head = head.next;
        }else{
            SLNode current = head;
            for (int i = 0; i < pos - 1; i++){
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }
    public String toString(){
        String result = "";
        SLNode current = head;
        while(current != null){
            result += current.song.toString();
            current = current.next;
        }
        return result;
    }
}
