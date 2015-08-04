/**
 * 
 */
package com.him.juints;

import static org.junit.Assert.*;

import org.junit.Test;

import com.him.comp.HimSensor;
import com.him.exception.HimException;

/**
 * @author absharma
 *
 */
public class TestHimSensor {

	@Test
	public void testHimSensorNull(){
		
		try{
		HimSensor sensor = new HimSensor(null);
		fail("Expected error as sensor should not allow null for instantiation");
		}
		catch(HimException e){
			//ignore this is an expected exception
			
		}
	}
	@Test
	public void testHimSensorEmptyString(){
		try {
			HimSensor sensor = new HimSensor("");
			fail("Expected error as sensor should not allow empty string for instantiation");
		}
		catch(HimException e){
			//ignore this is an expected exception
			
		}
	}
	
	@Test
	public void testHimSensor(){
		try {
			HimSensor sensor = new HimSensor("123456");
			assertTrue(sensor.getSid().equals("123456"));
			
		}
		catch(HimException e){
			fail("An error should not be thrown as the instantiation is done properly");
			
		}
	}

}
