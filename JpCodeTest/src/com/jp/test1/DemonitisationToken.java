package com.jp.test1;

public class DemonitisationToken {

	public static void main(String[] args) {

		// We can use getMaxAmountFromToken in case in future we have more divisor eg- n/5,n/6.
		System.out.println("Max Amount: " + getMaxAmountFromToken(846523425)); //0<n<=1000000000
		
		//But here in this scenario with n/2,n/3 and n/4 optimizedGetMaxAmountFromToken would be optimal solution
		System.out.println("Max Amount: " + optimizedGetMaxAmountFromToken(846523425)); //0<n<=1000000000
	}

	public static int getMaxAmountFromToken(int tokenValue) {
		// Using Math.floor as we need to get rid of the decimal point as bank charges
		int nByTwo = (int) (Math.floor(tokenValue / 2))*2;
		int nByThree = (int) (Math.floor(tokenValue / 3))*3;
		int nByFour =  (int) (Math.floor(tokenValue / 4))*4;
		if (tokenValue % 2 == 0 || tokenValue % 3 == 0) {
			return tokenValue; // for any even number its safe to say you can get two n/2 tokens for maximum profit.
		} else { 
			if (nByTwo>=nByThree && nByTwo>=nByFour ) {
				return nByTwo;
			}else if(nByThree>=nByTwo && nByThree>=nByFour) {
				return nByThree;
			}
		}
		return nByFour;
	}
	
	public static int optimizedGetMaxAmountFromToken(int tokenValue) {
		if (tokenValue % 2 == 0 || tokenValue % 3 == 0) {
			return tokenValue; // for any even number its safe to say you can get two n/2 tokens for maximum profit.
		} else { 
			return  tokenValue - 1; // any odd number and not divisible by 3 max money is (tokenValue - 1)
		}
	}
}
