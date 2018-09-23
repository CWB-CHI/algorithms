package sort.mergesort;

import java.util.Arrays;

public class MergeSort {

	public static void sort(int[] arr, int low, int height) {
		if (low < height) {
			int mid = (low + height) / 2;
			sort(arr, low, mid);
			sort(arr, mid + 1, height);
			merge(arr, low, mid, height);

		}
	}

	private static void merge(int[] arr, int low, int mid, int height) {
		int a1Len = mid - low + 1;
		int a2Len = height - mid;
		int[] a1 = new int[a1Len];
		int[] a2 = new int[a2Len];
		for (int i = 0; i < a1Len; i++) {
			a1[i] = arr[low + i];
		}
		for (int i = 0; i < a2Len; i++) {
			a2[i] = arr[mid + 1 + i];
		}
		int i = 0;
		int j = 0;
		int index = low;
		while (i < a1Len && j < a2Len) {
			if (a1[i] <= a2[j]) {
				arr[index++] = a1[i++];
			} else {
				arr[index++] = a2[j++];
			}
		}
		while (i < a1Len)
			arr[index++] = a1[i++];
		while (j < a2Len)
			arr[index++] = a2[j++];

	}

	public static void main(String args[]) {
		int arr[] = { 12, 11, 1, 13, 5, 6, 7 };

		System.out.println(Arrays.toString(arr));
		sort(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));
	}
}
