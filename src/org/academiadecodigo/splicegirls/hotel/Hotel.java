package org.academiadecodigo.splicegirls.hotel;

public class Hotel {

    private String name;
    private Room[] rooms;

    public Hotel(String name, int numberOfRooms) {

        this.name = name;
        this.rooms = new Room[numberOfRooms];
    }

    private int checkForFreeRooms () {

        for (int i = 0; i < rooms.length; i++) {

            if (rooms[i] == null) {
                rooms[i] = new Room(); // this technique is called lazy instantiation
            }
            if (rooms[i].isFree()) {
                System.out.println("Hotel: " + this + " Room " + (i + 1) + " free.");
                return i;
            }
        }
        System.out.println("No available room for hotel " + this);
        return -1;
    }

    public int checkIn () {

        int freeRoom = checkForFreeRooms();

        if (freeRoom == -1) {
            return 0;
        }
        rooms[freeRoom].changeAvailability();
        return (freeRoom + 1);
    }

    public void checkOut(int room) {

        if (rooms[room - 1] != null) {
            rooms[room - 1].changeAvailability();
        }
    }


    public String toString() {
        return name;
    }
}
