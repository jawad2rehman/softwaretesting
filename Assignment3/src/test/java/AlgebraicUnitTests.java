import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class AlgebraicUnitTests {

	@Test
	public void testAlgebraic1() {
		//Happy Path unit test
		double a = 2;
		double b = 1;
		double expected = 3;
		AlgebraicFunctions obj = new AlgebraicFunctions();
		Assert.assertEquals(obj.asqaureminusbsqaure(a, b), expected, 0.00001);
	}
	
	@Test
	public void testAlgebraic2() {
		//Happy Path unit test
		double a = 2;
		double b = 1;
		double expected = 9;
		AlgebraicFunctions obj = new AlgebraicFunctions();
		Assert.assertEquals(obj.aplusbwholesquare(a, b), expected, 0.00001);
	}
	@Test
	public void testAlgebraic3() {
		//Boundary values unit test
		double a = new Random().nextInt(999);
		double b = new Random().nextInt(999);;
		double expected = (a+b) * (a+b);
		// calculating expected using the algebraic equation
		AlgebraicFunctions obj = new AlgebraicFunctions();
		Assert.assertEquals(obj.aplusbwholesquare(a, b), expected, 0.00001);
	}

}
