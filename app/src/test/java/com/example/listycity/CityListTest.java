package com.example.listycity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This class tests the functionality of the CityList class
 */
class CityListTest {

    /**
     * Creates a mock CityList with one city for testing
     * @return a CityList containing one city
     */
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    /**
     * Creates a mock City object for testing
     * @return a City object with sample data
     */
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    /**
     * Tests whether cities can be added successfully
     */
    @Test
    void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());

        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);

        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }

    /**
     * Tests whether adding a duplicate city throws an exception
     */
    @Test
    void testAddException() {
        CityList cityList = mockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.add(city);

        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }

    /**
     * Tests whether getCities() returns a correctly sorted list
     */
    @Test
    void testGetCities() {
        CityList cityList = mockCityList();
        // The mock city should be the first item initially
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));

        // Add a city that alphabetically comes before Edmonton
        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);

        // Charlottetown should now be first
        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
    }

    @Test
    void testHasCity() {
        CityList cityList = mockCityList();
        City city = cityList.getCities().get(0);
        assertTrue(cityList.hasCity(city));
    }

    @Test
    void testDelete() {
        CityList cityList = mockCityList();
        City city = cityList.getCities().get(0);
        cityList.delete(city);
        assertEquals(0, cityList.countCities());
    }

    @Test
    void testDeleteException() {
        CityList cityList = mockCityList();
        City fake = new City("Calgary", "Alberta");
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.delete(fake);
        });
    }

    @Test
    void testCountCities() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.countCities());
        cityList.add(new City("Vancouver", "British Columbia"));
        assertEquals(2, cityList.countCities());
    }
}
