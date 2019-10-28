package com.jizhe7550.navicoexercise.exercise1;

/**
 * use Jvm to manage and create a singleton
 */
public class Singleton4 {
    
    private Singleton4 (){}
    
    public static final Singleton4 getInstance() {
        return SingletonHolder.INSTANCE;
    }
    
    private static class SingletonHolder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }
}
