package DataStructure.ArrayAndList;

import java.util.Scanner;

/*
 * 문제 001. 숫자의 합 구하기
 * 시간제한 1초 | 난이도 브론즈2 | 백준 온라인 저지 11720번
 *
 * 입력 : 1번째 줄에 숫자의 개수 N(1 <= N <= 100), 2번째 줄에 숫자 N개가 공백 없이 주어진다.
 *
 * 출력 : 입력으로 주어진 숫자 N개의 합을 출력한다.
 */

public class ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 입력받을 개수
        int cnt = sc.nextInt();
        // 2. 입력받을 숫자들
        String sNum = sc.next();
        // 3. 입력받은 숫자를 String -> char 배열로 변환.
        char[] cNum = sNum.toCharArray();
        // 4. 출력할 합계
        int sum = 0;

        // 4. char 배열 길이만큼 합계 더하기
        for(int i = 0; i < cnt; i++) {
            sum += cNum[i] - '0'; // Ascii code '0' = 48을 빼서 int로 변환.
//            sum += Character.getNumericValue(cNum[i]); // 또는 char -> int 변환.
        }
        System.out.println(sum);
    }
}