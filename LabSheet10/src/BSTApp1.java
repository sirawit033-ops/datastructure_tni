
public class BSTApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree = new BinarySearchTree();
		tree.sampleTree1();
		tree.printTree(tree.getRoot(), 0);

		System.out.println("");
		System.out.println("Minimum Node is " + tree.findMinimum(tree.getRoot()).data);
		System.out.println("Maximum Node is " + tree.findMaximum(tree.getRoot()).data);

		// NO.5
		int target = 40; 
		System.out.println("Is " + target + " in BST => " + tree.findSpecificData(target));

		// NO.6
		int delNode = 60; //แก้ที่จะลบตรงนี้ 
		tree.searchDeleteNode(delNode);

		// NO7
		tree.searchDeleteNode(delNode);

		if (tree.getDeleteNode() != null) {

			System.out.println("Parent is " + tree.getParent().data);
			System.out.println("Delete Node is " + tree.getDeleteNode().data);
			
		// NO8 + 9
			tree.delete(delNode);

	        System.out.println("");
	        System.out.println("After Delete: "+delNode);

	        tree.printTree(tree.getRoot(), 0);
			
			
			System.out.println("-----------------------");

		}
	}
}
