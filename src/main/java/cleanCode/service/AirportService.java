package cleanCode.service;

import cleanCode.domain.*;

import java.util.*;
import java.util.stream.Collectors;

public class AirportService {

    private static List<Plane> listOfPlanes = Arrays.asList(
            new PassengerPlane("Boeing-737", 900, 12000,
                    60500, 164),
            new PassengerPlane("Boeing-737-800", 940, 12300,
                    63870, 192),
            new PassengerPlane("Boeing-747", 980, 16100,
                    70500, 242),
            new PassengerPlane("Airbus A320", 930, 11800,
                    65500, 188),
            new PassengerPlane("Airbus A330", 990, 14800,
                    80500, 222),
            new PassengerPlane("Embraer 190", 870, 8100,
                    30800, 64),
            new PassengerPlane("Sukhoi Superjet 100", 870, 11500,
                    50500, 140),
            new PassengerPlane("Bombardier CS300", 920, 11000,
                    60700, 196),
            new MilitaryPlane("B-1B Lancer", 1050, 21000,
                    80000, MilitaryType.BOMBER),
            new MilitaryPlane("B-2 Spirit", 1030, 22000,
                    70000, MilitaryType.BOMBER),
            new MilitaryPlane("B-52 Stratofortress", 1000, 20000,
                    80000, MilitaryType.BOMBER),
            new MilitaryPlane("F-15", 1500, 12000,
                    10000, MilitaryType.FIGHTER),
            new MilitaryPlane("F-22", 1550, 13000,
                    11000, MilitaryType.FIGHTER),
            new MilitaryPlane("C-130 Hercules", 650, 5000,
                    110000, MilitaryType.TRANSPORT)
    );

    private final Airport airport = new Airport(listOfPlanes);

    private List<? extends Plane> planes = airport.getPlanes();

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

        List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();

        for (MilitaryPlane plane : militaryPlanes) {
            if (plane.getType() == MilitaryType.TRANSPORT) {
                transportMilitaryPlanes.add(plane);
            }
        }

        return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {

        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();

        for (MilitaryPlane plane : militaryPlanes) {
            if (plane.getType() == MilitaryType.BOMBER) {
                bomberMilitaryPlanes.add(plane);
            }
        }

        return bomberMilitaryPlanes;

    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {

        List<PassengerPlane> passengerPlanes = getPassengerPlanes();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);

        for (PassengerPlane passengerPlane : passengerPlanes) {
            if (passengerPlane.getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = passengerPlane;
            }
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

}
