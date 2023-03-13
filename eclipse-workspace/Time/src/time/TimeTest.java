package time;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	
	
	@Test
	public void testGetTotalSecondsGood() {
		int seconds = Time.getTotalSeconds("04:04:04");
		assertTrue("The seconds were not calculated properly", seconds==14644);
		//fail("Not yet implemented");
	}

	@Test
	public void testGetTotalSecondsBad() {

		assertThrows(StringIndexOutOfBoundsException.class,
				()-> {Time.getTotalSeconds("10:00");});
	}
	
	
	@Test
	public void testGetTotalSecondsBoundry() {
		int seconds = Time.getTotalSeconds("00:59:59");
		assertTrue("The seconds were not calculated properly", seconds==3599);
		//fail("Not yet implemented");
	}
	
	
	
	
	@Test
	public void testGetTotalMinutesGood() {
		
		int minutes = Time.getTotalMinutes("00:05:00");
		assertTrue("The minutes were not calculated properly", minutes == 5 );
		
		
	}
	
	
	@Test
	public void testGetTotalMinutesBoundry() {
		
		int minutes = Time.getTotalMinutes("00:00:59");
		assertTrue("The minutes were not calculated properly", minutes == 00 );
		
		
	}
	
	@Test
	public void testGetTotaMinutesBad() {

		assertThrows(StringIndexOutOfBoundsException.class,
				()-> {Time.getTotalMinutes("10");});
	}
	
	
	@Test
	void testGetSecondsGood() {
	
	int seconds = Time.getSeconds("00:00:05");
		assertTrue("The seconds were not calculated properly", seconds==5);
		//fail("Not yet implemented");
		
	}
	
	@Test
	void testGetSecondsBoundry() {
	
	int seconds = Time.getSeconds("00:00:00");
		assertTrue("The seconds were not calculated properly", seconds==0);
		//fail("Not yet implemented");
		
	}
	
	
	@Test
	void testGetSecondsBad() {
	

		assertThrows(StringIndexOutOfBoundsException.class,
				()-> {Time.getSeconds("10:00");});
	}
	
	
	


	@Test
	void testGetTotalHoursGood() {
	
	int hours = Time.getTotalHours("05:00:00");
		assertTrue("The hours were not calculated properly", hours==5);
		
	}
	
	
	@Test
	void testGetTotalHoursBoundry() {
	
	int hours = Time.getTotalHours("05:59:59");
		assertTrue("The hours were not calculated properly", hours==5);
		
	}
	
	@Test
	void testGetTotalHoursBad() {
	
		assertThrows(StringIndexOutOfBoundsException.class,
				()-> {Time.getTotalHours("5");});
		
	}
	
	
	
	@Test
	void testGetMilliSecondsGood() {
		int milliSeconds = Time.getMilliSeconds("00:00:00:005");

		assertTrue("The milliSeconds were not calculated", milliSeconds==5);
	}
	
		
	@Test
	void testGetTotalMilliSecondsGood() {
		int milliSeconds = Time.getTotalMilliSeconds("05:05:05:005");

		assertTrue("The milliSeconds were not calculated", milliSeconds==18305005);
	}


}






