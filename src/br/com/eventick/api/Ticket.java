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

import com.google.gson.annotations.SerializedName;

/**
 * Representa a entidade de Ingresso (Ticket) na API do Eventick
 * @author Rodrigo Alves
 *
 */
public class Ticket {
	@SerializedName("id")
	private int id;
	
	@SerializedName("name")
	private String name;

	/**
	 * Construtor do ingresso ({@link Ticket})
	 * @param id o ID do ingresso na API do Eventick
	 * @param name o nome/titulo do ingresso
	 */
	public Ticket(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * Informa o ID do ingresso na API do Eventick
	 * @return
	 */
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Informa o nome do Ingresso
	 * @return uma {@link String}
	 */
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}