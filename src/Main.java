import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // xndir 51.
        int x = 437;
        int y = x % 10;
        int z = (x / 10) % 10;
        int w = (x / 100) % 10;
        if (w + z == y) {
            boolean t = true;
            System.out.println(t);
        } else {
            boolean t = false;
            System.out.println(t);
        }
        // xndir 52.
        int a = 223;
        int b = a % 10;
        int c = (a / 10) % 10;
        int d = (a / 100) % 10;
        if (b == c || c == d || d == b) {
            boolean t = true;
            System.out.println(t);
        } else {
            boolean t = false;
            System.out.println(t);
        }
// xndir 53.
        int k = 514 / (5 + 1 + 4);
        int s = 514;
        int l = s % 10;
        int m = (s / 10) % 10;
        int n = (s / 100) % 10;
        if (s > k) {
            boolean t = true;
            System.out.println(t);
        } else {
            System.out.println(l / s);

        }
// xndir 54.
        int q = 427;
        int r = q % 10;
        int u = (q / 10) % 10;
        int v = (q / 100) % 10;
        if (r > u && r > v) {
            System.out.println(r);
        } else if (u > r && u > v) {
            System.out.println(u);
        } else if (v > r && v > u) {
            System.out.println(v);
        }
        // xndir 55.
        int q1 = 815;
        int r1 = q1 % 10;
        int u1 = (q1 / 10) % 10;
        int v1 = (q1 / 100) % 10;
        if (r1 < u1 && r1 < v1) {
            System.out.println(r1);
        } else if (u1 < r1 && u1 < v1) {
            System.out.println(u1);
        } else if (v1 < r1 && v1 < u1) {
            System.out.println(v1);
        }
        // xndir 56.
        int k1 = (6 + 2 + 4) / 624;
        int l1 = 624;
        int s1 = k1 % 10;
        int m1 = (k1 / 10) % 10;
        int n1 = (k1 / 100) % 10;
        if (m1 > s1) {
            System.out.println(k1);
        } else {
            System.out.println(l1);
        }
// xndir 57.
        int x1 = 392;
        int y1 = x1 % 10;
        int z1 = (x1 / 10) % 10;
        int w1 = (x1 / 100) % 10;
        if (x1 > 300) {
            System.out.println(z1 / y1);
        } else {
            System.out.println(w1 / y1);
        }
        // xndir 58.

        int a1 = 481;
        int b1 = a1 % 10;
        int c1 = (a1 / 10) % 10;
        int d1 = (a1 / 100) % 10;
        if (d1 + c1 < 5) {
            char f = 'a';
            System.out.println('a');
        } else {
            char f = 'b';
            System.out.println('b');
        }
        // 201.
        int N = 457;
        int M = 0;
        while (N != 0) {
            M++;
            N = N / 10;
        }
        System.out.println(M);

        // 202.
        int L = 421;
        int S = L % 10;
        int C = (L / 10) % 10;
        int V = (L / 100) % 10;
        int D = S + C + V;
        System.out.println(D);
//211
        int array[] = {4, 8, -14, -22, 11, 12};
        int drakanTveriGumar = 0;
        int drakanTveriQanak = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                drakanTveriQanak++;
                drakanTveriGumar = drakanTveriGumar + array[i];
            }
        }
        System.out.println(drakanTveriGumar / drakanTveriQanak);
        //212
        int array1[] = {4, 8, -14, -22, 11, 12};
        int drakanTveriArt = 1;
        int drakanTveriQanak1 = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] >= 0) {
                drakanTveriQanak1++;
                drakanTveriArt = drakanTveriArt * array[i];
            }
        }
        System.out.println(drakanTveriArt / drakanTveriQanak);
        //213
        int array2[] = {4, 8, -14, -22, 11, 12};
        int bacasakanTveriArt = 1;
        int bacasakanTveriQanak = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < 0) {
                bacasakanTveriQanak++;
                bacasakanTveriArt = bacasakanTveriArt * array[i];
            }
        }
        System.out.println(bacasakanTveriArt / bacasakanTveriQanak);
        //214
        int array3[] = {4, 8, -14, -22, 11, 12};
        int bacasakanTveriGumar = 0;
        int bacasakanTveriQanak5 = 0;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 0) {
                bacasakanTveriQanak5++;
                bacasakanTveriGumar = bacasakanTveriGumar + array3[i];
            }
        }
        System.out.println(bacasakanTveriGumar / bacasakanTveriQanak5);
        //220
        int array4[] = {4, 8, -14, -22, 11, 12};
        int drakanTveriQanak2 = 0;
        int bacasakanTveriQanak2 = 0;
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] < 0) {
                bacasakanTveriQanak2++;
            } else if (array4[i]>0) {drakanTveriQanak2++;

            }
        }
        System.out.println("bacasakanTveriQanak  " +  bacasakanTveriQanak2);
        System.out.println("drakanTveriQanak  "+  drakanTveriQanak2);

    }

}












