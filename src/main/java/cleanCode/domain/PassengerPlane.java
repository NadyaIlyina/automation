package cleanCode.domain;

import java.util.Objects;

public class PassengerPlane extends Plane {

    private int passengersCapacity;

    public PassengerPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengersCapacity) {

        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.passengersCapacity = passengersCapacity;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    @Override
    public boolean equals(Object object) {

        PassengerPlane plane = (PassengerPlane) object;

        return super.equals(object) && passengersCapacity == plane.passengersCapacity;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), passengersCapacity);
    }

    @Override
    public String toString() {

        return super.toString().concat(", passengersCapacity=" + passengersCapacity + "\n");
    }

}
