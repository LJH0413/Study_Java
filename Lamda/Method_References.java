package Lamda;

import java.util.function.IntBinaryOperator;

class Calculator {
	
	public static int staticMethod(int x, int y) {
		return x + y;
	}
	
	public int instanceMethod(int x, int y) {
		return x + y;
	}
	
}

public class Method_References {
	public static void main(String[] args) {
		
		IntBinaryOperator operator;
		
		//정적 매소드 참조
		//정적 메소드 
		// 클래스이름 :: 매소드
		operator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("결과 1: " + operator.applyAsInt(1, 2));
		
		operator = Calculator :: staticMethod;
		System.out.println("결과 2: " + operator.applyAsInt(3, 4));
		
		//인스턴스 메소드 참조
		//인스턴스 메소드
		// 인스턴스 생성
		// 참조변수 :: 메소
		
		Calculator obj = new Calculator();
		operator = (x, y) -> obj.instanceMethod(x, y);
		System.out.println("결과 3: " + operator.applyAsInt(5, 6));
		
		operator = obj :: instanceMethod;
		System.out.println("결과 4: " + operator.applyAsInt(7, 8));
	}

}
