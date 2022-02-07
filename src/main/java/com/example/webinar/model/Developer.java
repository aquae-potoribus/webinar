package com.example.webinar.model;

public class Developer {

    private String numbers;

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "My numbers is " + numbers;
    }
}