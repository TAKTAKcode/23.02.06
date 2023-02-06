package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //몇 개를 입력할지 입력 받는다
        String arr[] = new String[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {

            //한줄한줄 입력받는다.
            arr[i] = sc.next();

        }

        //Scanner 메모리 누수 방지
        sc.close();

        for (int i = 0; i < arr.length; i++) {

            int cnt = 0;        //연속횟수
            int sum = 0;        //누적 합산

            for (int j = 0; j < arr[i].length(); j++) {

                //if : O일때 cnt에 중첩해서 값을 더하도록 한다.
                if (arr[i].charAt(j) == 'O') {

                    cnt++;

                //else : 아닐 경우 0으로 리셋
                } else {

                    cnt = 0;

                }

                //if문을 거치고 나오는 cnt를 sum에 중첩하여 더한다.
                sum += cnt;

            }

            System.out.println(sum);

        }

    }

}
