
public class BinaryTree {

	private Node root;

	public BinaryTree() {
		root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void printTree(Node node, int depth) {
		if (node != null) {
			printTree(node.right, depth + 1);
			System.out.println("    ".repeat(depth) + node.data);
			printTree(node.left, depth + 1);
		}
	}

	public void createTree1() {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

	}

	public void createTree2() {
		root = new Node(15);
		root.left = new Node(8);
		root.left.left = new Node(4);
		root.left.left.left = new Node(2);
		root.left.right = new Node(11);
		root.right = new Node(23);
		root.right.left = new Node(19);
		root.right.left.right = new Node(20);

	}

	public void createTree3() {
		root = new Node(50);
		root.left = new Node(10);
		root.right = new Node(22);
		root.left.left = new Node(11);
		root.left.right = new Node(12);
		root.right.right = new Node(24);
		root.right.right.left = new Node(23);

	}

	public void createTree4() {
		int[] num = { 10, 8, 15, 2, 9, 18, 14, 20, 11, 17 };
		for (int i = 0; i < num.length; i++) {
			insert(num[i]);
		}
	}

	public void createTree5() {
		int[] num = { 50, 30, 70, 10, 40, 60, 20, 45, 55, 65, 25 };
		for (int i = 0; i < num.length; i++) {
			insert(num[i]);
		}

	}

	public void createTree6() {
		int[] num = { 40,20,70,30,55,85,25,35,80,32 };
		for (int i = 0; i < num.length; i++) {
			insert(num[i]);
		}
	}

	public void insert(int new_data) {
		if (root == null) {
			root = new Node(new_data);
		} else {
			Node current_node = root;
			while (true) {
				if (new_data < current_node.data) {
					if (current_node.left == null) {
						current_node.left = new Node(new_data);
						break;
					}
					current_node = current_node.left;
				} else if (new_data > current_node.data) {
					if (current_node.right == null) {
						current_node.right = new Node(new_data);
						break;
					}
					current_node = current_node.right;

				}
			}
		}
	}

}
