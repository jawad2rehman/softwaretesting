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

}
