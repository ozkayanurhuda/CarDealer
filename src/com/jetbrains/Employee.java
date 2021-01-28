package com.jetbrains;

public class Employee {
    private String name ;


    public String getName () {
        return name ;
    }
    public void setName(String name ) {
        this.name =name ;
    }

    private String creditControl (Customer customer) {
        if (customer.getCredit() <= 700) {
            return "Bad Credit";
        } else {
            return "Good Credit";
        }
    }

    public void handleCustomer(Customer customer,boolean finance, Vehicle vehicle) {
        if (finance==true) {
            String credit = creditControl(customer);
            if(credit.equals("Good Credit")) {
                System.out.println("We ran your credit and I think we can work out a finance option");
            } else {
                System.out.println("We ran your credit and are not able to finance this car for you :(");
            }
        }
        if(customer.getCash() >= vehicle.getPrice()) {
            System.out.println("Seems like everything is in order !!! Let's get you into your new " +vehicle.getName()+ "!!!");
        } else {
            System.out.println("Sorry I don't think you can afford this car.");
        }
    }

}
