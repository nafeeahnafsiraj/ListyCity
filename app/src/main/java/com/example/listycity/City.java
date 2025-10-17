package com.example.listycity;

/**
 * This is a class that defines city
 */
public class City  implements Comparable<City>{
    private String city;
    private String province;

    /**
     * This constructs a City object
     * @param city Name of the city
     * @param province Name of the province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Gets name of the city
     * @return City name
     */
    String getCityName(){
        return this.city;
    }

    /**
     * Gets name of the province
     * @return province name
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * Compares two city objects alphabetically by city name
     * @param o the object to be compared.
     * @return negative int, zero or positive int if city's name is less, equal, or greater than specified city name
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }
}