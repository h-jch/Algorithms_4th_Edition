package chapter_2.ch2_1;

import edu.princeton.cs.algs4.In;

/**
 * EX2_1_18
 */
public class EX2_1_18 {

    public static void main(String[] args) {
        String[] a = new In.readStrings();
		String sort = args[0];
		if (sort.equals("selection")) {
			Selection.drawSort(a);
		} else if (sort.equals("insertion")) {
			Insertion.drawSort(a);
		}
    }
}