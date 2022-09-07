package com.tutomato.studyjava8;

import java.util.function.Function;

public class Foo {

    public static void main(String[] args) {

        /*// 익명 내부 클래스 형태로 함수형 인터페이스를 구현하여 사용 (Java 8 이전 문법)
        RunSomething rm1 = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("hello rm1");
            }
        };

        rm1.doIt();

        //Java8 이후 익명 내부 클래스를 람다형으로 간략하게 구현하여 사용 가능
        RunSomething rm2 = () -> System.out.println("hello rm2");
        rm2.doIt();

        //함수형 인터페이스에서 실행해야 하는 코드가 1줄 이상일 경우 중괄호 사용
        RunSomething rm3 = () -> {
            System.out.println("hello rm3-1");
            System.out.println("hello rm3-2");
        };
        rm3.doIt();*/

        /*Plus10 p10 = new Plus10();
        System.out.println(p10.apply(10));*/

        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiply2 = (i) -> i * 2;
        //System.out.println(multiply2.apply(2));

        //함수형 메소드 조합
        Function<Integer, Integer> compose = plus10.compose(multiply2);

        System.out.println(compose.apply(30)); //70

        //Function<Integer, Integer> andThan = plus10.andThen(multiply2);

        System.out.println(plus10.andThen(multiply2).apply(30)); // 80

    }
}
