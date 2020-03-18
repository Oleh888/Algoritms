package Chapter2Sorts;

import java.util.Arrays;

public class Insertion {
    public static void sort (Comparable[]a) {
        for (int i = 0; i <a.length ; i++) {
            for (int j = i; j >0 && a[j].compareTo(a[j-1])<0; j--) {
                Comparable t=a[j]; a[j]=a[j-1]; a[j-1]=t;
            }
        }
    }

        public static void main(String[] args) {
            Comparable[] a ={-6,5,-9,0,89,-4,23};
            Insertion.sort(a);
            System.out.println(Arrays.toString(a));
        }
    }

