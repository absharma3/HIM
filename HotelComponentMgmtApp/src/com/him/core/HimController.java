package com.him.core;

import com.him.comp.HimSensor;
import com.him.exception.HimException;

public class HimController {

	
	public void sense(HimSensor sensor) throws HimException{
		
		if (sensor == null)
			throw new HimException();
		
	}
	
	
	
	
}
