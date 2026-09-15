
public class TestApp {

	public static void main(String[] args) {
		// --01 bubbleSort 1 --> 100   
		System.out.println("NO 01 bubbleSort 1 --> 100");
		int[] num =  {25, 11, 45, 6, 87, 20, 78, 64} ;
		Sorting sort = new Sorting(num);
		sort.bubbleSort();
		sort.printSortedData();
		// --01.1 bubbleSort 100 --> 1
		System.out.println();
		System.out.println("NO 01.1 bubbleSort 100 --> 1");
		sort.bubbleSort(true);
		sort.printSortedData();
		System.out.println();
		
		// --02 selectionSort
		System.out.println();
		System.out.println("NO 02 selectionSort");
		sort.selectionSort();
		sort.printSortedData();
		System.out.println();
		
		//--04 insertionSort
		System.out.println();
		System.out.println("NO 04 insertionSort");
		int[] num2 = {68, 10, 87, 75, 14, 36, 98, 76}; 
		Sorting sort2 = new Sorting(num2);
		sort2.insertionSort();
		sort2.printSortedData();
		System.out.println();
		
		//--06
		System.out.println();
		System.out.println("NO 06 Quick Sort");
		int[] num3 =  {87, 11, 26, 35, 49, 85, 21, 46};
		Sorting sort3 = new Sorting(num3);
		sort3.quicksort();
		sort3.printSortedData();
		
	}

}
