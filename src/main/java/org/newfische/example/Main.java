package org.newfische.example;
//Step 1: Create a class 'Medication' with the methods 'getName', 'getPrice', and 'getAvailability'.
//Step 2: Create a Java class 'Pharmacy' that uses a Java Map to store the Medication name as the key and its information as the value.
//Step 3: Create a method 'int getCount()' in the class Pharmacy. This method should return the number of Medications in the pharmacy.
//Step 4: Create a method 'void save(Medication medication)' in the class Pharmacy. This method should insert the Medication indexed by its name into the pharmacy.
//Step 5: Create a method 'Medication find(String medicationName)' in the class Pharmacy. This method should return the requested Medication with this name. If no Medication with this name is found, the method should return null.
//Step 6: Create a method 'void delete(String medicationName)' in the class Pharmacy. This method should delete the Medication with this name.
//Step 7: Implement a method to print all Medications in the map, including their name, price, and availability.

public class Main {
    public static void main(String[] args) {
//School Task
        Student student1 = new Student("Dipali", "Talware", 1);
        Student student2 = new Student("John", "Doe", 2);
        Student student3 = new Student("Jane", "Sans", 3);
        Student student4 = new Student("Mili", "Bha", 4);

        School primary = new School();

        primary.addStudents(1, student1);
        primary.addStudents(2, student2);
        primary.addStudents(3, student3);
        primary.addStudents(4, student4);

        System.out.println();
        System.out.println("Task 1:  ");
        System.out.println(primary);
        System.out.println();
        System.out.println("Task 2");

//Pharmacy Task
        /* creating medication  */
        Medication paracetamol = new Medication("Paracetamol", 5, true);
        Medication ibuprofen = new Medication("Ibuprofen", 6, true);
        Medication amoxicillin = new Medication("Amoxicillin", 10, true);
        Medication atorvastatin = new Medication("Atorvastatin ", 20, true);

        Pharmacy hansaApotheke = new Pharmacy();

        /* adding medication to Pharmacy */
        hansaApotheke.save(paracetamol);
        hansaApotheke.save(ibuprofen);
        hansaApotheke.save(amoxicillin);
        hansaApotheke.save(atorvastatin);

        System.out.println("All medication:");
        hansaApotheke.printAllMedication();
        System.out.println();


        /* finding medication in the Pharmacy */
        Medication findmedication = hansaApotheke.find("Paracetamol");
        if (findmedication != null) {
            System.out.println("Found medication: " + findmedication);
        } else {
            System.out.println("No medication found");
        }
        System.out.println();

        /* getting the medication Count in the Pharmacy */
        System.out.println("Total medication Count is:" + hansaApotheke.getCount());
        System.out.println();

        /* deleting medication from the Pharmacy */
        hansaApotheke.delete(atorvastatin.getName());

        /* Printing all medication */
        hansaApotheke.printAllMedication();
    }
}
