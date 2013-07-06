package br.com.eventick.api;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AttendeeTest {
	private EventickAPI api;
	
	@Before()
	public void setup(){
		this.api = new EventickAPI("");
	}
	
	@Test()
	public void testCreation() {
		String name = "Caetano";
		Attendee testAtt = new Attendee(this.api, 10, name);
		assertNotNull(testAtt);
		assertEquals(testAtt.getName(), name);
	}
}