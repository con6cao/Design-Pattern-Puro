package org.example.singleton;

public class SingletonEagler {
    private static SingletonEagler instance = new SingletonEagler();
    private SingletonEagler() {
    }
    public static SingletonEagler getInstance() {
        return instance;
    }


}
