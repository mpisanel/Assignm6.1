package com.pharmacyandroid.domain.patient.impl;

import com.pharmacyandroid.domain.patient.PatientAddress;

import java.io.Serializable;

/**
 * Created by SONY on 2016-04-16.
 */
public class PatientAddressImpl implements PatientAddress, Serializable
{

    private String street;
    private String suburb;
    private String postCode;
    private Long streetID;

    public String getPostCode()
    {
        return postCode;
    }
    public String getSuburb()
    {
        return suburb;
    }
    public String getStreet()
    {
        return street;
    }
    public Long getStreetID() {
        return streetID;
    }

    public static class Builder
    {
        private String street;
        private String suburb;
        private String postCode;
        private Long streetID;

        public Builder(){}
        public Builder bStreetID(Long streetID)
        {
            this.streetID = streetID;
            return this;
        }
        public Builder bStreet(String street)
        {
            this.street = street;
            return this;
        }
        public Builder bSuburb(String suburb)
        {
            this.suburb = suburb;
            return this;
        }
        public Builder bPostCode(String postCode)
        {
            this.postCode = postCode;
            return this;
        }

        public Builder copy(PatientAddressImpl patAddress)
        {
            this.streetID = patAddress.getStreetID();
            this.street = patAddress.getStreet();
            this.suburb = patAddress.getSuburb();
            this.postCode = patAddress.getPostCode();
            return this;
        }
        public PatientAddressImpl build()
        {
            return  new PatientAddressImpl(this);
        }
    }
    public PatientAddressImpl(Builder build)
    {
        streetID = build.streetID;
        street = build.street;
        suburb = build.suburb;
        postCode = build.postCode;
    }
}
