package secondJava;

public class JavaStudy06 {
    public static void main(String[] args) {
        //대입연산자에서 주의해야 할 점!!
        //++, --
        int a = 10;
        int b = 10;
//        int val = ++a + b--; // 11 + 10 = 20 "+계산후 --가 된다"
        int val = ++a + --b; // 11 + 9 = 20
        System.out.println(a);
        System.out.println(b);
        System.out.println(val);// 21

    }
}