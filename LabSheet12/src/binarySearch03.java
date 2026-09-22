import java.util.ArrayList;
import java.util.Scanner;

public class binarySearch03 {

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

		int index = binarySearch(nums, target);

		if (index != -1) {
			System.out.println("The target (" + target + ") at index " + index);
		} else {
			System.err.println("Cannot found " + target + " in this tree");
		}
	}

	public static ArrayList<Integer> traversal(Node root) {
		ArrayList<Integer> list = new ArrayList<>();
		inOrder(root, list);
		return list;
	}

	private static void inOrder(Node node, ArrayList<Integer> list) {
		if (node != null) {
			inOrder(node.left, list);
			list.add(node.data);
			inOrder(node.right, list);
		}
	}

	public static int binarySearch(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int middle = (low + high) / 2;

			if (nums[middle] == target) {
				return middle;
			}
			if (target < nums[middle]) {
				high = middle - 1;
			} else {
				low = middle + 1;
			}
		}
		return -1;
	}
}