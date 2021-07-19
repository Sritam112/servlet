package com.habile.assignment;

import java.util.Set;
import java.util.TreeSet;

public class Assignment1 {
	public static void m(String str) {
		Set t = new TreeSet();
		str = str + " ";
		String str2 = "";
		char chr[] = str.toCharArray();
		for (int i = 0; i < chr.length; i++) {
			if (Character.isLetter(chr[i]))
				str2 += chr[i];
			else {
				t.add(str2);
				str2 = "";
			}
		}
		System.out.println(t);
	}

	public static void main(String[] args) {
		String str = "this is an impossible task";
		m(str);
	}

}
