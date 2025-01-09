package com.example.calculator2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
        private List<String> resultList = new ArrayList<>();


        public int calculate(int num1, int num2, char operator) {
                int result = 0;

                if (operator == '+') {
                        result = num1 + num2;
                } else if (operator == '-') {
                        result = num1 - num2;
                } else if (operator == '*') {
                        result = num1 * num2;
                } else if (operator == '/') {
                        if (num2 == 0) {
                                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
                                return 0;
                        }
                        result = num1 / num2;
                } else {
                        System.out.println("잘못된 기호 입력");
                        return 0;
                }


                String record = num1 + " " + operator + " " + num2 + " = " + result;
                resultList.add(record);

                return result;
        }


        public List<String> getResultList() {
                return new ArrayList<>(resultList);

        }

        public void setResultList(List<String> resultList) {
                this.resultList = resultList;

        }

        //연산결과삭제
        public void removeFirstResult() {
                if (!resultList.isEmpty()) {
                        System.out.println("삭제된 연산 결과: " + resultList.remove(0));
                } else {
                        System.out.println("삭제할 연산 결과가 없습니다.");
                }
        }
}