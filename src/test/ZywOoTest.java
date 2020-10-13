package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.ZywOo;

public class ZywOoTest {

	@Test
	public void basicTests() {
		assertArrayEquals("should return the first 3 items", new int[] { 0, 1, 2 },
				ZywOo.take(new int[] { 0, 1, 2, 3, 5, 8, 13 }, 3));
	}

	/*
	 * Testing with
	 * array[-7,37,44,-38,-70,-9,-18,64,14,-74,31,47,-41,54,-72,-48,-37,-73,41,-26,
	 * 35,12,-47] and n = 61: array lengths differed,expected.length=23
	 * actual.length=61
	 */

	@Test
	public void test2() {
		assertArrayEquals("doit retourner les 4 premiers items", new int[] { 0, 1, 2, 3 },
				ZywOo.take(new int[] { 0, 1, 2, 3, 4, 5, 6 }, 4));
	}

	@Test
	public void test3() {
		assertArrayEquals("doit retourner tous les items compris dans la plage 0 à 61",
				new int[] { -7, 37, 44, -38, -70, -9 }, ZywOo.take(new int[] { -7, 37, 44, -38, -70, -9 }, 61));
	}

	@Test
	public void test4TableauVide() {
		assertArrayEquals("cas d'un tableau vide length=0", new int[] {}, ZywOo.take(new int[] {}, 3));
	}
}
