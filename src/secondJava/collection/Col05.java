package secondJava.collection;

import java.util.HashSet;
import java.util.Set;

public class Col05 {
    //📌 `Set`
    //    순서가 없는 데이터의 집합 (데이터 중복 허용 안함) - 순서없고 중복없는 배열
    //    - 순서가 보장되지 않는 대신 중복을 허용하지 않도록 유지할 수 있습니다.
    //    - `Set` 은 그냥 `Set`으로 쓸수도있지만 `HashSet`, `TreeSet` 등으로 응용하여 사용할 수 있습니다.
    //    - `Set` 는 생성자가 없는 껍데기라서 바로 생성할수는 없습니다. (껍데기 = 인터페이스)
    //    - 생성자가 존재하는 클래스인 `HashSet` 를 사용하여 `Set` 를 생성해서 받을 수 있습니다.
    // Set
// (사용하기 위해선 import java.util.Set; 와 java.util.HashSet; 를 추가해야합니다.)

    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<Integer>(); // 선언 및 생성

        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(3); // 중복된 값은 덮어씁니다.
        intSet.add(3); // 중복된 값은 덮어씁니다.

        for (Integer value : intSet) {
            System.out.println(value); // 1,2,3 출력
        }

        // contains()
        System.out.println(intSet.contains(2)); // true 출력
        System.out.println(intSet.contains(4)); // false 출력

        // remove()
        intSet.remove(3); // 3 삭제

        for (Integer value : intSet) {
            System.out.println(value); // 1,2 출력

        }
    }
}
