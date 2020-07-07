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
}
