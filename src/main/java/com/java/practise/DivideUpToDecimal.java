package com.java.practise;

import java.text.DecimalFormat;

public class DivideUpToDecimal {
	
	public void m1(Integer n1,Integer n2) {
		if(n1>=0 && n2<=10000) {
			double result=n2.doubleValue()/n1.doubleValue();
			DecimalFormat obj_for=new DecimalFormat("#.###");
			System.out.println(obj_for.format(result));
		}else {
			System.out.println(0);
		}
		
		
	}
	
	public static void main(String[] args) {
		Integer n1=55;
		Integer n2=65;
		new DivideUpToDecimal().m1(n1, n2);;
	}

}
