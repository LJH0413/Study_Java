package java11_basic_class.object.String;

public class String_Ex2 {

	public static void main(String[] args) {
		
		//concat(): 두 문자열을 연결해서 출력: 가비지 발생
		// 작은 양의 문자열을 연결할 때 사용.
		// 별도의 메모리 영역을 새로 생성 연결함. 
		
		String javaStr = new String("java");
		String androidStr = new String("android");
		
		System.out.println(javaStr);
		System.out.println("처음문자열 주소 값: " + System.identityHashCode(javaStr)); 
		//가비지 발생: 메모리의 쓰레기 영역
		System.out.println();
		
		javaStr = javaStr.concat(androidStr);
		//concat 두개의 문자를 연결해서 출력
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소 값: " + System.identityHashCode(javaStr));
		
		

	}

}
