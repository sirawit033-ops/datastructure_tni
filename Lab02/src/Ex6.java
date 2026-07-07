
public class Ex6 {

	public static void main(String[] args) {
		// 
		NumArrayController nums =new NumArrayController();
		nums.display("Display an initail dataset");
		int[] copy_nums=new int[nums.getsize()-1];
		
		for (int i=0;i<2;i++) {
			copy_nums[i]=nums.getNumArray()[i];
		}
		for (int i=2+1;i<nums.getsize();i++){
			copy_nums[i-1]=nums.getNumArray()[i];
		}
		nums.setnumbers(copy_nums);
		nums.display("\n\nAfter deleted data in index 2");
	}

}
