class Node {
    public int data;
    public Node next;

    public Node(int value) {
        this.data = value;
        this.next = null;
    }
}

public class SinglyLinkedList {
    private Node head;
    private Node tail;

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    public String displayList() {
        boolean first = true;
        String display = "[";
        for (Node current = head; current != null; current = current.next) {
            display += (!first ? ", " : "") + current.data;
            first = false;
        }
        display += "]";
        return display;
    }

    // Override toString เพื่อให้ System.out.println(list) แสดงผล [101, 102, ...] ตามต้องการ
    @Override
    public String toString() {
        return displayList();
    }

    public void clear() {
        head = null;
        tail = null;
    }

    // 1. isEmpty(): ตรวจสอบว่า list ว่างเปล่าหรือไม่
    public boolean isEmpty() {
        return head == null;
    }

    // 2. append(): เพิ่ม node ต่อท้าย list
    public void append(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // 3. get(): คืนค่าข้อมูลใน node ตาม position ที่กำหนด (เริ่มนับที่ index 0 หรือ 1 ตามการวนลูป)
    // จากโจทย์ SinglyApp: index 2 ได้ 103 (จาก list 101,102,103,...) แสดงว่าเป็น 0-based index
    public Object get(int position) {
        if (position < 0 || isEmpty()) {
            return null;
        }
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == position) {
                return current.data;
            }
            current = current.next;
            count++;
        }
        return null; // ถ้าตำแหน่งเกินขนาด list
    }

    // 4. set(): เปลี่ยนข้อมูลใน node ตาม position ที่กำหนด และแสดงผลข้อความตามเงื่อนไขโจทย์
    public void set(int position, int value) {
        if (position < 0 || isEmpty()) {
            System.out.println("Updated data fail...");
            return;
        }

        Node current = head;
        int count = 0;
        boolean updated = false;

        while (current != null) {
            if (count == position) {
                current.data = value;
                updated = true;
                break;
            }
            current = current.next;
            count++;
        }

        if (updated) {
            System.out.println("Updated data success!!");
        } else {
            System.out.println("Updated data fail...");
        }
    }

    // 5. contains(): ค้นหาข้อมูลที่กำหนดว่ามีอยู่ใน list หรือไม่
    public boolean contains(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // 6. addAll(): เชื่อมระหว่าง list ปัจจุบัน และ otherlist เข้าด้วยกัน
    public String addAll(SinglyLinkedList otherlist) {
        SinglyLinkedList result = new SinglyLinkedList();

        // 1. เพิ่มข้อมูลจาก list ปัจจุบัน (this) เข้าไปใน result
        Node current = this.head;
        while (current != null) {
            result.append(current.data);
            current = current.next;
        }

        // 2. เพิ่มข้อมูลจาก otherlist เข้าไปใน result (ถ้า otherlist ไม่ว่าง)
        if (otherlist != null) {
            Node otherCurrent = otherlist.head;
            while (otherCurrent != null) {
                result.append(otherCurrent.data);
                otherCurrent = otherCurrent.next;
            }
        }

        return result.displayList();
    }
}