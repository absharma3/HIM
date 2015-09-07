package com.him.core;

import com.him.comp.HimSensor;
import com.him.exception.HimException;
import com.him.section.HimHotel;

public class HimController {

	HimHotel hotel = null;
	
	public HimController(int noOfFloor, int noOfCorridorPF, int noOfSubCorridorPF) {
		this.hotel = new HimHotel(noOfFloor, noOfCorridorPF, noOfSubCorridorPF);
	}
	
	public void sense(HimSensor sensor) throws HimException{
		
		if (sensor == null)
			throw new HimException();
		String[] data = sensor.getSid().split(":");
		
	}
	
	
	
	
}
