package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Volunteer {
    private String addres;
    private List<Box> boxes = new ArrayList<>();
    private String phone;

    public Volunteer(){


        }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddres() {
        return addres;
    }


}

