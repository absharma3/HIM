/**
 * 
 */
package com.him.comp;

import com.him.exception.HimException;

/**
 * @author absharma
 *
 */
public class HimSensor extends HimComponent {

	String sid = null;
	
	public HimSensor(String sid ) throws HimException {
		if(sid == null)
			throw new HimException();
		this.sid = sid;
	}
	
	
}
