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
		return this.sid;
	}
	
	@Override
	public int hashCode() {
		return this.getSid().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		HimSensor sensor;
		try{
			sensor =(HimSensor)obj;
		}
		catch(ClassCastException e){
			return false;
		}
		return this.hashCode()== sensor.hashCode();
	}
	
	
}
