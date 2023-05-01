package com.victor.SpringProject.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class PropertyDTO {

    private int propertyId;
    private String propertyAddress;
    private String propertyRentedStatus;
    private int propertyContactNumber;


    public PropertyDTO(int propertyId, String propertyAddress, String propertyRentedStatus, int propertyContactNumber) {
        this.propertyId = propertyId;
        this.propertyAddress = propertyAddress;
        this.propertyRentedStatus = propertyRentedStatus;
        this.propertyContactNumber = propertyContactNumber;
    }

    public PropertyDTO() {
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

    public int getPropertyContactNumber() {
        return propertyContactNumber;
    }

    public void setPropertyContactNumber(int propertyContactNumber) {
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
