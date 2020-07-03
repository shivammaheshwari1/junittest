import org.junit.jupiter.api.*
 
public class simpletest {
 
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }
 
    @Before
    public void before() {
        System.out.println("Before Test Case");
    }
 
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
 
    @After
    public void after() {
        System.out.println("After Test Case");
    }
 
    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }
}
