package com.tutomato.studyjava8;

@FunctionalInterface
public interface RunSomething {

    abstract void doIt();

    //@FunctionalInterface 정의한 인터페이스기 때문에 추상 메소드는 단 하나만 작성 가능
    //abstract void test();

    static void printName(){
        System.out.println("jongwan");
    }

    default void pringAge(){
        System.out.println("31");
    }

}
