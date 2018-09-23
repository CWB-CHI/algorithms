package sort.quciksort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
	public static int partition(int[] arr, int low, int height) {
		int i = low - 1;
		// int pivotIndex = height;
		int pivotIndex = new Random().nextInt(height - low + 1) + low;
		int pivot = arr[pivotIndex];
		arr[pivotIndex] = arr[height];
		arr[height] = pivot;
		for (int j = low; j <= height - 1; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[++i];
		arr[i] = arr[height];
		arr[height] = temp;
		return i;
	}

	public static void quickSort(int[] arr, int low, int height) {
		if (low < height) {
			int pivot = partition(arr, low, height);

			quickSort(arr, low, pivot - 1);
			quickSort(arr, pivot + 1, height);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 10, 7, 8, 9, 1, 5 };
		int n = arr.length;
		System.out.println(Arrays.toString(arr));

		quickSort(arr, 0, n - 1);
		System.out.println(Arrays.toString(arr));
	}
}
