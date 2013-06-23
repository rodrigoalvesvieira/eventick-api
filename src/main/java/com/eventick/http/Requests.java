package main.java.com.eventick.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.concurrent.ExecutionException;
import com.ning.http.client.AsyncCompletionHandler;
import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.ListenableFuture;
import com.ning.http.util.Base64;

public class Requests {
	private final AsyncHttpClient asyncClient;
	
	public Requests() {
		this.asyncClient = new AsyncHttpClient();
	}
	
	/**
	 * Gets the response body of the given URL
	 * @param urlStr
	 * @return
	 * @throws IOException
	 */
	public String get(String urlStr, String token) throws IOException {
		try {
			String encoded = URLEncoder.encode(token + ":", "UTF-8");
			return this.asyncClient.prepareGet(urlStr).addHeader("Authorization", "Basic " + encoded).execute().get().getResponseBody();
		} catch (InterruptedException e) {
			e.printStackTrace();
			try {
				throw new HttpException(e);
			} catch (HttpException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (ExecutionException e) {
			e.printStackTrace();
			try {
				throw new HttpException(e);
			} catch (HttpException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return urlStr;
	}
	
	public <T> ListenableFuture<T> getAsync(String urlStr, AsyncCompletionHandler<T> callback) throws IOException {
		return asyncClient.prepareGet(urlStr).execute(callback);
	}
	
	/**
	 * 
	 * @param s a String representing an URL
	 * @return an UTF-8 decoded String derived from the given URL
	 */
	public String decodeURL(String s) {
		try {
			return URLDecoder.decode(s, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			try {
				throw new HttpException(e);
			} catch (HttpException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		return s;
	}
}