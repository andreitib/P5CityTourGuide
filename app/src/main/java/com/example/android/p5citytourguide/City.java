package com.example.android.p5citytourguide;

/**
 * {@link City}represents a tourist atraction in city Iasi, Romania.
 * It contains the name,image, address and phone.
 */

class City {
    //Name of tourist atraction
    private final String CityName;
    //Image of tourist atraction
    private final int CityImageId;
    //Address of tourist atraction
    private final String CityAddress;
    //Phone of tourist atraction
    private final String CityPhone;

    /**
     * Create a new tourist atraction object.
     */
    public City(String CityName, int CityImageId, String CityAddress, String CityPhone){
        this.CityName = CityName;
        this.CityImageId = CityImageId;
        this.CityAddress = CityAddress;
        this.CityPhone = CityPhone;
    }

    /**
     * Gets the tourist atraction name.
     */
    public String getCityName() {
        return CityName;
    }

    /**
     *Gets the party tourist atraction resource id.
     */
    public int getCityImageId() {
        return CityImageId;
    }

    /**
     *Gets the tourist atraction image address.
     */
    public String getCityAddress() {
        return CityAddress;
    }

    /**
     * Gets the tourist atraction phone.
     */
    public String getCityPhone() {
        return CityPhone;
    }
}
