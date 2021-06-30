import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * @author Hu Wen
 * @version 1.0
 * @date 2021/6/24 22:08
 */
public class TestDemo {
    @Test
    public void testAdd(){
        String work="you are a pig!!!";
        assertEquals("you are a pig!!!",work);

    }
}
