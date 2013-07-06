package br.com.eventick.api;

import static org.junit.Assert.*;
import org.junit.Test;

public class TicketTest {
	
	@Test()
	public void testCreation() {
		String name = "Designers";
		Ticket tick = new Ticket(10, name);
		assertNotNull(tick);
		assertEquals(tick.getName(), name);
	}
}