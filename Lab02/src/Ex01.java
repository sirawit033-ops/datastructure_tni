
public class Ex01 {
	
	public static void main(String[]args) {
		int[]num= {23, 67, 8, 91, 45, 12, 78};
		System.out.println(num.length);
		System.out.println(num[0]);
		System.out.println(num[num.length-1]);
		System.out.println(num[num.length/2]);
		
		for (int i=0; i<num.length;i++) {
			if (i!=0){
				System.out.print(", ");
			}
			System.out.print(num[i]);
		}
		
	}
}
