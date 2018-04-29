package com.example.android.p5citytourguide;

/**
 * {@link City}represents tourists atraction in universitary city Iasi, Romania.
 * It contains the name,image, address and phone.
 */

class City {
    //Name of tourist atraction
    private final String Name;
    //Image of tourist atraction
    private final int ImageId;
    //Address of tourist atraction
    private final String Address;
    //Phone of tourist atraction
    private final String Phone;

    /**
     * Create a new tourist atraction object.
     */
    public City(String Name, int ImageId, String Address, String Phone){
        this.Name = Name;
        this.ImageId = ImageId;
        this.Address = Address;
        this.Phone = Phone;
    }

    /**
     * Gets the tourist atraction name.
     */
    public String getName() {
        return Name;
    }

    /**
     *Gets the party tourist atraction resource id.
     */
    public int getImageId() {
        return ImageId;
    }

    /**
     *Gets the tourist atraction image address.
     */
    public String getAddress() {
        return Address;
    }

    /**
     * Gets the tourist atraction phone.
     */
    public String getPhone() {
        return Phone;
    }
}
