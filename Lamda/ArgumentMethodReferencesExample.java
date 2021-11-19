package Lamda;

import java.util.function.ToIntBiFunction;

import javax.print.attribute.standard.PrinterInfo;

public class ArgumentMethodReferencesExample {
	public static void main(String[] args) {
		
		//applyAsInt -> 매개변수를 연산 후 반환
		//function.applyAsInt -> 
		
		ToIntBiFunction<String, String> function;
		
		function = (a, b) -> a.compareToIgnoreCase(b);
		print(function.applyAsInt("Java8", "Java11"));
		
		function = String :: compareToIgnoreCase;
		print(function.applyAsInt("java8", "java11"));
		
		function = String :: compareToIgnoreCase;
		print(function.applyAsInt("java8", "java8"));
		
		function = String :: compareToIgnoreCase;
		print(function.applyAsInt("java11", "java8"));
				
	}
	
		public static void print(int order) {
			if(order<0) {
				System.out.println("사전순으로 먼저옵니다");
			} else if(order == 0) {
				System.out.println("동일한 문자열입니다");
			} else {
				System.out.println("사전순으로 나중에 옵니다");
			}
		}

}
