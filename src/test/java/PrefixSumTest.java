import org.junit.Test;

import java.util.Arrays;

public class PrefixSumTest {

    @Test
    public void test(){
        int[] ints = prefix_sums(new int[]{2,3,7,5,1,3,9});
        Arrays.stream(ints).boxed()
                .forEach(System.out::println);

        System.out.println(count_total(ints, 0, 2));
    }

    public int[] prefix_sums(int[] A) {
        int n = A.length;

        int[] p=new int[n+1];

        for (int i = 1; i < n + 1; i++) {
            p[i] = p[i-1] + A[i - 1];
        }

        return p;
    }

    public int count_total(int[] P, int x, int y){
        return P[y + 1] - P[x];
    }
}
