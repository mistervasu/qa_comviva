package Assert_Tests;

import org.junit.Test;

import stringUtilsPack.StringUtils;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;;


public class StringUtilsTest {
	
		@Test
		public void TestReverse()
		{
			StringUtils str = new StringUtils();
		
			assertNotNull(str.reverse("Waseem"),"Input String is Null, please pass a valid string");
			assertEquals("meesaW",str.reverse("Waseem"));
			assertEquals("", str.reverse(""));
		    assertEquals("a", str.reverse("a"));
		}
		
		@Test
		public void TestPalindrome()
		{
			StringUtils str = new StringUtils();
		
			assertTrue(str.isPalindrome("malayalam"));
		//		assertFalse(str.isPalindrome("radar"));
			assertTrue(str.isPalindrome(""));
		}
	
		  @Test
		  public void testConcatenate() {
		      StringUtils stringUtils = new StringUtils();
		      assertEquals("HelloWorld", stringUtils.concatenate("Hello", "World"));
		  assertEquals("Hello", stringUtils.concatenate("Hello", ""));
		  assertEquals("World", stringUtils.concatenate("", "World"));
		  }
		
		  @Test
		  public void testCountOccurrences() {
		      StringUtils stringUtils = new StringUtils();
		      assertEquals(2, stringUtils.countOccurrences("hello", 'l'));
		  assertEquals(0, stringUtils.countOccurrences("", 'a'));
		  assertEquals(1, stringUtils.countOccurrences("abc", 'a'));
		  }
}


























