import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
public class helloTest {
hello hel=new hello();
@Test
public void check(){
System.out.println("test1");
int result = hel.add(1, 2);
Assert.assertEquals(3, result);
System.out.println(result);
}
@Test
public void checkfail(){
System.out.println("test2");
int result1 = hel.add(1, 2);
Assert.assertEquals(4, result1);
System.out.println(result1);  
}
}
