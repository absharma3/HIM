package com.him.core;

import com.him.comp.HimSensor;
import com.him.exception.HimSenseException;

public class HimController {

	
	public void sense(HimSensor sensor) throws HimSenseException{
		
		if (sensor == null)
			throw new HimSenseException();
		
	}
	
	
	
	
}
