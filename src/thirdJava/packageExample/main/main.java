package thirdJava.packageExample.main;

import thirdJava.packageExample.pk01.Car;

public class main {
    public static void main(String[] args) {
        // 클래스의 일부분이며, 하위 패키지를 도트(.)로 구분한다.
        thirdJava.packageExample.pk01.Car car1 = new thirdJava.packageExample.pk01.Car();
        thirdJava.packageExample.pk01.Car car2 = new thirdJava.packageExample.pk01.Car();

        car1.horn();
        car2.horn();
    }
}
