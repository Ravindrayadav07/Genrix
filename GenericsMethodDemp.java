package com.collecation;

public class GenericsMethodDemp {

	public static <E> void PrintArray(E[] elements) {
		for(E e: elements) {
			System.out.println(e);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] intArray= {10,20,30,40};
		Character[] charArray= {'j','a','v','a'};
		System.out.println("print int array=");
		PrintArray(intArray);
		System.out.println("print char Array=");
		PrintArray(charArray);
		
	}
}
