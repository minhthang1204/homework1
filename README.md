# homework1
just another repository
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import static java.awt.PageAttributes.MediaType.A;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class homework {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
//        int a;
//
//        System.out.println("nhap vao so:");
        Scanner sc = new Scanner(System.in);

//        int c = sc.nextInt();
//
//        int SU = 0;
//        for (a = 1; a <= c; a++) {
//            if (c % a == 0) {
//                SU++;
//
//                System.out.println("cac uoc la N= " + a);
//            }
//        }
//            //ex2
//            if (SU == 2) {
//                System.out.println("True");
//            } else {
//                System.out.println("False");
//            }
        //   }
        // ex3
//        int n;
//        int Array[] = new int[50];
//        System.out.println("nhap so phan tu");
//        n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            int x = i + 1;
//            System.out.println("so thu" + x + ":");
//            Array[i] = sc.nextInt();
//        }
//        int min = Array[0];
//        int max = Array[0];
//        for (int i = 0; i < n; i++) {
//            if (Array[i] < min) {
//                min = Array[i];
//            }
//            if (Array[i] > max) {
//                max = Array[i];
//            }
//        }
//        {
//            System.out.println("So lon nhat la:" + max);
//            System.out.println("so nho nhat la:" + min);
//        }
//    }
// ex 4
        System.out.println("nhap vao 1 so:");
        Random rd = new Random();
        int so = rd.nextInt();
        int a = sc.nextInt();
        while (a != so) {
            if (a > so) {
                System.out.println("very high, try again");
            }
            if (a < so) {
                System.out.println("very low, try again");
            }

        }
        {
            System.out.println("exactly");
        }

    }
