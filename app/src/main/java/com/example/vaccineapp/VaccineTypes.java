package com.example.vaccineapp;

public class VaccineTypes {
    Integer vaccine;
    String vaccineName;

    public VaccineTypes (Integer vaccine, String vaccineName){
        this.vaccine = vaccine;
        this.vaccineName = vaccineName;
    }

    public Integer getVaccine(){
        return vaccine;
    }

    public String getVaccineName() {
        return vaccineName;
    }
}
