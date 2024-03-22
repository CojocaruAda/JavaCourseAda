import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Ex1Test {

    /**
     * In true TDD fashion, you can start with something simple & obvious and simply
     * hard-code the correct answer into your Exercise1 method.
     */
    @Test
    public void testAlternateCapsWithCat() {
        String output = Ex1.alternateCaps("cat");
        assertEquals("cAt", output);
    }

    /**
     * However, if you hard-coded the solution in the first test, you'll need a second test
     * to force yourself to probably implement the real solution.
     */
    @Test
    public void testAlternateCapsWithApple() {
        String output = Ex1.alternateCaps("apple");
        assertEquals("aPpLe", output);
    }

    /**
     * Good idea to test some edge cases, like blank/empty String
     */
    @Test
    public void testAlternateCapsWithBlank() {
        String output = Ex1.alternateCaps("");
        assertEquals("", output);
    }

    /**
     * Not sure if this should be considered an edge case, but it's one
     * you may not want to just assume the behavior of.
     *
     * May also want to consider null input, numbers, etc.
     */
    @Test
    public void testAlternateCapsWithAllCapsApple() {
        String output = Ex1.alternateCaps("APPLE");
        assertEquals("APPLE", output);
    }
}
