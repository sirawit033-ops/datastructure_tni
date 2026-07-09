import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        for (int num : initial_numbers) {
            numbers.add(num);
        }
        System.out.println("ข้อมูลเริ่มต้นใน numbers: " + numbers);

        System.out.print("ป้อนตัวเลขเพื่อเพิ่มต่อท้าย: ");
        int appendNum = scanner.nextInt();
        numbers.add(appendNum); // .add(value) จะเป็นการต่อท้ายอัตโนมัติ

        int lastDigit = 6;
        System.out.print("ป้อนตัวเลขเพื่อแทรกที่ตำแหน่ง " + lastDigit + ": ");
        int insertNum = scanner.nextInt();
        numbers.add(lastDigit, insertNum);

        int secondLastDigit = 6;
        numbers.remove(secondLastDigit);
        System.out.println("-> ลบข้อมูลที่ตำแหน่ง " + secondLastDigit + " เรียบร้อยแล้ว");

        int thirdLastDigit = 1;
        int studyDate = 7;
        numbers.set(thirdLastDigit, studyDate);
        System.out.println("-> อัปเดตตำแหน่ง " + thirdLastDigit + " เป็นค่า " + studyDate + " เรียบร้อยแล้ว");

        System.out.println("--- ผลลัพธ์สุดท้าย ---");
        System.out.println("ข้อมูลใน ArrayList ของนักศึกษา: " + numbers);

        scanner.close();
    }
}