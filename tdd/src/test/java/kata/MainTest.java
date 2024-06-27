package kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
    
    @Test 
    public void testConvert1() {
        assertEquals("I", Main.convert(1));
    }
    @Test
    public void testConvert4() {
        assertEquals("IV", Main.convert(4));
    }
    @Test
    public void testConvert5() {
        assertEquals("V", Main.convert(5));
    }
    @Test
    public void testConvert9() {
        assertEquals("IX", Main.convert(9));
    }
    @Test
    public void testConvert10() {
        assertEquals("X", Main.convert(10));
    }
    @Test
    public void testConvert100() {
        assertEquals("C", Main.convert(100));
    }
}
