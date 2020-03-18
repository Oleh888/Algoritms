package Chapter2Sorts;

import java.util.Arrays;

public class BubleSort {
    public static void sort (Comparable arr []) {
        boolean sorted=false;
        while (!sorted) {
            sorted=true;
            for (int i=0; i<arr.length-1; i++) {
                if (arr[i].compareTo(arr[i+1])>0) {
                    Comparable temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    sorted=false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Comparable[] d = {-6, 5, -9, 0, 89, -4, 23};
        sort(d);
        System.out.println(Arrays.toString(d));
    }
}
