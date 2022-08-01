package model;

public class Box {
    static int keyGenerator = 0;

    private int id;
    private String address;
    private Volunteer owner;

    public Box(String address, Volunteer owner) {
        this.address = address;
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Volunteer getOwner() {
        return owner;
    }

    public void setOwner(Volunteer owner) {
        this.owner = owner;
    }

    // todo: addres, status, in charge of

    public void setOwner(){

    }


}
