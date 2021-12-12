package com.vinay.hegde.programming;

import java.util.Arrays;
import java.util.Scanner;
/**
* Problem statement : https://codingcompetitions.withgoogle.com/kickstart/round/0000000000435a5b/000000000077a882
*/
public class GoogleKickStartRoundBIncreasingSubString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int attempt = 0;
		while (T-- > 0) {
			attempt++;

			int N = s.nextInt();
			String str = s.next();

			int[] answer = new int[N];
			answer[0] = 1;
			for (int i = 1; i < str.length(); i++) {
//				char c = str.charAt(i);
//				for (int j = i - 1; j >= 0; j--) {
//					if (c > str.charAt(j)) {
//						c = str.charAt(j);
//						count++;
//					} else
//						break;
//				}
//				answer[i] = count;
				if (str.charAt(i) > str.charAt(i - 1))
					answer[i] = answer[i - 1] + 1;
				else
					answer[i] = 1;

			}

			StringBuilder sb = new StringBuilder();
			Arrays.stream(answer).forEach(k -> sb.append(k + " "));
			System.out.println("Case #" + attempt + ": " + sb.substring(0, sb.length() - 1));
		}

	}
 
}
