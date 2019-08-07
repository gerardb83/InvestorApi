package co.grandcircus.InvestorApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.InvestorApi.entities.Book;
import co.grandcircus.InvestorApi.entities.Quote;
import co.grandcircus.InvestorApi.entities.RequestResponse;
import co.grandcircus.InvestorApi.entities.Spread;


@Component
public class InvestorApiService {

		private String API_KEY = "bcc2d467e7msh1a87a6dcced3533p146999jsn0e619dc9c4d2";
		private String rapidHost = "investors-exchange-iex-trading.p.rapidapi.com";
		private String rapidKey = "bcc2d467e7msh1a87a6dcced3533p146999jsn0e619dc9c4d2";
		
		private RestTemplate restTemplate;
		
		{
		    // This configures the restTemplateWithUserAgent to include a User-Agent header with every HTTP
			// request. Some of the APIs in this demo have a bug where User-Agent is required.
			ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
		        request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
		        return execution.execute(request, body);
		    };
		    restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
		}
		
		public List<Spread> effectiveSpread() {
			String url = "https://investors-exchange-iex-trading.p.rapidapi.com/stock/msft/effective-spread";
			
			HttpHeaders headers = new HttpHeaders();
			headers.add("X-Api-Key", API_KEY);
			headers.add("x-rapidapi-host", rapidHost);
			headers.add("x-rapidapi-key", rapidKey);
			
			List<Spread> list = new ArrayList<>();
			Spread[] spreads = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(headers), Spread[].class).getBody();
			for (Spread each : spreads) {
				list.add(each);
			}
			return list;
		}
		
		public Quote getQuote(String symbol) {
			String url = "https://investors-exchange-iex-trading.p.rapidapi.com/stock/" + symbol + "/book";
			
			HttpHeaders headers = new HttpHeaders();
			headers.add("X-Api-Key", API_KEY);
			headers.add("x-rapidapi-host", rapidHost);
			headers.add("x-rapidapi-key", rapidKey);
			
			
			Book book = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(headers), Book.class).getBody();
			
			
			return book.getQuote();
		}
		

}
