import cleanCode.domain.Airport;
import cleanCode.domain.*;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class AirportTest {

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
                    110000, MilitaryType.TRANSPORT),
            new ExperimentalPlane("Bell X-14", 277, 482,
                    500, ExperimentalTypes.HIGH_ALTITUDE, ClassificationLevel.SECRET),
            new ExperimentalPlane("Ryan X-13 Vertijet", 560, 307,
                    500, ExperimentalTypes.VTOL, ClassificationLevel.TOP_SECRET)
    );

    private static PassengerPlane planeWithMaxPassengerCapacity = new PassengerPlane(
            "Boeing-747", 980, 16100, 70500, 242);

    private Airport airport = new Airport(listOfPlanes);

    @Test
    public void testGetTransportMilitaryPlanes() {

        List<MilitaryPlane> transportMilitaryPlanes = airport.getTransportMilitaryPlanes();

        boolean flag = transportMilitaryPlanes.stream()
                .anyMatch(militaryPlane -> (militaryPlane.getType() == MilitaryType.TRANSPORT));
        Assert.assertTrue(flag);
    }

    @Test
    public void testGetPassengerPlaneWithMaxCapacity() {

        PassengerPlane expectedPlaneWithMaxPassengersCapacity = airport.getPassengerPlaneWithMaxPassengersCapacity();
        Assert.assertEquals(expectedPlaneWithMaxPassengersCapacity, planeWithMaxPassengerCapacity);
    }

    @Test
    public void testGetPlaneWithMaxLoadCapacity() {

        List<? extends Plane> planesSortedByMaxLoadCapacity = airport.sortByMaxLoadCapacity();
        boolean planeWithMaxLoadCapacity = true;
        Plane currentPlane;
        Plane nextPlane;
        for (int i = 0; i < planesSortedByMaxLoadCapacity.size() - 1; i++) {
            currentPlane = planesSortedByMaxLoadCapacity.get(i);
            nextPlane = planesSortedByMaxLoadCapacity.get(i+1);
            if (currentPlane.getMaxLoadCapacity() > nextPlane.getMaxLoadCapacity()) {
                planeWithMaxLoadCapacity = false;
                break;
            }
        }
        Assert.assertTrue(planeWithMaxLoadCapacity);
    }

    @Test
    public void testHasAtLeastOneBomberInMilitaryPlanes() {

        List<MilitaryPlane> bomberMilitaryPlanes = airport.getBomberMilitaryPlanes();

        boolean flag = bomberMilitaryPlanes.stream()
                .anyMatch(militaryPlane -> (militaryPlane.getType() == MilitaryType.BOMBER));
        Assert.assertTrue(flag);
    }

    @Test
    public void testExperimentalPlanesHasClassificationLevelHigherThanUnclassified() {

        List<ExperimentalPlane> experimentalPlanes = airport.getExperimentalPlanes();

        boolean hasUnclassifiedPlanes = experimentalPlanes.stream().anyMatch(experimentalPlane -> (
                experimentalPlane.getClassificationLevel() == ClassificationLevel.UNCLASSIFIED));
        Assert.assertFalse(hasUnclassifiedPlanes);
    }
}
