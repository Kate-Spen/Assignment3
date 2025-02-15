public class SLList2<T> {
    private SLNode2<T> head;
    private int size;
    public SLList2(){
        head = null;
        size = 0;
    }
    public void addy(T element){
        SLNode2<T> newNode = new SLNode2<>(element);
        if (head == null){
            head = newNode;
        }else{
            SLNode2<T> current = head;
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
            SLNode2<T> current = head;
            for (int i = 0; i < pos - 1; i++){
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }
    public String toString(){
        if (size == 0) {
            return "Empty List";
        }
        String result = "";
        SLNode2<T> current = head;
        while (current != null) {
            result += current.data.toString();
            current = current.next;
        }
        return result;
    }
}
