import org.junit.Test;

public class CountDivTest {
    @Test
    public void test() {

        System.out.println(solution(11, 345, 17));


    }


    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int result = B / K + 1;
        if (A != 0) {
            result -= ((A - 1) / K + 1);
        }
        return result;

    }
}
