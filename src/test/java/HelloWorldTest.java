import org.junit.Test;

import java.util.List;

import static java.lang.String.format;
import static java.util.Arrays.asList;

public class HelloWorldTest {

    static final List<String> sentences = asList(
            "We test coders.. Give us a try?",
            "  We test    coders. . Give     us a try?  ",
            "  We test? coder/! Give? us a t\try?  ",
            "\t\t",
            " ",
            "",
            null,
            "\thello java !!\t",
            "hello java !! hello python language",
            "hello java ???? hello python language",
            "hello java . . \t.  hello \t\t\tpython language"
    );

    static final List<Integer> results = asList(4,4,4,0,0,0,0,2,3,3,3);

    @Test
    public void test(){

        for(int idx = 0; idx < sentences.size(); idx++){
            String sentence = sentences.get(idx);
            Integer result = results.get(idx);
            Integer termCount = getTermCount(sentence);

            System.out.println(format("%5s ( Expectation: %2s, Result:%2s ) - %s", termCount == result, result, termCount, sentence));
        }


    }

    private Integer getTermCount(String sentence) {
        return null;
    }
}
