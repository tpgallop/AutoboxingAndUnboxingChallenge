package com.tomgallop;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Toms Bank");

        bank.addBranch("Reading");

        bank.addCustomer("Reading","Tom",0.50);
        bank.addCustomer("Reading","Tim",12.30);
        bank.addCustomer("Reading","Tam",240.12);

        bank.addBranch("Basingstoke");
        bank.addCustomer("Basingstoke","Bob",1928.20);

        bank.addCustomerTransaction("Reading","Tom",10.20);
        bank.addCustomerTransaction("Reading","Tom",112.23);
        bank.addCustomerTransaction("Reading","Tim",10123.10);

        bank.listCustomers("Reading",true);
        bank.listCustomers("Basingstoke",true);

        if(!bank.addCustomer("Manchester", "Brian", 5.12)) {
            System.out.println("Error, Manchester branch does not exist");
        }

        if(!bank.addBranch("Reading")) {
            System.out.println("Error, Reading branch already exists");
        }

        if(!bank.addCustomerTransaction("Reading","Fergus",54.32)) {
            System.out.println("Error, customer does not exist at branch");
        }

        if(!bank.addCustomer("Reading","Tom",12.51)) {
            System.out.println("Error, customer Tom already exists");
        }

    }
}
