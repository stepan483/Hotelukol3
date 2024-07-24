package com.engeto;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;



public class Booking {


    private int position;
    private Room room;
    private Guest name;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private int numberOfGuests;
    private boolean typeOfWorkingVacation;


    public Booking( Guest name, Room room, LocalDate checkIn,LocalDate checkOut, int numberOfGuests, boolean typeOfWorkingVacation) {
        this.room = room;
        this.name = name;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numberOfGuests = numberOfGuests;
        this.typeOfWorkingVacation = typeOfWorkingVacation;
    }

    public Booking( int position, Guest name, Room room, LocalDate checkIn,LocalDate checkOut, int numberOfGuests, boolean typeOfWorkingVacation) {
        this.position = position;
        this.room = room;
        this.name = name;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numberOfGuests = numberOfGuests;
        this.typeOfWorkingVacation = typeOfWorkingVacation;
    }




    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return name;
    }

    public void setGuest(Guest name) {
        this.name = name;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }


    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests){
        this.numberOfGuests = numberOfGuests;
    }

    public boolean getTypeOfWorkingVacation(){
        return  typeOfWorkingVacation;
    }

    public void setTypeOfWorkingVacation () {
        this.typeOfWorkingVacation = typeOfWorkingVacation;

    }



    public long getBookingLenght(){
        long daysBetween = ChronoUnit.DAYS.between(checkIn, checkOut);
        return daysBetween;
    }


    public BigDecimal getprice(){
        BigDecimal reservationPrice;
        reservationPrice = room.getPrice().multiply(BigDecimal.valueOf(getBookingLenght()));
        return reservationPrice;
    }


    @Override
    public String toString() {
        return "Booking{" +
                "typeOfWorkingVacation=" + typeOfWorkingVacation +
                ", numberOfGuests=" + numberOfGuests +
                ", checkOut=" + checkOut +
                ", checkIn=" + checkIn +
                ", name=" + name +
                ", room=" + room +
                ", position=" + position +
                '}';
    }


//a

}
