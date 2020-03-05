package cleanCode;

import cleanCode.domain.ExperimentalPlane;
import cleanCode.domain.MilitaryPlane;
import cleanCode.domain.PassengerPlane;
import cleanCode.service.AirportService;
import java.util.List;

/**
 * Вам необходимо исправить все ошибки в проекте aircompany. Сделайте копию проекта и постарайтесь отыскать
 * и исправить все нарушения практик написания чистого кода.
 */
public class Main {

    public static void main(String[] args) {

        AirportService service = new AirportService();

        List<MilitaryPlane> militaryPlanes = service.getMilitaryPlanes();
        List<PassengerPlane> passengerPlanes = service.getPassengerPlanes();
        List<ExperimentalPlane> experimentalPlanes = service.getExperimentalPlanes();

        System.out.println("Military planes: \n" + militaryPlanes);
        System.out.println("Passenger planes: \n" + passengerPlanes);
        System.out.println("Experimental planes: \n" + experimentalPlanes);

        System.out.println("Planes sorted by max distance: \n" + service.sortByMaxDistance());
        System.out.println("Planes sorted by max speed: \n" + service.sortByMaxSpeed());
        System.out.println("Planes sorted by max load capacity: \n" + service.sortByMaxLoadCapacity());
        System.out.println("Plane with max passenger capacity: \n" + service.getPassengerPlaneWithMaxPassengersCapacity());
    }
}
