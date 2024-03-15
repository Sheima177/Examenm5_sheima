ackage test;

import org.junit.Test;
import main.BalancedBrackets;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void test1() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void test2() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void test3() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void test4() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void test5() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void test6() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void test7() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void test8() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void test9() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }


}
