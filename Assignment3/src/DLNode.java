public class DLNode {
    public Song song;
    public DLNode next;
    public DLNode prev;
    public DLNode(Song song){
        this.song = song;
        this.next = null;
        this.prev = null;
    }
}
