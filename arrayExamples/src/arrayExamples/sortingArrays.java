package arrayExamples;

public class sortingArrays {

	public static void main(String[] args) {
		int [] array = {2,9,5,4,8,1,6};
		selectionSort(array);
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		
	}
	
	public static void selectionSort(int [] list) {
		int arrayLength = list.length;
		for(int i = 0; i < arrayLength; i++) {
			int currentMin = list[i];
			int minIndex = i;
			for(int j = i + 1; j < arrayLength; j++) {
				if(currentMin > list[j]) {
					currentMin = list[j];
					minIndex = j;
				}
			}
			if(minIndex != i) {
				list[minIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
}
