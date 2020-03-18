package Chapter2Sorts;

import java.util.Arrays;

public class Quick {
    public static int partition (Comparable[] a,int h0,int hi) {
        int i=h0, j=hi+1;
        Comparable v=a[h0];
        while (true) {
            while (a[++i].compareTo(v)<0) if (i==hi) break;
            while (v.compareTo(a[--j])<0) if (j==h0) break;
            if (i>=j) break;
            Comparable t=a[i]; a[i]=a[j]; a[j]=t;
        }
        Comparable t=a[h0]; a[h0]=a[j]; a[j]=t;
        return j;
    }
    private static void sort (Comparable[] a) {
        sort(a,0,a.length-1);
    }
    private static void sort (Comparable[] a,int h0, int hi) {
        if (hi<=h0) return;
        int j=partition(a,h0,hi);
        sort(a,h0,j-1);
        sort(a,j+1,hi);
    }

    public static void main(String[] args) {
        Comparable[] d = {-6, 5, -9, 0, 89, -4, 23};
        sort(d);
        System.out.println(Arrays.toString(d));
    }
}
