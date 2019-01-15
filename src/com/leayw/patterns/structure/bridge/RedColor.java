package com.leayw.patterns.structure.bridge;

public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("red");
    }
}
