package com.conf.room.booking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;


public class Solution {


	public findRoom() {
    static  List<Room> roomsList = new ArrayList<>();
        int floor = 8;
        int capacity = 5;
        Interval interval = new Interval(10.30,11.30);


        Room room7_11 = new Room(7.11, 8);
        Room room9_547 = new Room(9.547, 8);
        Room room1_547 = new Room(1.547, 8);

        room7_11.addInterval(new Interval(9.00, 9.15));
        room9_547.addInterval(new Interval(10.30, 11.30));
        room1_547.addInterval(new Interval(10.30, 11.30));


        List<Room> rooms = Arrays.asList(room9_547, room7_11, room1_547);

        for(Room rm : rooms ) {

            System.out.println(rm);

        }

        System.out.println("**************");


        roomsList =  rooms.stream()
                .sorted(comparing(Room::getNumber))
                .filter(r -> r.getCapacity() >= capacity)
                .filter(r -> r.getTimeIntervals().stream().anyMatch(i -> i.getStart() >= interval.getStart() && i.getEnd() <= interval.getEnd()))
                .collect(Collectors.toList());



        // https://www.geeksforgeeks.org/find-closest-number-array/
        // Find closest number in array

    }


}
