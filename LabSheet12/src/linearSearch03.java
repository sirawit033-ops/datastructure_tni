import java.util.ArrayList;
import java.util.Scanner;

public class linearSearch03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		BinarySearchTree tree = new BinarySearchTree();
		tree.sampleTree();
		tree.printTree(tree.getRoot(), 0);

		ArrayList<Integer> list = traversal(tree.getRoot());
		System.out.println("Traversal order " + list);

		int[] nums = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			nums[i] = list.get(i);
		}

		System.out.print("\nEnter target: ");
		int target = scan.nextInt();

		int index = linearSearch(nums, target);

		if (index != -1) {
			System.out.println("The target (" + target + ") at index " + index);
		} else {
			System.err.println("Cannot found " + target + " in this tree");
		}
	}

	public static ArrayList<Integer> traversal(Node root) {
		ArrayList<Integer> list = new ArrayList<>();
		preOrder(root, list);
		return list;
	}

	private static void preOrder(Node node, ArrayList<Integer> list) {
		if (node != null) {
			list.add(node.data);
			preOrder(node.left, list);
			preOrder(node.right, list);
		}
	}

	public static int linearSearch(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
		}
		return -1;
	}
}