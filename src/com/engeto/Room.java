package com.engeto;

import java.math.BigDecimal;

public class Room {


    private BigDecimal price;
    private boolean balcony;
    private boolean sea;
    private int numberOfBeds;
    private int roomNumber;

    public Room(int roomNumber, int numberOfBeds, BigDecimal price, boolean balcony, boolean sea) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.balcony = balcony;
        this.sea = sea;
    }

    public BigDecimal getPrice() {

        return price;
    }

    public void setPrice(BigDecimal price) {

        this.price = price;
    }

    public boolean isBalcony() {

        return balcony;
    }

    public void setBalcony(boolean balcony) {

        this.balcony = balcony;
    }

    public boolean isSea() {

        return sea;
    }

    public void setSea(boolean sea) {

        this.sea = sea;
    }

    public int getNumberOfBeds() {

        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {

        this.numberOfBeds = numberOfBeds;
    }

    public int getRoomNumber() {

        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {

        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Room{" +
                "price=" + price +
                ", balcony=" + balcony +
                ", sea=" + sea +
                ", numberOfBeds=" + numberOfBeds +
                ", roomNumber=" + roomNumber +
                '}';
    }
}
