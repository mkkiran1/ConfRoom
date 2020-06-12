package com.conf.room.booking;

import java.util.ArrayList;
import java.util.List;


public class Room {
    public double number;
    public int capacity;
    public List<Interval> timeIntervals = new ArrayList<>();


    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Interval> getTimeIntervals() {
        return timeIntervals;
    }

    public void setTimeIntervals(List<Interval> timeIntervals) {
        this.timeIntervals = timeIntervals;
    }

    Room(double number, int capacity) {
        this.number = number;
        this.capacity = capacity;
    }

    public Room addInterval(Interval interval) {
        timeIntervals.add(interval);
        return this;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", capacity=" + capacity +
                ", timeIntervals=" + timeIntervals +
                '}';
    }
}
