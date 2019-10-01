package org.academiadecodigo.splicegirls.hotel;

public class Person {

    String name;
    Hotel hotel;
    int roomNr;

    Person (String name) {
        this.name = name;
    }

    public void findAvailableBooking(Hotel[] hotels) {

        for (int i = 0; i < hotels.length; i++) {
            int nr = hotels[i].checkIn();
            //System.out.println("\n" + "Room nr is " + nr + "\n");
            if (nr == 0) {
                continue;
            }
            roomNr = nr;
            hotel = hotels[i];
            System.out.println("Hotel: " + hotel);
            break;
        }
    }

    public void checkOut () {

        hotel.checkOut(roomNr);
        roomNr = 0;
        hotel = null;
    }

    @Override
    public String toString() {
        if (hotel == null) {
            return name + " has not found any available hotel.";
        }
        return name + " is staying at " + hotel + " in room nr " + roomNr;
    }

    public Hotel getHotel() { return hotel; }
}
