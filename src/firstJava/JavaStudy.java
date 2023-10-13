package firstJava;

import java.util.Arrays;

public class JavaStudy {
     public static void main(String[] args) {
         //우리의 playground!
         //기본형 변수
         //(1) boolean
         //변수를 선언해보자 => 타입 이름 = 값;
         boolean flag = true;
         System.out.println(flag);
         flag = false;

         //상수
         final boolean flag2 = true;


         //(2)문자열(char)
         char alphabet = 'A';
         System.out.println(alphabet);

         //(3)정수형(byte, short, int, long)

         //1byte = 8 bit
         //bit : 0과 1을 표현.
         byte byteNumber = 127; //  -128 ~ 127(1byte)
         short shortNumber = 32767;// -32768 ~32767
         int intNumber = 2147483647;
         long longNumber = 2147483647L;

         System.out.println(byteNumber);
         System.out.println(shortNumber);
         System.out.println(intNumber);
         System.out.println(longNumber);

         //(4) 실수형
         //float(4bye), double(8byte)

         float floatNumber = 0.123F;
         double doubleNumber = 0.123123132;

         System.out.println(floatNumber);
         System.out.println(doubleNumber);

         //참조형!
         //(1) 문자열 변수
         String helloWorld = "helloWorld";

         System.out.println(helloWorld);

         //(2)배열
         int[] a = {1, 2, 3};

         System.out.println(Arrays.toString(a));

         //래퍼 클래스(Wrapper Class 변수)
         int number = 21;

         Integer num = number;// boxing

         System.out.println(num.intValue());// unboxing
        }
    }

