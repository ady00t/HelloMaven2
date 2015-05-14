import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class MainTest {

	@Test
	public void testPasses() {
      int a = 1;
      Assert.assertEquals(1, a);
	}

	@Test
	public void testFail() {
      fail(" this is ment to fail");
	}

}
