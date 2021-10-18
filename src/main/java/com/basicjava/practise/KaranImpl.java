package com.basicjava.practise;

public class KaranImpl extends Karan {
	
	
	public static void main(String[] args) {
		
		Karan k=new Karan();
		KaranImpl kimpl=new KaranImpl();
		k=kimpl;
		//kimpl=(Karan)k;
		//kimpl=k;
		k=(KaranImpl)kimpl;
		
		
		
	}

}
