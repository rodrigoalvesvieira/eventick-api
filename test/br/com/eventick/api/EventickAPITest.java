package br.com.eventick.api;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class EventickAPITest {
	private EventickAPI api;
	
	@Before()
	public void setup(){
		String token = "abcdefghij";
		this.api = new EventickAPI(token);
	}
	
	@Test()
	public void testInstancing() {
		assertNotNull(this.api.getRequests());
		assertNotNull(this.api.getGson());
	}
}