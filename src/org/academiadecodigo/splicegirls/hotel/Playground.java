package org.academiadecodigo.splicegirls.hotel;

public class Playground {

    public static void main (String[] args) {

        Hotel[] hotels = {new Hotel("Savoy", 1), new Hotel("Ritz", 2)};

        Person guest1 = new Person("Bill Clinton");
        Person guest2 = new Person("Donald Trump");
        Person guest3 = new Person("Ada Lovelace");

        guest1.findAvailableBooking(hotels);
        System.out.println(guest1);

        guest1.checkOut();
        System.out.println(guest1);

        guest2.findAvailableBooking(hotels);
        System.out.println(guest2);

        //guest2.checkOut();
        //System.out.println(guest2);

        guest3.findAvailableBooking(hotels);
        System.out.println(guest3);
    }
}
