package com.aks.algorithm.programmers.level2;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12909
 */
public class 올바른_괄호 {
    boolean solution(String s) {
        int answer = 0;
        for (char c : s.toCharArray()) {

            if (c == '(') {
                answer++;
            } else {
                answer--;
            }

            if (answer < 0) {
                return false;
            }
        }

        return answer == 0;
    }
}
