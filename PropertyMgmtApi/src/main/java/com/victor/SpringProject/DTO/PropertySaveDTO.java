package com.victor.SpringProject.DTO;

public class PropertySaveDTO {


    private String propertyAddress;
    private String propertyRentedStatus;
    private int propertyContactNumber;

    public PropertySaveDTO(String propertyAddress, String propertyRentedStatus, int propertyContactNumber) {
        this.propertyAddress = propertyAddress;
        this.propertyRentedStatus = propertyRentedStatus;
        this.propertyContactNumber = propertyContactNumber;
    }

    public PropertySaveDTO() {
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

    public int getPropertyContactNumber() {
        return propertyContactNumber;
    }

    public void setPropertyContactNumber(int propertyContactNumber) {
        this.propertyContactNumber = propertyContactNumber;
    }

    @Override
    public String toString() {
        return "PropertySaveDTO{" +
                "propertyAddress='" + propertyAddress + '\'' +
                ", propertyRentedStatus='" + propertyRentedStatus + '\'' +
                ", propertyContactNumber=" + propertyContactNumber +
                '}';
    }
}
