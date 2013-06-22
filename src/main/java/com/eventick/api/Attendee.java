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

package main.java.com.eventick.api;

import java.util.Date;

/**
 * Representa a entidade de Participante (Attendee) na API do Eventick
 * @author Rodrigo Alves
 *
 */
public class Attendee {
	private EventickAPI api;

	private int id;
	
	private String name;
	private String code;
	private String ticket_type;
	
	private Date checked_at;
	
	public Attendee(EventickAPI api) {
		this.api = api;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTicket_type() {
		return this.ticket_type;
	}

	public void setTicket_type(String ticket_type) {
		this.ticket_type = ticket_type;
	}

	public Date getChecked_at() {
		return this.checked_at;
	}

	public void setChecked_at(Date checked_at) {
		this.checked_at = checked_at;
	}
}