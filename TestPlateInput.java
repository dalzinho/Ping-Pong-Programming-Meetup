import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPlateInput {

	PlateInput plate;
	PlateInput plate2;
	PlateInput plate3;
	PlateInput plate4;
	
	@Before
	public void setUp() throws Exception {
			plate = new PlateInput("TA11ABC");
			plate2 = new PlateInput("SA61ABC");
			plate3 = new PlateInput("ZX61ABC");
			plate4 = new PlateInput("ZX61AQC");
	}

	@Test
	public void ageTest() {
		assertEquals(6, plate.getAge());
	}
	
	
	@Test
	public void yearTest(){
		assertEquals(2011, plate.getYear());
	}

	@Test
	public void yearTest61Case(){
		assertEquals(2011, plate2.getYear());
	}
	
	@Test
	public void scotlandQ(){
		assertEquals("Not Scotland", plate3.getScotland());
		assertEquals("Scotland", plate.getScotland());
		
	}
	
	@Test
	public void dvlaOffice(){
		assertEquals("Glasgow", plate.getLocalOffice());
		assertEquals("Inverness", plate3.getLocalOffice());
	}
	
	@Test
	public void testIsValid(){
		assertTrue(plate.isValid()); 
		assertFalse(plate4.isValid());
	}
}
