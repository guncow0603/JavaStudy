package secondJava.collection;

import java.util.HashMap;
import java.util.Map;

public class Col06 {
    //1. Map
    //   여태까지 value 값들만 넣어서 관리하는 분류통(자료구조)를 배웠다면 Map 은 key-value 구조로 구성된 데이터를 저장할 수 있습니다.
    //    - 특징
    //        - key-value 형태로 데이터를 저장하기 때문에 기존에 순번으로만 조회하던 방식에서, key 값을 기준으로 vlaue를 조회할 수 있습니다.
    //        - key 값 단위로 중복을 허용하지 않는 기능을 가지고 있습니다.
    //        - `Map` 은 그냥 `Map`으로 쓸수도있지만 `HashMap`, `TreeMap`등으로 응용하여 사용할 수 있습니다.
    //        - `Map`으로 쓸수도있지만 `HashSet`, `TreeSet` 등으로 응용하여 사용할 수 있습니다.
    // Map
// (사용하기 위해선 import java.util.Map; 를 추가해야합니다.)
    public static void main(String[] args) {
        Map<String, Integer> intMap = new HashMap<>(); // 선언 및 생성

        //          키 , 값
        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("삼", 14); // 중복 Key값은 덮어씁니다.
        intMap.put("삼", 15); // 중복 Key값은 덮어씁니다.

        // key 값 전체 출력
        for (String key : intMap.keySet()) {
            System.out.println(key);
        }

        // value 값 전체 출력
        for (Integer key : intMap.values()) {
            System.out.println(key);
        }

        // get()
        System.out.println(intMap.get("삼")); // 15 출력

    }
}
