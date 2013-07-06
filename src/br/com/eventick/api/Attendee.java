// Copyright (c) 2013 Rodrigo Alves
//
// Permission is hereby granted, free of charge, to any person obtaining
// a copy of this software and associated documentation files (the
// "Software"), to deal in the Software without restriction, including
// without limitation the rights to use, copy, modify, merge, publish,
// distribute, sublicense, and/or sell copies of the Software, and to
// permit persons to whom the Software is furnished to do so, subject to
// the following conditions:
//
// The above copyright notice and this permission notice shall be
// included in all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
// EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
// MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
// LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
// OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
// WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

package br.com.eventick.api;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

/**
 * Representa a entidade de Participante (Attendee) na API do Eventick
 * @author Rodrigo Alves
 *
 */
public class Attendee {
	private EventickAPI api;

    @SerializedName("id")
	private int id;

    @SerializedName("name")
	private String name;

	@SerializedName("code")
	private String code;

	@SerializedName("ticket_type")
	private String ticketType;

	@SerializedName("checked_at")
	private Date checkedAt;

	/**
	 * Construtor do {@link Attendee}
	 * @param api um objeto {@link EventickAPI} com token
	 */
	public Attendee(EventickAPI api) {
		this.api = api;
	}
	
	/**
	 * Construtor secundario do {@link Attendee}
	 * @param api um objeto {@link EventickAPI} com token
	 * @param id o ID do participante na API do Eventick
	 * @param name o nome do participante na API do Eventick
	 */
	public Attendee(EventickAPI api, int id, String name) {
		this(api);
		this.id = id;
		this.name = name;
	}
	
	/**
	 * Construtor completo do {@link Attendee}
	 * @param api um objeto {@link EventickAPI} com token
	 * @param id o ID do participante na API do Eventick
	 * @param name o nome do participante na API do Eventick
	 * @param code
	 * @param ticketType o tipo de ingresso ({@link Ticket}) do participante
	 * @param checkedAt a data ({@link Date}) do check-in do participante
	 */
	public Attendee(EventickAPI api, int id, String name, String code, String ticketType, Date checkedAt) {
		this(api);
		this.id = id;
		this.name = name;
		this.code = code;
		this.ticketType = ticketType;
		this.checkedAt = checkedAt;
	}

	public EventickAPI getApi() {
		return this.api;
	}

	public void setApi(EventickAPI api) {
		this.api = api;
	}

	/**
	 * Retorna o ID do participante na API do Eventick
	 * @return
	 */
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Informa o nome do participante ({@link Attendee})
	 * @return um objeto {@link String}
	 */
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Informa o codigo do participante {@link Attendee}
	 * @return
	 */
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Informa o tipo do ingresso
	 * @return uma {@link String}
	 */
	public String getTicketType() {
		return this.ticketType;
	}

	public void setTicketType(String ticket_type) {
		this.ticketType = ticket_type;
	}

	/**
	 * Informa a data de check-in do participante ({@link Attendee}
	 * @return um objeto {@link Date}
	 */
	public Date getCheckedAt() {
		return this.checkedAt;
	}

	public void setCheckedAt(Date checked_at) {
		this.checkedAt = checked_at;
	}
}