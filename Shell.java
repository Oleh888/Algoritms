package Chapter2Sorts;

import java.util.Arrays;

public class Shell {
    public static void sort(Comparable[]a){
        int h=1;
        while (h<a.length/3) h=3*h+1;
        while (h>=1) {
            for (int i = h; i <a.length ; i++) {
                for (int j = i; j >=h && a[j].compareTo(a[j-h])<0; j-=h) {
                    Comparable t=a[j]; a[j]=a[j-h]; a[j-h]=t;}}
                h=h/3;
            }
        }
    public static void main(String[] args) {
        Comparable[] a ={-6,5,-9,0,89,-4,23};
        Shell.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
