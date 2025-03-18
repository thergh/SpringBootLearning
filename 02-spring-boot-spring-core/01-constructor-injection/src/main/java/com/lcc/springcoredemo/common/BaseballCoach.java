package com.lcc.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
public class BaseballCoach implements Coach{


    public String getDailyWorkout(){
        return "Spend 30 minutes in batting practice.";
    }
}
