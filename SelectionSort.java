
public class SelectionSort {

	public static void main(String[] args) {
		int smallest = 0, temp=0;
		int array[] = {7,5,10,12,3,4,1};
		for(int i =0; i<array.length;i++) {
			smallest =i;
			for(int j=0; j< array.length; j++) {
				if (array[smallest]>array[j]) {
					smallest = j;
				}
				}
			temp =array[smallest];
			array[smallest] = array[i];
			array[i] = temp;
		}
		System.out.println("Ascending order");
		for(int i=0;i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
