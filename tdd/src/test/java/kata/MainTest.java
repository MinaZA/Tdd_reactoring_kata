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
}
