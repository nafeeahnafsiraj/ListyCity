package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks if specified city is in the list or not
     * @param city city we are checking
     * @return true if city exists in the list, false if it doesn't
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes city from list if it exists
     * @param city the city we are removing
     * @throws IllegalArgumentException if the city doesn't exist in the list.
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * Returns number of cities which are currently in the list
     * @return Count of cities in the list
     */
    public int countCities() {
        return cities.size();
    }
}