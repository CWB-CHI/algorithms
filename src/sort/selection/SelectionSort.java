package sort.selection;

import java.util.Arrays;

public class SelectionSort {
	public static void sort1(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			int min = a[minIndex];
			a[minIndex] = a[i];
			a[i] = min;
		}
	}

	public static void main(String[] args) {
		int[] a = new int[] { 23, 1, 28, 4, 3, 45, 2, 42, 33 };
		SelectionSort.sort1(a);
		System.out.println(Arrays.toString(a));
	}
}
