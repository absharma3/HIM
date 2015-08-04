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

	private String sid = null;
	
	public HimSensor(String sid ) throws HimException {
		if(sid == null || sid.equals(""))
			throw new HimException();
		this.sid = sid;
	}

	public String getSid() {
		// TODO Auto-generated method stub
		return this.sid;
	}
	
	
}
