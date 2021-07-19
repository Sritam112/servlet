package com.habile.assignment;

public class Assignment2 {

	public static void m(String str) {
		char[] chr = str.toCharArray();
		for (int i = 1; i < chr.length - 1; i++) {
			for (int j = i + 1; j < chr.length - 1; j++) {
				char c = chr[i];
				chr[i] = chr[j];
				chr[j] = c;
			}
		}
		for (int j = 0; j < chr.length; j++) {
			System.out.print(chr[j] + "  ");
		}
	}

	public static void main(String[] args) {
		String s = "BATIA";
		m(s);

	}

}
