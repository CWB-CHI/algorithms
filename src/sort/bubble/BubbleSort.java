package sort.bubble;

import java.util.Arrays;

public class BubbleSort {
	public static void sort1(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void sort2(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			boolean swap = false;
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
					swap = true;
				}
			}

			if (!swap) {
				return;
			}
		}
	}

	public static void main(String[] args) {
		int[] a = new int[] { 23, 1, 28, 4, 3, 45, 2, 42, 33 };
		BubbleSort.sort1(a);
		System.out.println(Arrays.toString(a));
	}
}
