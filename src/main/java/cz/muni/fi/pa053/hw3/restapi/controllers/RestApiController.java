package cz.muni.fi.pa053.hw3.restapi.controllers;

import cz.muni.fi.pa053.hw3.restapi.service.RestApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class RestApiController {

    RestApiService restApiService;

    @Autowired
    public RestApiController(RestApiService restApiService) {
        this.restApiService = restApiService;
    }

    @RequestMapping(value = "/endpoint", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer handle(
            @RequestParam(value = "queryAirportTemp", required = false) String queryAirportTemp,
            @RequestParam(value = "queryStockPrice", required = false) String queryStockPrice,
            @RequestParam(value = "queryEval", required = false) String queryEval
    ) {
        if (queryAirportTemp != null && queryStockPrice == null && queryEval == null) {
            return restApiService.airportTemp(queryAirportTemp);
        } else if (queryAirportTemp == null && queryStockPrice != null && queryEval == null) {
            return  restApiService.stockPrice(queryStockPrice);
        } else if (queryAirportTemp == null && queryStockPrice == null && queryEval != null) {
            return  restApiService.evalExpression(queryEval);
        } else {
            return null;
        }
    }
}
