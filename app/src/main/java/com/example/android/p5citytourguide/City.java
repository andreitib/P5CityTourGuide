package com.example.android.p5citytourguide;

/**
 * {@link City}represents a party location in Romania.
 * It contains the name, description, image and address.
 */

class City {
    //Name of party hotspot
    private final String CityName;
    //Image of party hotspot
    private final int CityImageId;
    //Address of party hotspot
    private final String CityAddress;
    //Phone of party hotspot
    private final String CityPhone;

    /**
     * Create a new Party Hot Spot object.
     */
    public City(String CityName, int CityImageId, String CityAddress, String CityPhone){
        this.CityName = CityName;
        this.CityImageId = CityImageId;
        this.CityAddress = CityAddress;
        this.CityPhone = CityPhone;
    }

    /**
     * Gets the party hotspot name.
     */
    public String getCityName() {
        return CityName;
    }

    /**
     *Gets the party hotspot image resource id.
     */
    public int getCityImageId() {
        return CityImageId;
    }

    /**
     *Gets the party hotspot image address.
     */
    public String getCityAddress() {
        return CityAddress;
    }

    /**
     * Gets the party hotspot phone.
     */
    public String getCityPhone() {
        return CityPhone;
    }
}
