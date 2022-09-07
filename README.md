# study-java8  

------
[day 1]
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
     
4. java.lang.function 패키지
   - java에서 제공하는 함수형 인터페이스
   - 자바에서 미리 정의해둔 자주 사용할만한 함수 인터페이스
   - Function<T, R>
     - T 타입을 받아 R 타입을 리턴하는 함수 인터페이스
     - 함수 조합용 메소드
       - compose
       - andThan
   - BiFunction<T, U, R>
     - 두 개의 값 (T, U)을 받아 R타입으로 리턴하는 함수 인터페이스
     - R apply(T t, U, u)
   - Consumer<T>
     - T 타입을 받아 아무것도 리턴하지 않는 함수 인터페이스
     - 함수 조합용 메소드
       - andThan
   - Supplier<T>
     - T 타입의 값을 제공하는 함수 인터페이스
   - Predicate<T>
     - T 타입의 값을 받아 true & false를 리턴
     - 함수 조합용 메소드
       - and()
       - not()
       - or()
   - UnaryOperator<T>
   - BinaryOperator<T>