import java.util.Scanner;

public class SinglyApp {

    public static SinglyLinkedList list1 = new SinglyLinkedList();
    public static SinglyLinkedList list2 = new SinglyLinkedList();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Test method 'append()'\n------------------------------");
        testAppend();

        System.out.println("\nTest method 'get()'\n------------------------------");
        testGet();

        System.out.println("\nTest method 'set()'\n------------------------------");
        testSet();

        System.out.println("\nTest method 'contains()'\n------------------------------");
        testContains();

        System.out.println("\nTest method 'addAll()'\n------------------------------");
        testAddAll();

    }

    // 1. testAppend(): เพิ่ม 101 ถึง 105 ลงใน list1 และแสดงผล
    public static void testAppend() {
        for (int i = 101; i <= 105; i++) {
            list1.append(i);
        }
        System.out.println("Current List => " + list1);
    }

    // 2. testGet(): แสดงผลการเข้าถึงตำแหน่ง i=2 และ j=7
    public static void testGet() {
        int i = 2;
        int j = 7;

        Object valI = list1.get(i);
        System.out.println("Get element index " + i + " = " + (valI != null ? valI : "No data"));

        Object valJ = list1.get(j);
        System.out.println("Get element index " + j + " = " + (valJ != null ? valJ : "No data"));
    }

    // 3. testSet(): เปลี่ยนข้อมูลในตำแหน่งที่ 2 และ 7 (เมธอด set() พิมพ์ข้อความ success/fail ในตัวแล้ว)
    public static void testSet() {
        // เปลี่ยนตำแหน่งที่ 2 เป็น 111
        list1.set(2, 111);
        System.out.println("Current List => " + list1);

        // เปลี่ยนตำแหน่งที่ 7 เป็น 222
        list1.set(7, 222);
        System.out.println("Current List => " + list1);
    }

    // 4. testContains(): ตรวจสอบข้อมูล 104 และ 222
    public static void testContains() {
        int find1 = 104;
        int find2 = 222;

        if (list1.contains(find1)) {
            System.out.println(find1 + " found!!");
        } else {
            System.out.println(find1 + " not found...");
        }

        if (list1.contains(find2)) {
            System.out.println(find2 + " found!!");
        } else {
            System.out.println(find2 + " not found...");
        }
    }

    // 5. testAddAll(): ทดสอบการรวม list ตาม 3 ลำดับที่โจทย์กำหนด
    public static void testAddAll() {
        // Step 1: รวม list1 กับ list2 (ตอน list2 ยังว่าง)
        System.out.println("Elements in list1 => " + list1);
        System.out.println("Elements in list2 => " + list2);
        System.out.println("Merge result => " + list1.addAll(list2));

        // Step 2: เพิ่ม 201 ถึง 205 ให้ list2 แล้วรวมกันอีกครั้ง
        for (int i = 201; i <= 205; i++) {
            list2.append(i);
        }
        System.out.println("\nElements in list1 => " + list1);
        System.out.println("Elements in list2 => " + list2);
        System.out.println("Merge result => " + list1.addAll(list2));

        // Step 3: ล้างข้อมูลใน list1 แล้วรวมกับ list2
        list1.clear();
        System.out.println("\nElements in list1 => " + list1);
        System.out.println("Elements in list2 => " + list2);
        System.out.println("Merge result => " + list1.addAll(list2));
    }
}