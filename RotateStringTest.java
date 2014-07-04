import static org.junit.Assert.*;
import org.junit.Test;

/*
 * This class is the Unit Test for the RotateString.java rotate function. 
 * 
 * Assignment 4 of STEP at Google Tokyo
 * @author Naho Kitade
 */
public class RotateStringTest {

	/*
	 * Tests for continuous negative numbers, and a large negative number. 
	 */
	@Test
	public void testRotateN1() {
		assertTrue("bcdefghijklmnopqrstuvwxyza".equals(RotateString.rotate("abcdefghijklmnopqrstuvwxyz", -1)));
	}
	@Test
	public void testRotateN2() {
		assertTrue("cdefghijklmnopqrstuvwxyzab".equals(RotateString.rotate("abcdefghijklmnopqrstuvwxyz", -2)));
	}
	@Test
	public void testRotateN3() {
		assertTrue("defghijklmnopqrstuvwxyzabc".equals(RotateString.rotate("abcdefghijklmnopqrstuvwxyz", -3)));
	}
	@Test
	public void testRotateN4() {
		assertTrue("efghijklmnopqrstuvwxyzabcd".equals(RotateString.rotate("abcdefghijklmnopqrstuvwxyz", -4)));
	}
	@Test
	public void testRotateN5() {
		assertTrue("fghijklmnopqrstuvwxyzabcde".equals(RotateString.rotate("abcdefghijklmnopqrstuvwxyz", -5)));
	}
	@Test
	public void testRotateN100() {
		assertTrue("wxyzabcdefghijklmnopqrstuv".equals(RotateString.rotate("abcdefghijklmnopqrstuvwxyz", -100)));
	}
	
	/*
	 * Tests for continuous numbers, and a large number. 
	 */
	@Test
	public void testRotate1() {
		assertTrue("zabcdefghijklmnopqrstuvwxy".equals(RotateString.rotate("abcdefghijklmnopqrstuvwxyz", 1)));
	}
	@Test
	public void testRotate2() {
		assertTrue("yzabcdefghijklmnopqrstuvwx".equals(RotateString.rotate("abcdefghijklmnopqrstuvwxyz", 2)));
	}
	@Test
	public void testRotate3() {
		assertTrue("xyzabcdefghijklmnopqrstuvw".equals(RotateString.rotate("abcdefghijklmnopqrstuvwxyz", 3)));
	}
	@Test
	public void testRotate4() {
		assertTrue("wxyzabcdefghijklmnopqrstuv".equals(RotateString.rotate("abcdefghijklmnopqrstuvwxyz", 4)));
	}
	@Test
	public void testRotate5() {
		assertTrue("vwxyzabcdefghijklmnopqrstu".equals(RotateString.rotate("abcdefghijklmnopqrstuvwxyz", 5)));
	}
	@Test
	public void testRotate100() {
		assertTrue("wxyzabcdefghijklmnopqrstuv".equals(RotateString.rotate("abcdefghijklmnopqrstuvwxyz", -100)));
	}
	
	/*
	 * Tests for long string inputs with large number and small number rotations.
	 */
	@Test
	public void testRotateLongMany() {
		String longString = "abcdefghijklmnopqrstuvwxyz0123456789abcdefghijklmnopqrstuvwxyz0123456789abcdefghijklmnopqrstuvwxyz0123456789";
		String longStringRotate = "ijklmnopqrstuvwxyz0123456789abcdefghijklmnopqrstuvwxyz0123456789abcdefghijklmnopqrstuvwxyz0123456789abcdefgh";
		assertTrue(longStringRotate.equals(RotateString.rotate(longString, 100)));
	}
	@Test
	public void testRotateLongLittle() {
		String longString = "abcdefghijklmnopqrstuvwxyz0123456789abcdefghijklmnopqrstuvwxyz0123456789abcdefghijklmnopqrstuvwxyz0123456789";
		String longStringRotate = "89abcdefghijklmnopqrstuvwxyz0123456789abcdefghijklmnopqrstuvwxyz0123456789abcdefghijklmnopqrstuvwxyz01234567";
		assertTrue(longStringRotate.equals(RotateString.rotate(longString, 2)));
	}
	
	/*
	 * Tests for short string inputs with large number and small number rotations.
	 */
	@Test
	public void testRotateShortMany() {
		assertTrue("ab".equals(RotateString.rotate("ab", 100)));
	}
	@Test
	public void testRotateShortLittle() {
		assertTrue("ba".equals(RotateString.rotate("ab", 1)));
	}
	
	/*
	 * Tests for special empty string and 0 rotations.
	 */
	@Test
	public void testRotateNone() {
		assertTrue("".equals(RotateString.rotate("", 100)));
	}
	@Test
	public void testDontRotate() {
		assertTrue("abcdefghijklmnopqrstuvwxyz".equals(RotateString.rotate("abcdefghijklmnopqrstuvwxyz", 0)));
	}
}
