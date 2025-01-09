package com.example.calculator2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요 : ");
            char operator = sc.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            // calculate 메서드 사용
            int result = calculator.calculate(num1, num2, operator);
            System.out.println("결과값: " + result);

            // 연산 기록 출력
            System.out.println("--연산 기록--");
            for (String record : calculator.getResultList()) {
                System.out.println(record);
            }


            System.out.println("연산 기록 중 첫 번째 항목을 삭제하시겠습니까? (yes/no): ");
            String delete = sc.next();
            if (delete.equalsIgnoreCase("yes")) {
                calculator.removeFirstResult();
            }


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String exit = sc.next();
            if (exit.equalsIgnoreCase("exit")) {
                break;
            }
        }

    }
}
