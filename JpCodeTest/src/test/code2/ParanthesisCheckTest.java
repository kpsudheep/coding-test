package test.code2;

import org.junit.Test;

import com.jp.code2.ParanthesisCheck;

import junit.framework.Assert;

public class ParanthesisCheckTest {

	//Test Case 1
	@Test
	public void paranthesisCheckSuccessful() {
		boolean currentOutput = ParanthesisCheck.checkMatch("{ac[bb]}");
		Assert.assertTrue(currentOutput);
	}

	//Test Case 2
	@Test
	public void paranthesisCheckSuccessful2() {
		boolean currentOutput = ParanthesisCheck.checkMatch("[dklf(df(kl))d]{}");
		Assert.assertTrue(currentOutput);
	}
	//Test Case 3
	@Test
	public void paranthesisCheckSuccessful3() {
		boolean currentOutput = ParanthesisCheck.checkMatch("{[[[]]]}");
		Assert.assertTrue(currentOutput);
	}

	//Negative
	//Test Case 4
	@Test
	public void paranthesisCheckFail() {
		boolean currentOutput = ParanthesisCheck.checkMatch("{3234[fd{df][d}");
		Assert.assertFalse(currentOutput);
	}

	//Test Case 5
	@Test
	public void paranthesisCheckFail2() {
		boolean currentOutput = ParanthesisCheck.checkMatch("{df][d}");
		Assert.assertFalse(currentOutput);
	}
}
