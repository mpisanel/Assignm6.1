package com.pharmacyandroid.factory.prescription;
import com.pharmacyandroid.domain.prescription.impl.PrescriptionImpl;

/**
 * Created by SONY on 2016-04-16.
 */
public class PrescriptionFactory
{
    public static PrescriptionImpl getPrescription(String preDate)
    {
        PrescriptionImpl myPres = new PrescriptionImpl.Builder()
                .bPrescriptionDate(preDate)
                .build();
        return myPres;
    }
}
