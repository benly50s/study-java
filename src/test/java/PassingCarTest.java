import org.junit.Test;

import java.util.Random;
import java.util.stream.IntStream;

public class PassingCarTest {


    @Test
    public void test() {

        Random random = new Random();
        int[] objects = IntStream.range(0, 100000000)
                .map(o -> random.nextInt(2))
                .toArray();
        System.out.println(solution(objects));

    }


    public int solution(int[] A) {
        // write your code in Java SE 8
        int lastIndex = A.length - 1;
        int W = A[lastIndex];
        int prev;
        int cur = 0;

        for (int i = 1; i < A.length; i++) {
            prev = cur;
            if (A[lastIndex - i] == 0) {
                cur = W + prev;
            } else {
                cur = prev;
                W++;
            }
        }

        if (cur>=0 && cur <= 1000000000)
            return cur;

        return -1;
    }
}
