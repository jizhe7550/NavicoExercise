package com.jizhe7550.navicoexercise.exercise1;

/**
 * lazy singleton for not thread safety
 */
public class Singleton2 {
    
    private static Singleton2 instance;
    
    private Singleton2(){}
    
    public static Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
