package com.example.task_01.models;

import java.time.LocalTime;


public class Greeting {

    private String name;
    private LocalTime timeOfDay;



    public Greeting(String name, LocalTime timeOfDay){
        this.name = name;
        this.timeOfDay = timeOfDay;
    }


    public Greeting() {

    }



    public String getGreetingMessage() {
        int hour = timeOfDay.getHour();

        if (hour < 12) {
            return "Good Morning " + name + "!";
        } else if (hour < 18) {
            return "Good Afternoon " + name + "!";
        } else {
            return "Good Evening " + name + "!";
        }
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getTimeOfDay() {
        return this.timeOfDay;
    }

    public void setTimeOfDay(LocalTime timeOfDay) {
        this.timeOfDay = timeOfDay;
    }



}
