package Implementation;

public class LinkedListclient {
    public static void main(String[] args) throws Exception {
        Linkedlist list = new Linkedlist();
        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(3);
        list.addfirst(4);
        list.display();
        list.addlast(0);
        list.display();
        System.out.println(list.Getatindex(0));
    }
}
