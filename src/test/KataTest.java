package test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import main.Kata;

public class KataTest {
	Kata k = new Kata();

	@Test
	public void SampleTests() {
		assertEquals(Arrays.asList(1), k.CreateList(1));
		assertEquals(Arrays.asList(1, 2), k.CreateList(2));
		assertEquals(Arrays.asList(1, 2, 3), k.CreateList(3));
		assertEquals(Arrays.asList(1, 2, 3, 4), k.CreateList(4));
		assertEquals(Arrays.asList(1, 2, 3, 4, 5), k.CreateList(5));
	}
}
