package com.victor.SpringProject.DTO;

public class PropertyUpdateDTO {

    private int propertyId;
    private String propertyAddress;
    private String propertyRentedStatus;
    private String propertyContactNumber;


    public PropertyUpdateDTO(int propertyId, String propertyAddress, String propertyRentedStatus, String propertyContactNumber) {
        this.propertyId = propertyId;
        this.propertyAddress = propertyAddress;
        this.propertyRentedStatus = propertyRentedStatus;
        this.propertyContactNumber = propertyContactNumber;
    }

    public PropertyUpdateDTO() {
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public String getPropertyRentedStatus() {
        return propertyRentedStatus;
    }

    public void setPropertyRentedStatus(String propertyRentedStatus) {
        this.propertyRentedStatus = propertyRentedStatus;
    }

    public String getPropertyContactNumber() {
        return propertyContactNumber;
    }

    public void setPropertyContactNumber(String propertyContactNumber) {
        this.propertyContactNumber = propertyContactNumber;
    }


    @Override
    public String toString() {
        return "PropertyDTO{" +
                "propertyId=" + propertyId +
                ", propertyAddress='" + propertyAddress + '\'' +
                ", propertyRentedStatus='" + propertyRentedStatus + '\'' +
                ", propertyContactNumber=" + propertyContactNumber +
                '}';
    }



}
