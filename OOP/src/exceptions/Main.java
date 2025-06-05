package exceptions;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            for (int i = 0; i < arr.length + 1; i++) {
                arr[i] = 1;
            }
        } catch (Exception e) {
            System.out.println("вы вышли за пределы");
        }
    }
}
