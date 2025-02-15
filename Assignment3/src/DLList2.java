public class DLList2<T>{
    private DLNode2<T> head;
    private int size;
    public DLList2(){
        head = null;
        size = 0;
    }
    public void addy(T element){
        DLNode2<T> newNode = new DLNode2<>(element);
        if (head==null){
            head=newNode;
        }else{
            DLNode2<T> current = head;
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
            DLNode2<T> current = head;
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
        if (size == 0) {
            return "Empty List";
        }
        String result = "";
        DLNode2<T> current = head;
        while (current != null) {
            result += current.data.toString();
            current = current.next;
        }
        return result;
    }
}