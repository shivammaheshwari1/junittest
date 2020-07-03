import org.junit.jupiter.api.*;
 
public class simpleTest {
  
    @Test
    public void isGreaterTest() {
        System.out.println("Test1");
        simple obj1 = new simple();
        assertTrue("Num 1 is greater than Num 2", obj1.isGreater(4, 3));
    }
  
    @Test
    public void isGreaterTestfail() {
        System.out.println("Test2");
        simple obj2 = new simple();
        assertTrue("Num 1 is greater than Num 2", obj2.isGreater(2, 3));
    }
 
}
