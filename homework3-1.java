/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
class sout {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap vao do dai mang: ");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//        System.out.println("nhap vao x");
//        int x = sc.nextInt();
//
//        for (int i = 0; i < size; i++) {
//            System.out.println("Nhập vào phần tử thứ " + i + ": ");
//            arr[i] = sc.nextInt();
//        }
//            if (arr[i] % 2 == 1) {
//                arr[i] = -1;
//                System.out.println(arr[i]);
//            }
//
//        int min = arr[0];
//        int j;
//        for (j = 0; j < arr.length; j++) {
//          
//
//            if (min > arr[j]) {
//                min = arr[j];
//        arr[j] = -1;
//        System.out.println(arr[j]);
//            }
//        }
//            //   }
//            if (arr[i] < x) {
//
//                System.out.println(arr[i]);
//            }
//        }
//        int i,a = 0;
//        for (i = 0; i < arr.length; i++) {
//
//            if (x > arr[i]) {
//                a = arr[i];
//
//            }
//            System.out.println(a);
//        }
//    }
//}
        int n, kt = 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int A[] = new int[n];

        System.out.println("Nhập giá trị cho các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < n / 2; i++) {
            if (A[i] != A[n - i - 1]) {
                kt = 0;
                break;
            }
        }

        if (kt == 0) {
            System.out.println("Mảng một chiều vừa nhập không là mảng đối xứng");
        } else {
            System.out.println("Mảng một chiều vừa nhập là mảng đối xứng");
        }
    }
