package Chapter2Sorts;

import java.util.Arrays;

public class Merge {
    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int h0, int hi) {
        if (hi <= h0) return;
        int mid = h0 + (hi - h0) / 2;
        sort(a, h0, mid);
        sort(a, mid + 1, hi);
        merge(a, h0, mid, hi);
    }

    public static void merge(Comparable[] a, int h0, int mid, int hi) {
        aux = new Comparable[a.length];
        int i = h0, j = mid + 1;
        for (int k = h0; k <= hi; k++) aux[k] = a[k];
        for (int k = h0; k <= hi; k++)
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (aux[j].compareTo(aux[i]) < 0) a[k] = aux[j++];
            else a[k] = aux[i++];

    }

    public static void main(String[] args) {
            Comparable[] d = {-6, 5, -9, 0, 89, -4, 23};
            Merge.sort(d);
            System.out.println(Arrays.toString(d));
        }
    }

