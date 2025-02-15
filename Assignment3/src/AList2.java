public class AList2<T> {
    private static final int initialCapacity = 10;
    private T[] array;
    private int size;
    public AList2(){
        array = (T[]) new Object[initialCapacity];
        size = 0;
    }
    public void addy(T element){
        if(size == array.length){
            resize();
        }
        array[size] = element;
        size ++;
    }
    public void removey(int pos){
        if (pos < 0 || pos >= size){
            System.out.println("Invalid position");
        }
        for (int i = pos; i < size - 1; i++){
            array[i] = array[i + 1];
        }
        array[size-1] = null;
        size--;
    }
    private void resize(){
        int newCapacity = array.length + 1;
        T[] newArray = (T[]) new Object[newCapacity];
        for (int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }
    public String toString(){
        if (size == 0){
            return "Empty List";
        }
        String result = "";
        for (int i = 0;  i < size; i++){
            result += array[i].toString();
        }
        return result;
    }
}