
public class TestLinkedNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node node1 = new Node("Alic");
		display(1, node1);
		System.out.println();

		Node node2 = new Node(25);
		display(2, node2);
		System.out.println();

		Node node3 = new Node(true);
		display(3, node3);
		System.out.println();

		Node node4 = new Node(17.5);
		display(4, node4);
		System.out.println();
		
		node1.next.data=node2;
		System.out.println();
		display(1, node1);
		
		node2.next.data=node3;
		System.out.println();
		display(2, node2);
		
		node3.next.data=node4;
		System.out.println();
		display(3, node3);
		

	}

	public static void display(int num_node, Node node) {
		System.out.println("node" + num_node + "data = " + node.data);
		System.out.println("node" + num_node + "address = " + Node.getAddress(node));
		System.out.println("node" + num_node + "Pointer address => " + Node.getAddress(node.next));
	}

}
