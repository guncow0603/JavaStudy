package firstJava;

//클래스
//public : (접근)제어자, public(공공의, 공동의)
public class Main {
    //[JDK]
    //(1) compiler:'java -> .class
    //(2) JRE
    //(3) JDB : 디버깅

    //() : 소괄호
    //{} : 중괄호
    //[] ; 대괄호

    //main 메소드
    // 자바 프로젝트(앱)은, 제일 먼저 클래스의 main 메소드를 실행시킨다.
    //= JVM 의 약속
    //static : 이프로그램이 시작할 떄 무조건 실행되는 녀석임을 표현

    //output
    // void : 메서드의 출력값의 데이터 타입
    // void : "아무것도 없다." -> 출력은 없다.

    // input
    // String[] args(변수명) : 매개변수 자리

    public static void main(String[] args) {
        // 객체 : 특징(속성, 변수), 행동(메소드)
        // ln : line
        // Sysrem.out.println("Our First ");

        // print -> 줍 바꿈은 하지 x
        System.out.print("Our First");
        // println -> 줄 바꿈 o
        System.out.println("Project! :)");

        // 1. 7
        System.out.println("7");
        // 2. 3
        System.out.println("3");
        // 3. 3.14
        System.out.println("3.14");
        // 4. JAVA
        System.out.println("JAVA");

    }
}