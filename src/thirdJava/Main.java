package thirdJava;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); //객체 생성
//
//        //초기값 기본값 확인 : 초기값을 준 것은 그 값이 들어가고, 아닌 값은 default value가 set
//        System.out.println("car.model = " + car.model);
//        System.out.println("car.color = " + car.color);
//        System.out.println();
//
//        System.out.println("car.speed = " + car.speed);
//        System.out.println("car.gear = " + car.gear);
//        System.out.println("car.lights = " + car.lights);
//        System.out.println();
//
//        System.out.println("car.tire = " + car.tire);
//        System.out.println("car.door = " + car.door);
//        System.out.println();
//
//
//        //필드 사용
//        car.color = "blue";//필드 color에 "blue"데이터 저장
//        car.speed = 100;
//        car.lights = false;
//
//
//        System.out.println("car.color = " + car.color);
//        System.out.println("car.speed = " + car.speed);
//        System.out.println("car.lights = " + car.lights);


        System.out.println("페달 밟기 전 car.gear ="+car.gear);
    //메서드 호출 및 변환값으 저장
    double speed = car.gasPedal(100,'D');
        System.out.println("speed = "+speed);

        boolean lights = car.onOffLights();
        System.out.println("Lights ="+ lights);

        System.out.println();
        System.out.println("페달 밟은 후 car.gear ="+car.gear);

        System.out.println();
        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(110, 120, 150);
    }
}
