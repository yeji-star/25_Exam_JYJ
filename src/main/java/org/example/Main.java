package org.example;

// 2. 양의 정수 n을 요청받아 숫자 패턴의 피라미드를 출력하는 프로그램을 구현합니다.
// 피라미드는 n 레벨을 가져야 하며, 최상위 레벨에서 n부터 시작하여 맨 아래층에서 1까지 숫자가 감소해야 합니다.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int j = 0; j <= n + 4; j++) {

            for (int i = n; i >= 1; i--) {
                System.out.print(i);
                System.out.print(" ");
            }

            System.out.println("");

            n -= 1;
        }
    }

}

