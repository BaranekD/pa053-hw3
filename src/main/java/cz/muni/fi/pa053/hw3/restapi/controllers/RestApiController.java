package cz.muni.fi.pa053.hw3.restapi.controllers;

import cz.muni.fi.pa053.hw3.restapi.service.RestApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    public int createCase(){
//        ObjectMapper mapper = new ObjectMapper();
//
//        ObjectNode result = mapper.createObjectNode();
//        result.

        return 3;
    }
}
