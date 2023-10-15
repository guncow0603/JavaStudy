package secondJava.collection;

import java.util.ArrayList;

public class Col01 {
    public static void main(String[] args) {
        //List
        //순서가 있는 데이터의 집합 => Array최초 길이를 알아야 함)
        //처음에 길이를 몰라도 만들 수 있음!
        // 1)Array => 정적배열
        // 2)List(ArrayList) -> 동적배열(크기가 가변적으로 늘어난다.)
        //     - 생성 시점에 작은 연속된 공간을 요청해서 참조형 변수들을 담아놓는다.
        //     - 값이 추가될 떄 더 큰 공간이 필요하면 더큰 공간을 받아서 저장하니깐 상관없다!
        //
        // ArrayList
// (사용하기 위해선 import java.util.ArrayList; 를 추가해야합니다.)

        ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언 및 생성

        intList.add(1);
        intList.add(2);
        intList.add(3);

        System.out.println(intList.get(0)); // 1 출력
        System.out.println(intList.get(1)); // 2 출력
        System.out.println(intList.get(2)); // 3 출력
        System.out.println(intList.toString()); // [1,2,3] 출력

        intList.set(1, 10); // 1번순번의 값을 10으로 수정합니다.
        System.out.println(intList.get(1)); // 10 출력


        intList.remove(1); // 1번순번의 값을 삭제합니다.
        System.out.println(intList.toString()); // [1,3] 출력

        intList.clear(); // 전체 값을 삭제합니다.
        System.out.println(intList.toString()); // [] 출력

    }
}
