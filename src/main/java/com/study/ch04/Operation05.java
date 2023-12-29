package com.study.ch04;

public class Operation05 {
    public static void main(String[] args) {
        /*
        * int x = 1;
        * int y = 1;
        *
        * x와 y 중 하나라도 값이 0이면 결과는 "오류"
        * x,y 값에 맞는 사분면을 출력
        *
        *  */
        int x = 0;
        int y = 1;
        String result1 = x == 0 || y == 0 ? "오류"
                        : (x > 0 ? (y > 0 ? "1 사분면" :"4 사분면")
                        : (y > 0 ? "2 사분면" : "3 사분면"));
        String result2 = x == 0 || y == 0 ? "오류"
                         : x > 0 && y > 0 ? "1 사분면"
                         : x < 0 && y > 0 ? "2 사분면"
                         : x < 0 && y < 0 ? "3 사분면" : "4 사분면";
        System.out.println(result1);
        System.out.println(result2);




    }
}
