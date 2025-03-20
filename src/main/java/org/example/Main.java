package org.example;

// 1. 가로길이, 세로길이를 입력받아 사각형 넓이 만큼 별을 찍어내는 프로그램을 구현

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int garo = sc.nextInt();
        int sero = sc.nextInt();



        for (int i = 1; i <= sero; i++) {

            System.out.print("*");

            for (int j = 1; j < garo; j++) {

                System.out.print("*");
            }
            System.out.println("");
        }






    }
}