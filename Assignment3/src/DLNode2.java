public class DLNode2<T>{
    T data;
    DLNode2<T> next;
    DLNode2<T> prev;
    public DLNode2(T data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
