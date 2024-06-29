package com.engeto;


import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private  List <Booking> bookingList = new ArrayList<Booking>();
    public  int numberOfGuests;
    private int averege ;


    public void addBooking (Booking newBooking){
        bookingList.add(newBooking);

    }

    public void addList(List<Booking> list){
        bookingList.addAll(list);
    }

    public Booking getBookingIndex(int index){
        return bookingList.get(index);

    }

    public Booking getBookings()  {
        return getBookings() ;
    }




    public void clearBooking(){
        clearBooking();
    }

    public int getNumberOfWorkingBooking(){
        int numberOfWorkingBoking = 0;
        for (Booking booking : bookingList){
            if (booking.getTypeOfWorkingVacation()){
                numberOfWorkingBoking =+ 1;
            }
        }
        return numberOfWorkingBoking;
    }

    public int getAveregeGuest(){
        numberOfGuests = 0;
        averege = 0;
        for (Booking booking: bookingList){
            numberOfGuests = numberOfGuests + booking.getNumberOfGuests();
        }
        averege = numberOfGuests / bookingList.size();



        return  averege;
    }



}
