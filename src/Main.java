import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
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

            }

        }












