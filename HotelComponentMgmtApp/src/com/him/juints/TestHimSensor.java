/**
 * 
 */
package com.him.juints;

import static org.junit.Assert.*;

import org.junit.Test;

import com.him.comp.HimComponent;
import com.him.comp.HimSensor;
import com.him.exception.HimException;

/**
 * @author absharma
 *
 */
public class TestHimSensor {

	@Test
	public void testHimSensorNull() {

		try {
			@SuppressWarnings("unused")
			HimSensor sensor = new HimSensor(null);
			fail("Expected error as sensor should not allow null for instantiation");
		} catch (HimException e) {
			// ignore this is an expected exception

		}
	}

	@Test
	public void testHimSensorEmptyString() {
		try {
			@SuppressWarnings("unused")
			HimSensor sensor = new HimSensor("");
			fail("Expected error as sensor should not allow empty string for instantiation");
		} catch (HimException e) {
			// ignore this is an expected exception

		}
	}

	@Test
	public void testHimSensor() {
		try {
			HimSensor sensor = new HimSensor("123456");
			assertTrue(sensor.getSid().equals("123456"));

		} catch (HimException e) {
			fail("An error should not be thrown as the instantiation is done properly");

		}
	}

	@Test
	public void ptestHashCode() throws HimException {
		HimSensor sensor = new HimSensor("123456");
		assertTrue(sensor.hashCode() == "123456".hashCode());
	}

	@Test
	public void ntestHashCode() throws HimException {
		HimSensor sensor = new HimSensor("123456");
		assertTrue(sensor.hashCode() != "12345".hashCode());
	}

	@Test
	public void ptestEquals1() throws HimException {
		HimSensor sensor1 = new HimSensor("hsakdh");
		HimSensor sensor2 = new HimSensor("123456");
		assertFalse(sensor1.equals(sensor2));
	}

	@Test
	public void ptestEquals2() throws HimException {
		HimSensor sensor1 = new HimSensor("123456");
		HimSensor sensor2 = new HimSensor("123456");
		assertTrue(sensor1.equals(sensor2));
	}

	@Test
	public void ntestEquals1() throws HimException {
		HimSensor sensor1 = new HimSensor("123456");
		HimComponent com1 = new HimComponent() {
		};
		assertFalse(sensor1.equals(com1));
	}
}
