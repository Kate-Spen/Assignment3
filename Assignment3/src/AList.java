public class AList {
    private static final int initialCapacity = 10;
    private Song[] songs;
    private int size;
    public AList(){
        songs = new Song[initialCapacity];
        size = 0;
    }
    public void addy(Song p){
        if(size == songs.length){
            resize();
        }
        songs[size] = p;
        size ++;
    }
    public void removey(int pos){
        if (pos < 0 || pos >= size){
            System.out.println("Invalid position");
        }
        for (int i = pos; i < size - 1; i++){
            songs[i] = songs[i + 1];
        }
        songs[size-1] = null;
        size--;
    }
    private void resize(){
        int newCapacity = songs.length + 1;
        Song[] newArray = new Song[newCapacity];
        for (int i = 0; i < size; i++){
            newArray[i] = songs[i];
        }
        songs = newArray;
    }
    public String toString(){
        String result = "";
        for (int i = 0; i < size; i++){
            result += songs[i].toString();
        }
        return result;
    }
}
