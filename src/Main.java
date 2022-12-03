import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 5};
        System.out.println(Arrays.toString(array));

        int[] array1 = new int[1000];
        for (int x = 0; x <= array1.length - 1; x++) {
            array1[x] = x + 1;
        }
        System.out.println(array1);

        int[] array3 = {1, 4, 10, 17, 20, 25, 30, 35, 38, 40, 42, 45, 50};
        for (int i = 0; i <= array3.length - 1; i++) {
            if (array3[i] % 5 == 0) {
                System.out.println(array3[i]);
            }

        }

        int[] array4 = {1, 4, 7, 10, 14, 18, 20, 22, 25, 28, 29, 30};
        for (int a = 0; a <= array4.length - 1; a++) {
            if (array4[a] % 2 == 0) {
                System.out.println(array4[a]);
            }
        }

        int[] array5 = {45, 784, 68, 78, 97};
        //reverseArray = {54,487,87,79}
        int[] reversArr = new int[array5.length];
        for (int i = 0; i < array5.length; i++) {
            int el = array5[i];
            int reversEl = 0;
            while (el != 0) {
                reversEl = reversEl * 10 + el % 10;
                el = el / 10;
            }
            reversArr[i] = reversEl;

        }
        for (int i = 0; i < reversArr.length; i++) {
            System.out.println(reversArr[i] + " ");
        }

        int[] array6 = {45, 784, 68, 78, 97};
        int[] reversAr = new int[array6.length];
        for (int i = array6.length;j=0;j++; i >=0 ; i--) {
            reversAr[j]=array6[i];}
        int []arr={4,5,7,5,4};//tany

        int []arm ={4,5,7,5,4,0,8,0,1,9};
        int countofZerro = 0;
        for (int i = 0; i < arm.length; i++) {
            if (arm[i]==0);{countofZerro++};


        }
    }
}

