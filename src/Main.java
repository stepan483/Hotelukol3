import com.engeto.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main  {

    static void vypisRezervací (Booking booking, Room room){
        System.out.println(booking.getCheckIn() + " až " + booking.getCheckOut() + ": " + booking.getGuest() + "[" + booking.getNumberOfGuests() + room.isBalcony() + "] za " + booking.getprice());

    }


    //ukol 12
  /*   private static Booking  RekreačníReservaceVýpis(Booking booking){

       for (int i = 0; i < 7; i++){
           if (!booking.getTypeOfWorkingVacation())
               System.out.println(booking.getGuest() + "" + booking.getRoom());
       }
   }

 // ukol 13
  /* static  void printGuestStatistics(Booking bookingList) {
       int ammountOfReservationWithOnne = 0;
       int ammountOfReservationWithTwo = 0;
       int ammountOfReservationWithThree = 0;

       for (Booking booking : bookingList){

           if (booking.getNumberOfGuests()== 1){
               ammountOfReservationWithOnne = ammountOfReservationWithOnne +1;
           }
           else if (booking.getNumberOfGuests()== 2) {
               ammountOfReservationWithTwo = ammountOfReservationWithTwo + 1;
           }

           else if (booking.getNumberOfGuests()== 3) {
               ammountOfReservationWithThree = ammountOfReservationWithThree + 1;
           }


       }
       System.out.println( "reservation with 1 guest:" + ammountOfReservationWithOnne);
       System.out.println( "reservation with 2 guest:" + ammountOfReservationWithTwo);
       System.out.println( "reservation with 3 guest:" + ammountOfReservationWithThree);
   }
*/

    public static void main(String[] args){

        //evidence hostů a list

        Guest guest1 = new Guest("adéla", "Malíková",LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jana", "Dvořáčka", LocalDate.of(1995, 5, 5));
        Guest guest3 = new Guest("Karel", "Dvořák", LocalDate.of(1990, 5, 15));
        Guest guest4 = new Guest("Karel", "Dvořák", LocalDate.of(1979, 3, 1));
        Guest guest5 = new Guest("Karolína", "Tmavá",LocalDate.of(1998, 7, 28));


        List<Guest> listOfGuests = new ArrayList<>();
        listOfGuests.add(guest1);
        listOfGuests.add(guest2);
        listOfGuests.add(guest3);
        listOfGuests.add(guest4);
        listOfGuests.add(guest5);


        // evidence pokoju a list

        Room room1 = new Room(1,1, BigDecimal.valueOf(1000),true,true);
        Room room2 = new Room(2,1,BigDecimal.valueOf(1000),true,true);
        Room room3 = new Room(3,3,BigDecimal.valueOf(2400),false,true);

        List<Room> roomList = new ArrayList<>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);

        //reservation and list
        List<Booking> bookingList = new ArrayList<>();

        Booking reservation1 = new Booking(guest1,room1,LocalDate.of(2021,7,1),LocalDate.of(2021,7,19),1,true);
        Booking reservation2 = new Booking(guest2,room2,LocalDate.of(2021,9,1),LocalDate.of(2021,9,14),2,false);
        Booking reservation3 = new Booking(guest3,room3,LocalDate.of(2023, 6, 1),LocalDate.of(2023, 6,7), 3, true);
        Booking reseravtion4 = new Booking(guest4,room2,LocalDate.of(2023,7,18), LocalDate.of(2023, 7,21),3 ,false);
        Booking reservation5 = new Booking(guest5,room3,LocalDate.of(2023,8,1),LocalDate.of(2023,8,31),3,true);


        // loop pro hosty
        int reservationForOnePerson = 18;
        for (int i = 0; i <= reservationForOnePerson; i++) {
            bookingList.add(new Booking(1+i, guest5, room2, LocalDate.of(2023,8,1+i),LocalDate.of(2023,8,2+i), 5,false ));

        }


        bookingList.add(reservation1);
        bookingList.add(reservation2);
        bookingList.add(reservation3);
        bookingList.add(reseravtion4);
        bookingList.add(reservation5);




        //   vypisRezervací(); //vyhazuje chybu.
        //    rekreačníReservaceVýpis();
        //    printGuestStatistics();


        for (Booking booking : bookingList){
            System.out.println(booking.getGuest());
            System.out.println("cena pobytu " + booking.getprice());
            System.out.println("delka pobyu " + booking.getBookingLenght() + "\n");

        }



        BookingManager bookingManager = new BookingManager();
        bookingManager.addList(bookingList);



        System.out.println("\npruměrný počet hostu " + bookingManager.getAveregeGuest());


        vypisRezervací();

    }

}