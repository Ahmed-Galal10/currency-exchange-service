package com.microservices.currencyexchangeservice.controller;

import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CircuitBreakerController {

    private final Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);
    static int wowCounter = 0;

    // @Retry(name = "wow", fallbackMethod = "fallbackResponse")
    // @CircuitBreaker(name = "default", fallbackMethod = "fallbackResponse")
    @RateLimiter(name = "default")
    // allow maximum 3 calls per 10 seconds
    @GetMapping("/wow")
    public String wow() {
        logger.info("wow endpoint is called {} times", ++wowCounter);

//        ResponseEntity<String> responseEntity = new RestTemplate()
//                .getForEntity("http://localhost:8080/fake-url", String.class);
//        return responseEntity.getBody();
        return "WoOoOoW";
    }

    public String fallbackResponse(Exception ex) {
        return "There is an error happened ):";
    }
}
