package com.him.section;

import com.him.comp.HimAc;
import com.him.comp.HimLight;

public abstract class HimCorridor {

	private HimAc ac = null;
	private HimLight light  = null;
	private int floor;
	private int id;
	
	public void setFloor(int floorNo){
		this.floor = floorNo;
	}
	
	public HimCorridor(int id) {
		this.id = id;
	}
	
}
