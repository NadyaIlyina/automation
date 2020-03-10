package cleanCode.domain;

import java.util.*;
import java.util.stream.Collectors;

public class Airport {

    private List<? extends Plane> planes;

    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    public List<PassengerPlane> getPassengerPlanes() {

        return planes.stream().filter(plane -> plane instanceof PassengerPlane)
                .map(p -> (PassengerPlane) p)
                .collect(Collectors.toList());
    }

    public List<MilitaryPlane> getMilitaryPlanes() {

        return planes.stream().filter(plane -> plane instanceof MilitaryPlane)
                .map(plane -> (MilitaryPlane) plane)
                .collect(Collectors.toList());
    }

    public List<ExperimentalPlane> getExperimentalPlanes() {

        return planes.stream().filter(plane -> plane instanceof ExperimentalPlane)
                .map(plane -> (ExperimentalPlane) plane)
                .collect(Collectors.toList());
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {

        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();

        return militaryPlanes.stream().filter(plane -> plane.getType() == MilitaryType.TRANSPORT)
                .collect(Collectors.toList());
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {

        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();

        return militaryPlanes.stream().filter(plane -> plane.getType() == MilitaryType.BOMBER)
                .collect(Collectors.toList());

    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {

        List<PassengerPlane> passengerPlanes = getPassengerPlanes();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);

        for (PassengerPlane passengerPlane : passengerPlanes) {
            if (passengerPlane.getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity())
                planeWithMaxCapacity = passengerPlane;
        }

        return planeWithMaxCapacity;
    }

    public List<? extends Plane> sortByMaxDistance() {

        planes.sort(Comparator.comparingInt(Plane::getMaxFlightDistance));
        return planes;
    }

    public List<? extends Plane> sortByMaxSpeed() {

        planes.sort(Comparator.comparingInt(Plane::getMaxSpeed));
        return planes;
    }

    public List<? extends Plane> sortByMaxLoadCapacity() {

        planes.sort(Comparator.comparingInt(Plane::getMaxLoadCapacity));
        return planes;
    }

    @Override
    public String toString() {
        return "Airport: \n" + planes.toString();
    }
}
