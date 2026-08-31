
public class TreeApp2 {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createTree4();
		tree.printTree(tree.getRoot(), 0);
		System.out.println();
		System.out.println("Tree 4");
		System.out.println("---------------------------------------");
		
		
		BinaryTree tree1 = new BinaryTree();
		tree1.createTree5();
		tree1.printTree(tree1.getRoot(), 0);
		System.out.println();
		System.out.println("Tree 5");
		System.out.println("---------------------------------------");
		
		
		BinaryTree tree2 = new BinaryTree();
		tree2.createTree6();
		tree2.printTree(tree2.getRoot(), 0);
		System.out.println();
		System.out.println("Tree 6");
		System.out.println("---------------------------------------");
	}

}
