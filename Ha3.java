package Algo;

public class Ha3 {

        public static void main(String[] args) {
            int[] array1 = {1, 3, 5, 7, 20, 25};
            int[] array2 = {2, 4, 6, 10, 12};
            System.out.println(union(array1,array2,5));
        }

        public static int union(int[] arr1, int[] arr2, int k) {
            int i = 0;
            int j = 0;
            int m = 0;
            int[] result = new int[arr1.length + arr2.length];
            while (i < arr1.length && j < arr2.length) {
                if (arr1[i] < arr2[j]) {
                    result[m++] = arr1[i++];
                }
                else result[m++] = arr2[j++];
            }
            while (i < arr1.length) result[m++] = arr1[i++];
            while (j < arr2.length) result[m++] = arr2[j++];
            return result[k-1];
        }

    }

