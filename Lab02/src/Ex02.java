import java.util.Scanner;

public class Ex02 {
	public static void main(String[]args) {
		//
		Scanner scan = new Scanner(System.in);
		int[] num=new int[5];
		for (int i=0;i<num.length;i++) {
			System.out.print("Enter Number inDex"+i+": " );
			num[i]=scan.nextInt();
		}
		NumArrayController displayNum = new NumArrayController();
		displayNum.setnumbers(num);
		displayNum.display("Display All element");
	}
}
