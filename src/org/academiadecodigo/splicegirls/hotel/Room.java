package org.academiadecodigo.splicegirls.hotel;

public class Room {

    private boolean availability;

    Room () {
        availability = true;
    }

    public boolean isFree() {

        return availability;
    }

    public void changeAvailability() {
        availability = !(availability);
    }

    @Override
    public String toString() {
        return (availability) ? "is available" : "is not available";
    }
}
