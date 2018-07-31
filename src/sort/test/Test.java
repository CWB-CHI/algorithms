package sort.test;

import java.util.Arrays;

import sort.bubble.BubbleSort;
import sort.heap.HeapSort;
import sort.insertion.InsertionSort;
import sort.selection.SelectionSort;

public class Test {
	private static long t = 0;

	private static void s() {
		t = System.currentTimeMillis();
	}

	private static void e() {
		System.out.println(System.currentTimeMillis() - t);
	}

	private static int[] createArr(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * arr.length);
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = createArr(30000);
		int[] a1 = arr.clone();
		s();
		new HeapSort().sort(a1);
		e();
		s();
		new BubbleSort().sort2(arr.clone());
		e();
		s();
		new SelectionSort().sort1(arr.clone());
		e();		
		s();
		new InsertionSort().sort2(arr.clone());
		e();
		
	}
}
