import java.io.*;
import java.util.*;

public class ArrayStack
{
    Integer[] a;
    int n;

    int size() {
        return n;
    }

    Integer get(int i) {
        if (i < 0 || i > n - 1) throw new IndexOutOfBoundsException();
        return a[i];
    }

    Integer set(int i, Integer x) {
        if (i < 0 || i > n - 1) throw new IndexOutOfBoundsException();
        Integer y = a[i];
        a[i] = x;
        return y;
    }

    void add(int i, Integer x) {
        if (i < 0 || i > n) throw new IndexOutOfBoundsException();
        if (n + 1 > a.length) resize();
        for (int j = n; j > i; j--)
            a[j] = a[j-1];
        a[i] = x;
        n++;
    }

    Integer remove(int i) {
        if (i < 0 || i > n - 1) throw new IndexOutOfBoundsException();
        Integer x = a[i];
        for (int j = i; j < n-1; j++)
            a[j] = a[j+1];
        n--;
        if (a.length >= 3*n) resize();
        return x;
    }

    void resize() {
        Integer[] b = new Integer[Math.max(n*2,1)];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        a = b;
    }

}