package com.example.task_01.controllers;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


@RestController
public class GreetingController {

        private Greeting greeting;


    @GetMapping("/greetings") // http://localhost:8080/greetings
    public ResponseEntity<String> greeting(@RequestParam(value = "name", defaultValue = "John Doe") String name) {

        ZoneId ukZoneId = ZoneId.of("Europe/London");
        ZonedDateTime ukTime = ZonedDateTime.now(ukZoneId);
        LocalTime localTime = ukTime.toLocalTime();

        Greeting greeting = new Greeting(name, localTime);
        return new ResponseEntity<>(greeting.getGreetingMessage(), HttpStatus.OK);
    }


    @GetMapping("/celebrations") // http://localhost:8080/celebrations
    public ResponseEntity<Celebration> celebration() {
        Celebration celebration = new Celebration("Enjoy your celebration human!");
        return new ResponseEntity<>(celebration, HttpStatus.OK);
    }
}
