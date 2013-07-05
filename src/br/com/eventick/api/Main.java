package br.com.eventick.api;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import org.apache.log4j.Logger;

public class Main {
    private static Logger log = Logger.getLogger(EventickAPI.class);  
	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
		
		String meuToken = "ENGb1waVGydVbGwQr8U2";
		EventickAPI api = new EventickAPI(meuToken);
		
		int idEvento = 492;
		Event evento = api.getEventById(idEvento);
	
		api.getEventById(idEvento);
		
		System.out.println(evento.getTitle());
		System.out.println(evento.getVenue());
	}
}