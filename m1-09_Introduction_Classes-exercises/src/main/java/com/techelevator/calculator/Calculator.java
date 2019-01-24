package com.techelevator.calculator;

public class Calculator {

	private int currentValue;

	public int getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}
	
	
		public int add(int addend) {
			currentValue += addend;
			return currentValue;
		}
	    public int multiply(int multiplier) {
	    	currentValue *=multiplier;
	    	return currentValue;
	    }
	    public int subtract(int subtrahend) {
	    	currentValue -=subtrahend;
	    	return currentValue;
	    }
	    public int power(int exponent) {
	    	if(exponent == 0) {
	    		currentValue = 1;
	    	}
	    	else {
	    		currentValue =(int) Math.pow((double)currentValue, (double)exponent);
	    		return currentValue;
	    	}
			return currentValue;
	    	
			
	    	
	    	
	    }
	    public void reset() {
	    	currentValue = 0;
	    	
	    }
	
	
}
