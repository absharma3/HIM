/**
 * 
 */
package com.him.section;

import java.util.ArrayList;

/**
 * @author absharma
 *
 */
public class HimHotel {

	private ArrayList<HimFloor> floors = new ArrayList<HimFloor>();
	public ArrayList<HimFloor> getFloors() {
		return floors;
	}

	public ArrayList<HimMainCorridor> getMainCorridors() {
		return mainCorridors;
	}

	public ArrayList<HimSubCorridor> getSubCorridors() {
		return subCorridors;
	}

	private ArrayList<HimMainCorridor> mainCorridors = new ArrayList<HimMainCorridor>();
	private ArrayList<HimSubCorridor> subCorridors = new ArrayList<HimSubCorridor>();
	
	public HimHotel(int noOfFloor, int noOfCorridorPF, int noOfSubCorridorPF) {
		HimFloor floor; 
		HimMainCorridor mainCorr;
		HimSubCorridor subCorr;
		for (int i = 0; i <= noOfFloor; i++) {
			floor = new HimFloor(i);
			for (int j = 0; j < noOfCorridorPF; j++){
				mainCorr = new HimMainCorridor(j);
				floor.addMainCorridor(mainCorr);
				mainCorridors.add(mainCorr);
			}
			for (int j = 0; j < noOfSubCorridorPF; j++){
				subCorr = new HimSubCorridor(j);
				floor.addSubCorridor(subCorr);
				subCorridors.add(subCorr);
			}
			floors.add(floor);
		}
	}
	
}
