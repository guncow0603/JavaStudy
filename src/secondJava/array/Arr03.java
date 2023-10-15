package secondJava.array;

public class Arr03 {
    public static void main(String[] args) {
        //얕은 복사
        int[] a = { 1, 2, 3, 4 };
        int[] b = a; //얕은 복사

        b[0] = 3; // b 배열의 0번쨰 순번값을 3으로 수정했습니다 (1->3)

        System.out.println(a[0]);

    }
}
