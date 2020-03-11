package cleanCode;

import cleanCode.domain.*;
import java.util.Arrays;
import java.util.List;

/**
 * Вам необходимо исправить все ошибки в проекте aircompany. Сделайте копию проекта и постарайтесь отыскать
 * и исправить все нарушения практик написания чистого кода.
 */
public class Runner {

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

    private static Airport airport = new Airport(listOfPlanes);

    public static void main(String[] args) {

        List<MilitaryPlane> militaryPlanes = airport.getMilitaryPlanes();
        List<PassengerPlane> passengerPlanes = airport.getPassengerPlanes();
        List<ExperimentalPlane> experimentalPlanes = airport.getExperimentalPlanes();

        System.out.println("Military planes: \n" + militaryPlanes);
        System.out.println("Passenger planes: \n" + passengerPlanes);
        System.out.println("Experimental planes: \n" + experimentalPlanes);

        System.out.println("Planes sorted by max distance: \n" + airport.sortByMaxDistance());
        System.out.println("Planes sorted by max speed: \n" + airport.sortByMaxSpeed());
        System.out.println("Planes sorted by max load capacity: \n" + airport.sortByMaxLoadCapacity());
        System.out.println("Plane with max passenger capacity: \n" + airport.getPassengerPlaneWithMaxPassengersCapacity());

    }
}
