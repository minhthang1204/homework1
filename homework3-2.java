/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class homework3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int A[] = new int[n];
        int sum = 0;
        System.out.println("Nhập giá trị cho các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }
//      for (int i = 0; i < n; i++) {
////            if (i % 2 == 0) {
//                System.out.println(A[i]);
//            }
//            if (i % 2 == 1) {
//                System.out.println(A[i]);
//            }
////        }
//        for (int i = 0; i < n; i++) {
////            if (A[i] % 2 == 0) {
////                System.out.println(A[i]);
////            }
////            if (A[i] % 5 == 1) {
////                System.out.println(A[i]);
////            }
//            if (A[i] % 2 == 0) {
//                sum += A[i];}}
//          System.out.print(sum);  
    //}
    
        }
