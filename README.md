## Eventick

Wrapper Java para a API JSON do Eventick

Para mais informações sobre a API em si, visite sua página oficial http://developer.eventick.com.br/

* Versão suportada da API: V1
* Versão do wrapper: 0.0.1-beta

## Uso

### Autenticação

A API do Eventick requer autenticação que é realizada através do HTTP por um token de acesso que o serviço lhe oferece, para obter um, basta ter uma conta no Eventick

Para resgatar seu token, rode o seguinte comando `curl` como [documentado na API]:

`curl https://www.eventick.com.br/api/v1/tokens.json --user 'seuemail@gmail.com:senha'`

### Recuperando dados

```java

String meuToken = "abcdefghijlmnopqrstu";
EventickAPI api = new EventickAPI(meuToken);

// Retorna uma lista de todos os seus eventos
List<Event> = api.getMyEvents();

// Obtenha informações de um evento seu pelo id
int idEvento = 1000;
Event evento = api.getEventById(idEvento);

evento.getTitle();      // retorna título do evento
evento.getVenue();      // retorna local do evento
evento.getStart_at();   // data de início do evento
evento.getAPIURL());    // URL do evento na API

evento.getEventWebsiteURL() // URL do evento no site (URL para humanos)

// Obtenha a lista de participantes daquele evento
List<Attendee> = evento.getAttendees();

// Obtenha a lista de ingressos daquele evento
List<Ticket> = evento.getTickets();
```

## Licença

Esse projeto é liberado sob a licença do MIT, uma cópia (em inglês) está na raiz do projeto no arquivo LICENSE.txt

Copyright (c) 2013 Rodrigo Alves

[documentado na API]: http://developer.eventick.com.br/docs#autenticao
