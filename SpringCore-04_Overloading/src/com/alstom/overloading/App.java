package com.alstom.overloading;

public class App extends COne {

	public static void main(String[] args) {
		Object object = new CThree();
//		CTwo cTwo = (CTwo) object;
//		cTwo.methodOne();
//		cTwo.methodTwo();
		COne cOne =(COne) object;
		cOne.methodOne();
		
	}

}
