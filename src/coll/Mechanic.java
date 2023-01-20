package coll;

import coll.transports.Transport;

public class Mechanic<T extends Transport<?>> {

    private final String fullName;
    private String company;


    public Mechanic(String fullName, String company) {
        this.fullName = fullName;
        setCompany(company);
    }


    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {

        if (company == null || company.isBlank() || company.isEmpty()) {
            this.company = "default";
        } else {
            this.company = company;
        }
    }

    public void carryOutMaintenance(T transport) {

        System.out.printf("%s  провел техобслуживание машины %s %s\n", fullName, transport.getBrand(), transport.getModel());

    }

    public void fixTheCar(T transport) {

        System.out.printf("%s  починил машину %s %s\n", fullName, transport.getBrand(), transport.getModel());

    }

    @Override
    public String toString() {
        return "Механик " + fullName +
                " из компании" + company;
    }
}
