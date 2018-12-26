package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import lambda.domain.Trader;
import lambda.domain.Transaction;
import org.junit.Before;
import org.junit.Test;

public class TestTransaction {

    List<Transaction> transactions = null;

    @Before
    public void before() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
    }

    //晚上回去练习

    //1. 找出2011年发生的所有交易， 并按交易额排序（从低到高）
    @Test
    public void test1() {

    }

    //2. 交易员都在哪些不同的城市工作过？
    @Test
    public void test2() {

    }

    //3. 查找所有来自剑桥的交易员，并按姓名排序
    @Test
    public void test3() {

    }

    //4. 返回所有交易员的姓名字符串，按字母顺序排序
    @Test
    public void test4() {

    }

//    public static Stream<String> filterCharacter(String str) {
//
//    }

    //5. 有没有交易员是在米兰工作的？
    @Test
    public void test5() {

    }


    //6. 打印生活在剑桥的交易员的所有交易额
    @Test
    public void test6() {

    }


    //7. 所有交易中，最高的交易额是多少
    @Test
    public void test7() {

    }

    //8. 找到交易额最小的交易
    @Test
    public void test8() {

    }

}