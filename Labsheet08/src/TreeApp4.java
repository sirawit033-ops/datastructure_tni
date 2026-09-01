import java.util.Scanner;

public class TreeApp4 {

	public static void main(String[] args) {
		Scanner AAA = new Scanner(System.in);
		System.out.println("---------------------------------------");
		System.out.println("Binary Tree จาก createTree6() ");
		System.out.println("---------------------------------------");
		BinaryTree tree = new BinaryTree();
		tree.createTree6();
		tree.printTree(tree.getRoot(), 0);
		System.out.println("---------------------------------------");
		System.out.print("Enter N: ");
		int N = AAA.nextInt();

		Node target = tree.search(tree.getRoot(), N);
		// search() อยู่ในฺไฟล์BinaryTree.java
		
		if (target == null) {
			System.out.println("Cannot found Node(data=" + N + ")");
		} else {
			// เช็ค left Child
			if (target.left != null) {
				System.out.println("Left Child: " + target.left.data);
			} else {
				System.out.println("No Left Child");
			}

			// เช็ค Right Child
			if (target.right != null) {
				System.out.println("Right Child: " + target.right.data);
			} else {
				System.out.println("No Right Child");
			}

			// เช็คว่า เป็น Leaf Node หรือไม่
			if (target.left == null && target.right == null) {
				System.out.println(N + " is Leaf Node");
			} else {
				System.out.println(N + " is not Leaf Node");
			}
		}
	}

}
