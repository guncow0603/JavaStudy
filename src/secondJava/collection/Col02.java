package secondJava.collection;

import java.util.LinkedList;

// `LinkedList`
//  메모리에 남는 공간을 요청해서 여기저기 나누어서 실제값을 담아놓는다
//, 실제값이 있는 주소값으로 목록을 구성하고 저장는 자료구조

//  기본적인 기능은 `ArrayList` 와 동일!!
//  `LinkedList` 는 값을 나누어 담기 때문에 모든값을 조회하는 속도가 느리다.
//   값을 중간에 추가하거나 삭제할때는 속도가 빠릅니다.
public class Col02 {
    public static void main(String[] args) {


        // LinkedList
// (사용하기 위해선 import java.util.LinkedList; 를 추가해야합니다.)

        LinkedList<Integer> linkedList = new LinkedList<>(); // 선언 및 생성

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println(linkedList.get(0)); // 1 출력
        System.out.println(linkedList.get(1)); // 2 출력
        System.out.println(linkedList.get(2)); // 3 출력
        System.out.println(linkedList.toString()); // [1,2,3] 출력 (속도 느림)

        linkedList.add(2,4); // 2번 순번에 4 값을 추가합니다.
        System.out.println(linkedList); // [1,2,4,3] 출력

        linkedList.set(1,10); // 1번순번의 값을 10으로 수정합니다.
        System.out.println(linkedList.get(1)); // 10 출력

        linkedList.remove(1); // 1번순번의 값을 삭제합니다.
        System.out.println(linkedList); // [1,4,3] 출력

        linkedList.clear(); // 전체 값을 삭제합니다.
        System.out.println(linkedList); // [] 출력
    }
}
