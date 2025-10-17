package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {
    /**
     * This is the name of the city.
     */
    private String city;
    /**
     * This is the name of the province.
     */
    private String province;

    /**
     * This is the constructor for the City class
     * @param city Name of the city
     * @param province Name of the province
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * This returns the name of the city
     * @return The name of the city
     */
    public String getCityName() {
        return this.city;
    }

    /**
     * This returns the name of the province
     * @return The name of the province
     */
    public String getProvinceName() {
        return this.province;
    }

    /**
     * Compares this city with the specified city for order based on city name
     * @param city the City to be compared
     * @return a negative integer, zero, or a positive integer as this city
     *         is less than, equal to, or greater than the specified city
     */
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }

    /**
     * Indicates whether some other object is equal to this one by comparing city and province names
     * @param o The reference object with which to compare
     * @return {@code true} if this object is the same as the obj
     *          argument; {@code false} otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city) && Objects.equals(province, city1.province);
    }

    /**
     * Returns a hash code value for the object
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
