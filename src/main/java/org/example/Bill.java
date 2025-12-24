package org.example;

public class Bill {
    int parotta = 15;
    int fried_rice = 100;
    int noodles = 100;

    public int getBill(){
        return parotta+fried_rice+noodles;
    }

    public int getTax(){
        return fried_rice-2;
    }
}
