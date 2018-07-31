package sort.heap;

import java.util.Arrays;

public class HeapSort {
	public void sort(int[] arr) {
		// initiate and rearrange array
		// find the index of the last lowest level non-leave node, and use heapify from
		// it to root.
		// the index = the size of array / 2 - 1
		for (int i = arr.length / 2 - 1; i >= 0; i--) {
			heapify(arr, arr.length, i);
		}

		// Minimize the tree by removing the root to the last element of the tree.
		for (int i = arr.length - 1; i > 0; i--) {
			// swap the root and the last element of the tree
			int root = arr[0];
			arr[0] = arr[i];
			arr[i] = root;

			heapify(arr, i, 0);
		}

	}

	public void heapify(int[] arr, int len, int root_index) {
		// i is the root index of the subtree or tree
		int largest_index = root_index;

		// compare left and right
		int left = root_index * 2 + 1;
		int right = root_index * 2 + 2;
		if (left < len && arr[left] > arr[largest_index]) {
			largest_index = left;
		}
		if (right < len && arr[right] > arr[largest_index]) {
			largest_index = right;
		}
		// there is a child node bigger than root
		if (largest_index != root_index) {
			// swap
			int swap = arr[largest_index];
			arr[largest_index] = arr[root_index];
			arr[root_index] = swap;

			// after swap, the sub tree rooted largest_index may not satisfy the heap
			// attribute( children should less [or more] than root)
			// Recursively heapify the largest_index rooted subtree.
			heapify(arr, len, largest_index);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		int n = arr.length;

		HeapSort ob = new HeapSort();
		ob.sort(arr);

		System.out.println(Arrays.toString(arr));

	}
}
