package com.tutorial.userservice.feignclients;

import java.util.List;

import com.tutorial.userservice.model.Bike;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// @FeignClient(name = "bike-service",url = "http://localhost:8003")
@FeignClient(name = "bike-service")
public interface BikeFeignClient {

    @PostMapping("/bike")
    Bike save(@RequestBody Bike bike);

    @GetMapping("/byuser/{userId}")
    List<Bike> getBikes(@PathVariable("userId") int userId);
    
}
