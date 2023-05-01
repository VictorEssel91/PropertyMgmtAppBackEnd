package com.victor.SpringProject.DTO;

public class PropertySaveDTO {


    private String propertyAddress;
    private String propertyRentedStatus;
    private String propertyContactNumber;

    public PropertySaveDTO(String propertyAddress, String propertyRentedStatus, String propertyContactNumber) {
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

    public String getPropertyContactNumber() {
        return propertyContactNumber;
    }

    public void setPropertyContactNumber(String propertyContactNumber) {
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
