package Chapter2Sorts;

import java.util.Arrays;

public class Selection {
    public static void sort (Comparable[] a) {
        for (int i = 0; i <a.length ; i++) {
            int min=i;
            for (int j = i+1; j <a.length ; j++)
                if (a[min].compareTo(a[j])>0) min=j;
                Comparable t=a[i]; a[i]=a[min]; a[min]=t;
        }
    }

    public static void main(String[] args) {
        Comparable[] a ={-6,5,-9,0,89,-4,23};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
