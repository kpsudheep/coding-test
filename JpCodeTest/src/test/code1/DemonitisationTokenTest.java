package test.code1;

import org.junit.Assert;
import org.junit.Test;

import com.jp.code1.DemonitisationToken;

public class DemonitisationTokenTest {
	
	//Positive 
	//Test1
	@Test
	public void demonitisationTokenSuccessful() 
	{
		int expectedOutput = 846523422;
		int currentOutput = DemonitisationToken.getMaxAmountFromToken(846523423);
		
		Assert.assertEquals(expectedOutput , currentOutput);
		
	}
	
	//Test2
	@Test
	public void demonitisationTokenOptimisedSuccessful() 
	{
		int expectedOutput = 846523422;
		int currentOutput = DemonitisationToken.optimizedGetMaxAmountFromToken(846523423);
		
		Assert.assertEquals(expectedOutput , currentOutput);
		
	}

	//Negative
	//Test3
		@Test
		public void demonitisationTokenFail() 
		{
			int expectedOutput = 846523423;
			int currentOutput = DemonitisationToken.getMaxAmountFromToken(846523423);
			
			Assert.assertFalse(expectedOutput == currentOutput);
			
		}
		
	//Test4
	@Test
	public void demonitisationTokenOptimisedFail() 
	{
		int expectedOutput = 846523423;
		int currentOutput = DemonitisationToken.optimizedGetMaxAmountFromToken(846523423);
		
		Assert.assertFalse(expectedOutput == currentOutput);
		
	}

}
