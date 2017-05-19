package com.bit.oop8.grade01;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Grade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "src/com/bit/oop8/grade01/grade2.txt";
		Scanner scanner = new Scanner(System.in);
		PrintWriter pw = null;

		try {
			pw = new PrintWriter(fileName);
			int intNum = 1;

			while (true) {

				try {
					System.out.print(intNum + "번호의 국어점수를 기입하시오>>");
					String keynum = scanner.nextLine();

					int intkn = Integer.valueOf(keynum);
					pw.print(keynum);
					pw.print(":");
					pw.println(intkn);

				} catch (Exception e) {
					System.out.println("점수를 다시 입력하세요");
				}
				pw.close();

			}

			try {
				System.out.print(intNum + "번호의 수학점수를 기입하시오>>");
				String keynum1 = scanner.nextLine();

				int intmn = Integer.valueOf(keynum1);
				pw.print(keynum1);
				pw.print(":");
				pw.println(intmn);

			} catch (Exception e) {
				System.out.println("점수를 다시 입력하세요");
			}
			pw.close();
		
			try {
				System.out.print(intNum + "번호의 영어점수를 기입하시오>>");
				String keynum2 = scanner.nextLine();

				int inten = Integer.valueOf(keynum2);
				pw.print(keynum2);
				pw.print(":");
				pw.println(inten);

			} catch (Exception e) {
				System.out.println("점수를 다시 입력하세요");
			}
			pw.close();

			intNum++;

		} catch (

		FileNotFoundException e) {
			System.out.println("오류발생함");
			e.printStackTrace();
		}

	}
}
