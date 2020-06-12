package com.conf.room.booking;


public class Interval {

    public double start;
    public double end;

    public double getStart() {
        return start;
    }

    public void setStart(double start) {
        this.start = start;
    }

    public double getEnd() {
        return end;
    }

    public void setEnd(double end) {
        this.end = end;
    }

    Interval() {
        start = 0.0;
        end = 0.0;
    }

    Interval(double s, double e) {
        this.start = s;
        this.end = e;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
