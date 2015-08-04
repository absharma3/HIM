/**
 * 
 */
package com.him.section;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abhimanyu Sharma
 *
 */
public class HimFloor {
	private int floorId;

	public HimFloor(int floorNo) {
		floorId = floorNo;
	}
	private List<HimMainCorridor> mainCorridors = new ArrayList<HimMainCorridor>();
	private List<HimSubCorridor> subCorridors = new ArrayList<HimSubCorridor>();

	public void addMainCorridor(HimMainCorridor himMainCorridor) {
		himMainCorridor.setFloor(this.floorId);
		mainCorridors.add(himMainCorridor);
	}

	public void addSubCorridor(HimSubCorridor himSubCorridor) {
		himSubCorridor.setFloor(this.floorId);
		subCorridors.add(himSubCorridor);
		
	}	
	
}
