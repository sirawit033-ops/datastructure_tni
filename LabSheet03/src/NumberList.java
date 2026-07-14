
public class NumberList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList numlist = new LinkedList();
		numlist.insert(0, 37);
		numlist.insert(0, 7);
		numlist.insert(0, 4);
		numlist.insert(0, 16);
		System.out.println(numlist.traversal());
		
		numlist.insert(25);
		System.out.println(numlist.traversal());
		
		numlist.remove(0);
		System.out.println(numlist.traversal());
		
		numlist.remove(2);
		System.out.println(numlist.traversal());
		
		numlist.removeLastElement();
		System.out.println(numlist.traversal());
		
		System.out.println("Lenght"+numlist.lenght());
		
		
		
		
		numlist.clear();
		System.out.println(numlist.traversal());
		
}
}
