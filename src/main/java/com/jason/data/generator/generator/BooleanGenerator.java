package com.jason.data.generator.generator;

import org.apache.commons.lang3.RandomUtils;

import com.jason.data.generator.utils.Generator;

public class BooleanGenerator extends Generator<Boolean>{

	private int frequencyTrue;
	private int frequencyFalse;
	
	public BooleanGenerator() {
		this.frequencyTrue = 50;
		this.frequencyFalse = 50;
	}

	public BooleanGenerator(int frequencyTrue, int frequencyFalse) {
		this.frequencyTrue = frequencyTrue;
		this.frequencyFalse = frequencyFalse;
	}

	@Override
	public Boolean generateData(String fieldName) {
		Integer frequencyCount = frequencyFalse + frequencyTrue;
		int nextInt = RandomUtils.nextInt(0, frequencyCount);
		return nextInt < frequencyTrue;
	}
	

	
}
