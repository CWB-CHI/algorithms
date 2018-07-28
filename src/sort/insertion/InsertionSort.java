package sort.insertion;

import java.util.Arrays;

public class InsertionSort {

	public static void sort1(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int insertIndex = i;
			while (insertIndex > 0 && a[insertIndex] < a[insertIndex - 1]) {
				int temp = a[insertIndex];
				a[insertIndex] = a[insertIndex - 1];
				a[insertIndex - 1] = temp;
				insertIndex--;
			}
		}
	}

	public static void sort2(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			
			a[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		int[] a = new int[] { 23, 1, 28, 4, 3, 45, 2, 42, 33 };
		InsertionSort.sort2(a);
		System.out.println(Arrays.toString(a));

	}
}
