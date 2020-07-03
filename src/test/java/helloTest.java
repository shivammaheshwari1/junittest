import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
public class helloTest {
hello hel=new hello();
@Test
public void check(){
System.out.println("test1");
String result = hel.concat("Hello ", "World");
Assert.assertEquals("Hello World", result);
System.out.println(result);
}
@Test
public void checkfail(){
System.out.println("test2");
String result1 = hel.concat("Hello ", "World1");
Assert.assertEquals("Hello World", result);
System.out.println(result);  
}
}
