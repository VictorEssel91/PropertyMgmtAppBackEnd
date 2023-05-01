package com.victor.SpringProject.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "property")

public class Property {

    @Id
    @Column(name = "property_id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int propertyId;

    @Column(name = "property_address", length = 80)
    private String propertyAddress;

    @Column(name = "property_rentedStatus", length = 50)
    private String propertyRentedStatus;

    @Column(name = "property_contactNumber", length = 50)
    private int propertyContactNumber;


    public Property(int propertyId, String propertyAddress, String propertyRentedStatus, int propertyContactNumber) {
        this.propertyId = propertyId;
        this.propertyAddress = propertyAddress;
        this.propertyRentedStatus = propertyRentedStatus;
        this.propertyContactNumber = propertyContactNumber;
    }


    public Property() {
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

    public void setPropertyContactNumber(int propertyContactNumber) {0
        this.propertyContactNumber = propertyContactNumber;
    }


    @Override
    public String toString() {
        return "property{" +
                "propertyId=" + propertyId +
                ", propertyAddress='" + propertyAddress + '\'' +
                ", propertyRentedStatus='" + propertyRentedStatus + '\'' +
                ", propertyContactNumber=" + propertyContactNumber +
                '}';
    }
}
