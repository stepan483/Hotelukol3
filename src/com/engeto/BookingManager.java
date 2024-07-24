package com.engeto;


import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private  List <Booking> bookingList = new ArrayList<Booking>();



 // ukol 1
    public void addBooking (Booking newBooking){
        bookingList.add(newBooking);

    }


    public void addList(List<Booking> list){
        bookingList.addAll(list);
    }

    // ukol 2
    public Booking getBookingIndex(int index){
        return bookingList.get(index);

    }

    //ukol 3
    public List<Booking> getBookings()  {
        return new ArrayList<>(bookingList);
    }



    //ukol 4
    public void clearBooking(){
        bookingList.clear();
    }

    //ukol5
    public int getNumberOfWorkingBooking(){
        int numberOfWorkingBoking = 0;
        for (Booking booking : bookingList){
            if (booking.getTypeOfWorkingVacation()){
                numberOfWorkingBoking = numberOfWorkingBoking + 1;
            }
        }
        return numberOfWorkingBoking;
    }

    //ukol 6
    public int getAveregeGuest() {

        int averege = 0;
        if (bookingList.isEmpty()) {
            System.out.println("list is empty");

        } else {
            int numberOfGuests = 0;
            for (Booking booking : bookingList) {
                numberOfGuests = numberOfGuests + booking.getNumberOfGuests();
            }
            averege = numberOfGuests / bookingList.size();
        }


        return averege;
    }



}
