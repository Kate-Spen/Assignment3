public class Main {
    public static void main(String[] args) {
        AList arrayList = new AList();
        SLList singlyLinkedList = new SLList();
        DLList doublyLinkedList = new DLList();
        AList2 arrayList2 = new AList2<>();
        SLList2 singlyLinkedList2 = new SLList2<>();
        DLList2 doublyLinkedList2 = new DLList2<>();

        Song song1 = new Song("My Way", "Frank Sinatra", 4.30);
        Song song2 = new Song("Gangnam Style", "PSY", 4.00);
        Song song3 = new Song("Best Day Ever", "Spongebob", 3.24);

        System.out.println("Testing AList:");
        arrayList.addy(song1);
        arrayList.addy(song2);
        arrayList.addy(song3);
        System.out.println("After adding songs:");
        System.out.println(arrayList);
        arrayList.removey(1);
        System.out.println("After removing song at position 1:");
        System.out.println(arrayList);

        System.out.println("\nTesting SLList:");
        singlyLinkedList.addy(song1);
        singlyLinkedList.addy(song2);
        singlyLinkedList.addy(song3);
        System.out.println("After adding songs:");
        System.out.println(singlyLinkedList);
        singlyLinkedList.removey(1);
        System.out.println("After removing song at position 1:");
        System.out.println(singlyLinkedList);

        System.out.println("\nTesting DLList:");
        doublyLinkedList.addy(song1);
        doublyLinkedList.addy(song2);
        doublyLinkedList.addy(song3);
        System.out.println("After adding songs:");
        System.out.println(doublyLinkedList);
        doublyLinkedList.removey(1);
        System.out.println("After removing song at position 1:");
        System.out.println(doublyLinkedList);

        System.out.println("\nTesting generic AList:");
        arrayList2.addy(song1);
        arrayList2.addy(song2);
        arrayList2.addy(song3);
        System.out.println("After adding songs:");
        System.out.println(arrayList2);
        arrayList2.removey(1);
        System.out.println("After removing song at position 1:");
        System.out.println(arrayList2);

        System.out.println("\nTesting generic SLList:");
        singlyLinkedList2.addy(song1);
        singlyLinkedList2.addy(song2);
        singlyLinkedList2.addy(song3);
        System.out.println("After adding songs:");
        System.out.println(singlyLinkedList2);
        singlyLinkedList2.removey(1);
        System.out.println("After removing song at position 1:");
        System.out.println(singlyLinkedList2);

        System.out.println("\nTesting generic DLList:");
        doublyLinkedList2.addy(song1);
        doublyLinkedList2.addy(song2);
        doublyLinkedList2.addy(song3);
        System.out.println("After adding songs:");
        System.out.println(doublyLinkedList2);
        doublyLinkedList2.removey(1);
        System.out.println("After removing song at position 1:");
        System.out.println(doublyLinkedList2);
    }
}