package sort.quciksort;

import java.util.Arrays;

public class QuickSort {

	public static int partition(int[] arr, int low, int height) {

		int pivot = arr[height];

		int i = low - 1;

		for (int j = low; j <= height - 1; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		i++;
		int temp = arr[i];
		arr[i] = arr[height];
		arr[height] = temp;
		return i;
	}

	public static void sort(int[] arr, int low, int height) {
		if (low < height) {
			// 用最后一个元素做pivot，然后分成两部分，比pivot小的放左边，大的放右边，pivot放在中间
			int pivotIndex = partition(arr, low, height);
			// 对左边和右边的进行同样的操作
			sort(arr, low, pivotIndex - 1);
			sort(arr, pivotIndex + 1, height);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 10, 7, 8, 9, 1, 5 };
		int n = arr.length;
		System.out.println(Arrays.toString(arr));

		sort(arr, 0, n - 1);
		System.out.println(Arrays.toString(arr));
	}

}
