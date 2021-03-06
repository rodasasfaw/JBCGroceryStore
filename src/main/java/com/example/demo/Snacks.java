package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Snacks {
    public double getSnacktotalrevenue() {
        return snacktotalrevenue;
    }

    public void setSnacktotalrevenue(double snacktotalrevenue) {
        this.snacktotalrevenue = snackprice*snackquantity;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Snacks() {
    }

    private String snackbrand;
    private String crunchiness;
    private int snackquantity;

    public Snacks(String snackbrand, String crunchiness, int snackquantity, double snacktotalrevenue, double snackprice) {
        this.snackbrand = snackbrand;
        this.crunchiness = crunchiness;
        this.snackquantity = snackquantity;
        this.snacktotalrevenue = snacktotalrevenue;
        this.snackprice = snackprice;
    }

    private double snacktotalrevenue;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSnackbrand() {
        return snackbrand;
    }

    public void setSnackbrand(String snackbrand) {
        this.snackbrand = snackbrand;
    }

    public String getCrunchiness() {
        return crunchiness;
    }

    public void setCrunchiness(String crunchiness) {
        this.crunchiness = crunchiness;
    }

    public int getSnackquantity() {
        return snackquantity;
    }

    public void setSnackquantity(int snackquantity) {
        this.snackquantity = snackquantity;
    }

    public double getSnackprice() {
        return snackprice;
    }

    public void setSnackprice(double snackprice) {
        this.snackprice = snackprice;
    }

    private double snackprice;

}
