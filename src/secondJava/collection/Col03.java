package secondJava.collection;

import java.util.Stack;

public class Col03 {
//   Stack
//   값을 수직으로 쌓아놓고 넣었다가 빼서 조회하는 형식으로 데이터를 관리 합니다.
//   나중에 들어간 것이 가장 먼저 나온다(Last-In-First-out)
//   넣는 기능(`push()`) 과 조회(`peek()`), 꺼내는(`pop()`) 기능만 존재합니다.
//   이렇게 불편하게 쓰는 이유는 최근 저장된 데이터를 나열하고 싶거나 데이터의 중복처리를 막고싶을때 사용합니다.
    public static void main(String[] args) {
// Stack
// (사용하기 위해선 import java.util.Stack; 를 추가해야합니다.)

        Stack<Integer> intStack = new Stack<Integer>(); // 선언 및 생성

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        while (!intStack.isEmpty()) { // 다 지워질때까지 출력
            System.out.println(intStack.pop()); // 3,2,1 출력
        }

        // 다시 추가
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        // peek()
        System.out.println(intStack.peek()); // 3 출력
        System.out.println(intStack.size()); // 3 출력 (peek() 할때 삭제 안됬음)

        // pop()
        System.out.println(intStack.pop()); // 3 출력
        System.out.println(intStack.size()); // 2 출력 (pop() 할때 삭제 됬음)

        System.out.println(intStack.pop()); // 2 출력
        System.out.println(intStack.size()); // 1 출력 (pop() 할때 삭제 됬음)

        while (!intStack.isEmpty()) { // 다 지워질때까지 출력
        System.out.println(intStack.pop()); // 1 출력 (마지막 남은거 하나)

        }
    }
}
