package com.company.devices;

import com.company.Producer;
import com.company.Saleable;

public abstract class Device implements Saleable {
    final Producer producer;
    final String model;
    final Integer yearOfProduction;

    public Device(Producer producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void turnOn();

    @Override
    public String toString() {
        return "Device{" +
                "producer=" + producer +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}