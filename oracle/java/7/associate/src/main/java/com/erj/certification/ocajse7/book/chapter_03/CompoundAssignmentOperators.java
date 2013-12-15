package com.erj.certification.ocajse7.book.chapter_03;

public class CompoundAssignmentOperators {
	public static void main(String[] args) {
		byte a;
		a = 10;
		System.out.println("10 += 3 :: " + (a += 3));
		
		a = 15;
		System.out.println("15 -= 3 :: " + (a -= 3));
		
		a = 20;
		System.out.println("20 *= 3 :: " + (a *= 3));
		
		a = 25;
		System.out.println("25 /= 3 :: " + (a /= 3));
		
		a = 30;
		System.out.println("30 %= 3 :: " + (a %= 3));
		
		a = 35;
		System.out.println("35 &= 3 :: " + (a &= 3));
		
		a = 40;
		System.out.println("40 ^= 3 :: " + (a ^= 3));
		
		a = 45;
		System.out.println("45 |= 3 :: " + (a |= 3));
		
		a = 50;
		System.out.println("50 <<= 3 :: " + (a <<= 3));
		
		a = 55;
		System.out.println("55 >>= 3 :: " + (a >>= 3));
		
		a = 60;
		System.out.println("60 >>>= 3 :: " + (a >>>= 3));
				
	}
}
