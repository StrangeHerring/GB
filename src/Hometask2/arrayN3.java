package Hometask2;

import java.util.Arrays;

public class arrayN3 {
    public static void main(String[] args) {
        int[] array = new int[8];
        int j = 0;
        for(int i = 0; i < array.length; i++){
            array[i] = j;
            j = j + 3;
        }
        System.out.println(Arrays.toString(array));
    }
}
