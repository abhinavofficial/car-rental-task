package io.rental;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class CarRentalTest {

    private static final Car CAR1 = new Car("VW", "Golf", "XX11 1UR", 90);
    private static final Car CAR2 = new Car("VW", "Passat", "XX12 2UR", 110);
    private static final Car CAR3 = new Car("VW", "Polo", "XX13 3UR", 65);
    private static final Car CAR4 = new Car("VW", "Polo", "XX14 4UR", 70);

    private static final Renter RENTER1 = new Renter("Hydrogen", "Joe", "HYDRO010190JX8NM", LocalDate.of(1990, 1, 1));
    private static final Renter RENTER2 = new Renter("Calcium", "Sam", "CALCI010203SX8NM", LocalDate.of(2003, 2, 1));
    private static final Renter RENTER3 = new Renter("Neon", "Maisy", "NEONN010398MX8NM", LocalDate.of(1998, 3, 1));
    private static final Renter RENTER4 = new Renter("Carbon", "Greta", "CARBO010497GX8NM", LocalDate.of(1997, 4, 1));

    @Test
    public void testThatTheRenterCanAskForALargerCar() {

    }
}
