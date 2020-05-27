import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class ArithmaticUnitTests {

	@Test
	public void testAdd() {
		//Happy Path unit test
		double a = 1;
		double b = 2;
		double expected = 3;
		ArithmaticFunctions obj = new ArithmaticFunctions();
		Assert.assertEquals(obj.Add(a, b), expected, 0.00001);
	}
	@Test
	public void testAddRandom() {
		//Random Value unit test
		double a = new Random().nextInt(1000);
		double b = new Random().nextInt(1000);
		double expected = a + b;
		ArithmaticFunctions obj = new ArithmaticFunctions();
		Assert.assertEquals(obj.Add(a, b), expected, 0.00001);
	}
	
	@Test
	public void testSubtract() {
		//Happy Path unit test
		double a = 3;
		double b = 2;
		double expected = 1;
		ArithmaticFunctions obj = new ArithmaticFunctions();
		Assert.assertEquals(obj.Subtract(a, b), expected, 0.00001);
	}
	@Test
	public void testSubtractRandom() {
		//Random Value unit test
		double a = new Random().nextInt(1000);
		double b = new Random().nextInt(1000);
		double expected = a - b;
		ArithmaticFunctions obj = new ArithmaticFunctions();
		Assert.assertEquals(obj.Subtract(a, b), expected, 0.00001);
	}

}
