public class TrainLinkedList {

    public static void main(String[] args) {
        // สร้าง Object ของ Class LinkedList ชื่อ greenline
        LinkedList greenline = new LinkedList();

        greenline.insert("Mo-chit");

        // 2.
        greenline.insert("Ari");

        // 3.
        greenline.insert("Sanam-Pao");

        // 4.
        System.out.println("All Stations : " + greenline.traversal());

        // 5.
        greenline.insert(2, "Rachakru");

        // 6.
        System.out.println("All Stations : " + greenline.traversal());

        // 7.
        System.out.println("Total Station: " + greenline.lenght());

        // 8.
        System.out.println("First Station: " + greenline.get(0));

        // 9.
        greenline.set(0, "Mo-Chit (Central Ladprao)");

        // 10.
        System.out.println("All Stations : " + greenline.traversal());

        // 11.
        greenline.remove(2);

        // 12.
        System.out.println("All Stations : " + greenline.traversal());

        // 13.
        greenline.removeLastElement();

        // 14.
        System.out.println("All Stations : " + greenline.traversal());

        // 15.
        greenline.clear();

        // 16.
        System.out.println("Total Station: " + greenline.lenght());

        // 17.
        System.out.println("All Stations : " + greenline.traversal());
    }
}