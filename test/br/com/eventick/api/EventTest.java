package br.com.eventick.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class EventTest {
	private EventickAPI api;
	
	@Before()
	public void setup(){
		this.api = new EventickAPI("");
	}
	
	@Test()
	public void testCreation() {
		String title = "Tributo a Jimi Hendrix";
		String venue = "Burburinho";
		Event eve = new Event(this.api, 10, title, venue);
		assertNotNull(eve);
		assertEquals(eve.getTitle(), title);
		assertEquals(eve.getVenue(), venue);
	}

}