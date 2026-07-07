import java.util.ArrayList;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in); 
		 ArrayList<Integer> numlist = new ArrayList<Integer>();
		 System.out.println("Length = "+numlist.size());
		 numlist.add(11);
		 numlist.add(112);
		 numlist.add(113);
		 numlist.add(114);
		 numlist.add(115);
		 System.out.println("Length = "+numlist.size());
		 System.out.print(numlist);
		 
		 System.out.print("\nEnter u index to update: ");
		 int index_update=scan.nextInt();
		 
		 System.out.print("\nEnter u Element to update: ");
		 int element_update=scan.nextInt();
		 
		 numlist.set(index_update, element_update);
		 System.out.print(numlist);
		 
		 System.out.print("\nEnter index to ReMove: ");
		 int index_remove = scan.nextInt();
		 numlist.remove(index_remove);
		 System.out.print(numlist);
		 
		 
		 System.out.print("\nEnter element to ReMove: ");
		 int element_remove = scan.nextInt();
		 
		 numlist.remove(Integer.valueOf(element_remove));
		 System.out.print(numlist);
		 
	}

}
