package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ExeciseArray {
    public static Scanner sc = new Scanner(System.in);

    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void ArrayEx() {
        System.out.print("Nhập số phần tử:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Giá trị các phần tử trong mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        show(arr);

        //Ex10
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("\nMảng sau khi đảo: " + Arrays.toString(arr));

        //Ex3
        int max = arr[0];
        int min = arr[0];
        int max2 = arr[0];
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("\nSố lớn nhất của mảng là:" + max);
        System.out.println("Số nhỏ nhất của mảng là:" + min);


        //Ex11
        for (int i = 1; i < n; i++) {
            if (max == arr[i]) {
                continue;
            } else if (max2 < arr[i])
                max2 = arr[i];
        }
        System.out.println("Số lớn thứ 2 của mảng là:" + max2);

        //Ex7
        int dem = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(+arr[i] + " ");
                    dem++;
                }
            }
        }
        if (dem == 0)
            System.out.println("Không trùng");

        //Ex6
        int count;
        int specific = 0;
        System.out.print("\nCheck mảng có chứa phần tử: ");
        specific = sc.nextInt();
        for (count = 0; count < n; count++) {
            if (arr[count] == specific) {
                System.out.println("Mảng có chứa " + specific + " tại vị trí " + (count + 1));
                break;
            }
        }
        if (count == n) {
            System.out.println("Không có " + specific + " trong mảng");
        }
    }
}
