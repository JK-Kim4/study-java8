# study-java8  

------
  
1. 함수형 인터페이스
   - 추상 메소드가 단 하나 존재하는 인터페이스
     - SAM (Single Abstract Method)
     - com.tutomato.studyjava8.RunSomething 과 같이 1개의 추상 메소드 + a(static, default등) 또한 함수형 인터페이스라 한다.
   - @FunctionalInterface
     - Java standard library 제공 annotation
     - 함수형 인터페이스 선언  
  

2. 람다 표현식
   - 함수형 인터페이스의 인스턴스 ( 구현체 )를 만드는 방법으로 사용 가능
  
3. 자바에서 함수형 프로그래밍
   - 함수를 First Class Object로 사용할 수 있다. (메소드의 파라미터를 전달하거나, 구현제 자체를 return 가능)
   - 순수함수
     - 입력받은 값이 동일한 경우 결과값이 동일해야 한다.
     - 동일한 입력값에 대해 동일한 반환값을 보장하지 못한다면 함수형 프로그래밍 X
   - 고차함수
     - 함수가 함수를 파라미터로 받아서 함수를 리턴할 수 있다.