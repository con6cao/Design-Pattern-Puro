package org.example.singleton;

public class SingletonHolder {
    private static class InstanceHolder {
        private static SingletonHolder instance = new SingletonHolder();
    }
    private SingletonHolder() {
    }
    public static SingletonHolder getInstance() {
        return InstanceHolder.instance;
    }
}


