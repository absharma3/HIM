package com.him.juints;
import static org.junit.Assert.*;

import org.junit.Test;

import com.him.core.HimController;
import com.him.exception.HimException;

/**
 * @author Abhimanyu Sharma
 *
 */
public class TestHimController {

	/**
	 * Test method for {@link com.him.core.HimController#sense(com.him.comp.HimSensor)}.
	 */
	@Test
	public void testSenseNullParam() {
		
		HimController ctrl = new HimController();
		try{
			ctrl.sense(null);
			fail("Expected error as sensor can't be null");
			
		}
		catch(HimException e){
			//ignore this is an expected exception
		}
	}

}
