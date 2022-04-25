package cz.muni.fi.pa053.hw3.restapi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestApiService {

    public Integer airportTemp(String iata) {
        return null;
    }

    public Integer stockPrice(String stock) {
        String uri = "https://yahoofinance-stocks1.p.rapidapi.com/stock-statistics?Symbol=" + stock;

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        if (result != null) {
            return Integer.parseInt(result);
        }

        return null;
    }

    public Integer evalExpression(String expression) {
        return null;
    }
}
