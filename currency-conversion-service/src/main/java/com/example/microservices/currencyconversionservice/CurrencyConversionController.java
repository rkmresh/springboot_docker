package com.example.microservices.currencyconversionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
@Configuration(proxyBeanMethods = false)
class RestTemplateConfiguration {

    @Bean
    RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
@RestController
@ConfigurationProperties
public class CurrencyConversionController {
    @Autowired
    CurrencyExchangeProxy currencyExchangeProxy;
    @Autowired
    private RestTemplate restTemplate;
    @Value("${hostname}")
    private String hostname;
    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion calculateCurrencyConversion(@PathVariable String from, @PathVariable String to,
    @PathVariable BigDecimal quantity){
        HashMap<String, String> uriVariables = new HashMap<>();
        uriVariables.put("from", from);
        uriVariables.put("to",to);
        ResponseEntity<CurrencyConversion> forEntity = restTemplate.getForEntity(hostname+"/currency-exchange/from/{from}/to/{to}",
                CurrencyConversion.class, uriVariables);
        CurrencyConversion currencyConversion = forEntity.getBody();
        return new CurrencyConversion(currencyConversion.getId(), from, to, quantity,
                currencyConversion.getConversionMultiple(), quantity.multiply(currencyConversion.getConversionMultiple()),
                currencyConversion.getEnvironment()+" RestTemplate");
    }

    @GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion calculateCurrencyConversionFeign(@PathVariable String from, @PathVariable String to,
                                                          @PathVariable BigDecimal quantity){
        CurrencyConversion currencyConversion = currencyExchangeProxy.retrieveExchangeValue(from,to);
        return new CurrencyConversion(currencyConversion.getId(), from, to, quantity,
                currencyConversion.getConversionMultiple(), quantity.multiply(currencyConversion.getConversionMultiple()),
                currencyConversion.getEnvironment()+" Feign");
    }
}

