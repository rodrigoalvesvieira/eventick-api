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

/**
 * Classe base de todos os erros oriundos da API do Eventick
 * Qualquer outra classe de erro (exception) no projeto deve herdar dessa
 * @author Rodrigo Alves
 *
 */
public class EventickAPIException extends Exception {
	private static final long serialVersionUID = -3563928267422310893L;
	private String code;
	private Throwable cause;
	
	public EventickAPIException(String message) {
		super(message);
	}
	
	public EventickAPIException(String message, String code) {
		this(message);
		this.code = code;
	}
	
	public EventickAPIException(Throwable cause) {
		this.cause = cause;
	}
	
	public EventickAPIException(String message, Throwable cause) {
		this(message);
		this.cause = cause;
	}
}