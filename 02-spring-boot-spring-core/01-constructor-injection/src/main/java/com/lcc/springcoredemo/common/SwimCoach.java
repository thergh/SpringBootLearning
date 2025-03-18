package com.lcc.springcoredemo.common;

public class SwimCoach implements Coach {


    public SwimCoach(){
        System.out.println("swimCoach created");
    }

    @Override
    public String getDailyWorkout(){
        return "swimm 100m";
    }
}
