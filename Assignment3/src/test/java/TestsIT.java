import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestsIT {

	@Test
	public void IntegrationTestSub() {
		
		// we will provide output of one class as input to second class and test the working
		ArithmaticFunctions classA = new ArithmaticFunctions();
		AlgebraicFunctions classB = new AlgebraicFunctions();
		
		double a = classA.Add(1, 1);
		double b  = classA.Subtract(2, 1);
		
		double expected = 3;
		
		Assert.assertEquals(classB.asqaureminusbsqaure(a, b), expected, 0.00001);
	}
	@Test
	public void IntegrationTest2() {
		
		// we will provide output of one class as input to second class and test the working
		ArithmaticFunctions classA = new ArithmaticFunctions();
		AlgebraicFunctions classB = new AlgebraicFunctions();
		
		double a = classA.Add(1, 1);
		double b  = classA.Add(2, 1);
		
		double expected = 25;
		
		Assert.assertEquals(classB.aplusbwholesquare(a, b), expected, 0.00001);
	}

}
