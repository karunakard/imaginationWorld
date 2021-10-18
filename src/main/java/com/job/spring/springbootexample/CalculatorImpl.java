package com.job.spring.springbootexample;

interface Calculator {
	//void SwitchOff();
	 //void sum(int i);
	
	int subtract(int i1,int i2);
	
	
}


public class CalculatorImpl{
	
	public static void main(String[] args) {
		
		/*
		 * Calculator cal=() ->{ System.out.println("switchOff");
		 * 
		 * }; cal.SwitchOff();
		 */
		
		/*
		 * Calculator c=(i1)->{ System.out.println(i1); }; c.sum(200);
		 */
		Calculator c=(i1,i2)->{
			return i1-i2;
		};
		System.out.println(c.subtract(20, 10));
		
	}

	
	 

	
	
	

}
