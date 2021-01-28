package com.jetbrains;

public class CarDealer {

    public static void main(String[] args) {
        Customer sam = new Customer();
        sam.setName("Sam Gary");
        sam.setAddress("2797 Briarwood Drive");
        sam.setCash(120000);
        sam.setCredit(708);

        Vehicle dacia = new Vehicle();
        dacia.setName("Dacia Sandero");
        dacia.setModel("Stepway");
        dacia.setPrice(100000);
        dacia.setYear(2013);
        dacia.setKm(70000);


        Employee robin = new Employee();
        robin.setName("Robin");


        sam.purchaseCar(dacia, robin, true );



    }
}
