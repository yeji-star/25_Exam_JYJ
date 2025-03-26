package org.example;


public class Main {
    public static void main(String[] args) {
        // 피보나치 수열이란 첫째 및 둘째 숫자가 1이며 그 뒤의 모든 숫자는 바로 앞 두 숫자의 합인 수열
        // 다만 예시문의 수열이 0에서부터 시작했기에

        int num1 = 0; // num1에는 0이란 숫자를 넣고
        int num2 = 1; // num2에는 1이란 숫자를 넣고
        int num3 = 0; // num3에는 num1과 num2를 더한 값을 넣어야 하기에 우선 0을 넣음
        System.out.print(num1 + ", " + num2);
        // 그렇게 첫째 및 둘째 숫자인 줄바꿈 없이 num1과 num2를 출력

        for (int i = 1; i < 9; i++) {
            // i가 1일 때, 9보다 작을 동안 1씩 증가
            // 여기서 i <= 8로 바꾸어도 상관무

            num3 = num1 + num2; // num3에 num1과 num2를 넣음
            System.out.print(", " + num3); // num3을 이어서 줄바꿈 없이 출력,
            num1 = num2; // num1에 num2의 값을 넣는다.
            num2 = num3; // num2에 num3의 값을 넣는다.

            // 이렇게 하면 처음엔 0, 1, 1 을 출력하고
            // 이후 num1 = num2, num2 = num3을 만나서,
            // num1에는 1이, num2에도 1이 들어간 뒤에
            // for문이기에 한번 루프를 돌고 i는 1이 증가하고,
            // num3을 만나서 -> num3은 num1과 num2를 더한 값이 들어가기 때문에
            // 결국 2라는 숫자가 들어가진다.
            // 피보나치 수열은 그 뒤의 모든 숫자는 바로 앞 두 숫자의 합인 수열이기에
            // 이후 계속 반복되어서 i가 8일 때, 총 8개의 숫자가 출력되고 난 뒤 빠져 나가게 된다.
        }

    }
}