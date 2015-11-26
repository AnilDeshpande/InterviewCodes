package com.simple.codes;

class NumDifferences implements Comparable<NumDifferences>{
	private int firstNumber;
	private int secondNumber;
	
	private int absolutedifference;

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public int getAbsolutedifference() {
		return absolutedifference;
	}

	public void setAbsolutedifference(int absolutedifference) {
		this.absolutedifference = absolutedifference;
	}
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return this.absolutedifference==((NumDifferences)arg0).absolutedifference;
	}
	
	@Override
	public int compareTo(NumDifferences arg0) {
		// TODO Auto-generated method stub
		return this.absolutedifference - arg0.absolutedifference;
	}
}

public class SimpleCodes {

	public static int [] nums = new int []{10,20,30,-10,5,-4, -20,-24, -30};
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=0;
		for(int i=0;i<nums.length;i++){
			for(int j=i+1; j<nums.length;j++){
				int diff=Math.abs(nums[i]-nums[j]);
				
			}
		}
	}

}
