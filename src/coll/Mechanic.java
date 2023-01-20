package coll;

import coll.transports.Transport;

public class Mechanic<T extends Transport<?>> {

    private final String fullname;
    private String company;



    public Mechanic(String fullname, String company) {
        if (fullname == null || fullname.isEmpty() || fullname.isBlank()) {
            this.fullname = "default mechanic";
        } else {
            this.fullname = fullname;
        }
        setCompany(company);
    }


    public String getFullname() {
        return fullname;
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

        System.out.printf("%s из компании %s провел техобслуживание машины %s %s\n", fullname, company, transport.getBrand(), transport.getModel());

    }

    public void fixTheCar(T transport) {

        System.out.printf("%s из компании %s починил машину %s %s\n", fullname, company, transport.getBrand(), transport.getModel());

    }

    @Override
    public String toString() {
        return "Механик " + fullname +
                " из компании " + company;
    }
}
