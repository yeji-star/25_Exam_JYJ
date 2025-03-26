package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int garo = sc.nextInt(); // 입력받은 가로 값
        int sero = sc.nextInt(); // 입력받은 세로 값

        for (int i = 1; i <= sero; i++) {

            for (int j = 1; j <= garo; j++) {

                System.out.print("*");
                //j가 1이고 가로보다 작고 같을 동안 별을 하나씩 찍고, j의 수가 1씩 증가
            }
            System.out.println("");
            // i가 1이고 세로보다 작고 같을 동안 줄바꿈을 하고, i의 수가 1씩 증가
        }

        }
    }