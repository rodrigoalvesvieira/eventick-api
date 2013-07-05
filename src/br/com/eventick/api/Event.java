/**
 * Copyright (c) 2013 Rodrigo Alves
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to use, copy and modify copies of the Software, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package br.com.eventick.api;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * Representa a entidade de Evento (Event) na API do Eventick
 * @author Rodrigo Alves
 *
 */
public class Event {
	private EventickAPI api;
	
	public static String URL = EventickAPI.URL + "/events";
	private int id;
	
	private String title;
	private String venue;
	private String slug;
	
	private Date start_at;
	
	private List<Attendee> attendees;
	private List<Ticket> tickets;
	
	public Event(EventickAPI api) {
		this.api = api;
	}
	
	public Event(EventickAPI api, int id, String title, String venue) {
		this(api);
		this.id = id;
		this.venue = venue;
	}
	
	public EventickAPI getApi() {
		return this.api;
	}

	public void setApi(EventickAPI api) {
		this.api = api;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVenue() {
		return this.venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getSlug() {
		return this.slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public Date getStart_at() {
		return this.start_at;
	}

	public void setStart_at(Date start_at) {
		this.start_at = start_at;
	}

	public List<Attendee> getAttendees() throws IOException, InterruptedException, ExecutionException {
		this.setAttendees();
		return this.attendees;
	}

	public void setAttendees() throws IOException, InterruptedException, ExecutionException {
		String fetchURL = String.format("%s/%d/attendees", URL, this.id);
		String json = api.getRequests().get(fetchURL, this.getApi().getToken());
		JsonObject jsonObject = api.getGson().fromJson(json, JsonElement.class).getAsJsonObject();			
		JsonArray jsonArray = jsonObject.get("attendees").getAsJsonArray();
		
		String strAtt;
		Attendee att;
		int i = 0;
		
		for (; i < jsonArray.size(); i++) {
			strAtt = jsonArray.get(i).toString();
			att = this.api.getGson().fromJson(json, Attendee.class);
			att.setApi(this.getApi());
			
			this.attendees.add(att);
		}
	}
	
	public List<Ticket> getTickets() throws IOException, InterruptedException, ExecutionException {
		this.setTickets();
		return this.tickets;
	}
	
	public void setTickets() throws IOException, InterruptedException, ExecutionException {
		String fetchURL = String.format("%s/%d", URL);
		String json = api.getRequests().get(fetchURL, this.getApi().getToken());
		JsonObject jsonObject = api.getGson().fromJson(json, JsonElement.class).getAsJsonObject();			
		JsonArray jsonArray = jsonObject.get("tickets").getAsJsonArray();
		
		String strTick;
		Ticket tick;
		int i = 0;
		
		for (; i < jsonArray.size(); i++) {
			strTick = jsonArray.get(i).toString();
			tick = this.api.getGson().fromJson(json, Ticket.class);
			
			this.tickets.add(tick);
		}
	}
	
	public String getEventWebsiteURL() {
		return String.format("http://eventick.com.br/%s", this.getSlug());
	}

	public String getEventURL() {
		return String.format("%s/%d", URL, this.id);
	}
}