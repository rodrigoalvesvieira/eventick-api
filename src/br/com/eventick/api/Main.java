package br.com.eventick.api;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
		
		String meuToken = "ENGb1waVGydVbGwQr8U2";
		EventickAPI api = new EventickAPI(meuToken);
		
		int idEvento = 492;
		Event evento = api.getEventById(idEvento);
	
		api.getEventById(idEvento);
		
		System.out.println(evento.getTitle());
		System.out.println(evento.getVenue());
		System.out.println(evento.getStartAt());
		System.out.println(evento.getAPIURL());

		System.out.println(evento.getWebsiteURL());
		
		int index = 0;
		
		for (Event e: api.getMyEvents()) {
			System.out.println("Evento " + ++index);
			System.out.println(e.getTitle() + " - " + e.getAPIURL());
		}
	}
}