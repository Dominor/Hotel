package org.academiadecodigo.splicegirls.hotel;

public class Person {

    private String name;
    private Hotel hotel;
    private int roomNr = 0;  // 0 means no room ID

    Person (String name) {
        this.name = name;
    }

    public void findAvailableBooking(Hotel[] hotels) {

        if (hotels != null) {
            for (int i = 0; i < hotels.length; i++) {
                if (hotels[i] == null || roomNr != 0) {
                    return;
                }
                int nr = hotels[i].checkIn();
                if (nr == 0) {
                    continue;
                }
                roomNr = nr;
                hotel = hotels[i];
                System.out.println("Hotel: " + hotel);
                break;
            }
        }
    }

    public void checkOut () {

        if (hotel == null || roomNr == 0) {
            return;
        }
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
