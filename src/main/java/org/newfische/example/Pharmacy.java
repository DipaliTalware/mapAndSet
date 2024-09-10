package org.newfische.example;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    private Map< String, Medication> medicationDetails = new HashMap<>();


    public int getCount(){
        return medicationDetails.size();
    }

    public void save(Medication medication){
        medicationDetails.put(medication.getName(), medication);
    }

    public Medication find(String medicationName){
        return medicationDetails.get(medicationName);
    }

    public void delete(String medicationName){
        medicationDetails.remove(medicationName);
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "medicationDetails=" + medicationDetails +
                '}';
    }

    public void printAllMedication(){
        for (Medication medication: medicationDetails.values()){
            System.out.println(medication);
        }
  }
}
