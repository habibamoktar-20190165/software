package com.company;

/**
 * this is reservation class set info and showing it for owner and player
 * @author basmala Mostafa
 * @version 1.0
 * @since 11 November 2021
 */
public class Reservations {
    private String name;
    private String email;
    private long phone;
    private long password;
    private long ID;

    public Reservations(){

    }
    public Reservations(String name,String email,long phone,long password,long ID){
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.password=password;
        this.ID=ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    /**
     *
     * @return  name of player and owner
     */
    public String getName() {
        return name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     *
     * @return  email of player and owner
     */
    public String getEmail() {
        return email;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
    /**
     *
     * @return  phone of player and owner
     */
    public long getPhone() {
        return phone;
    }
    public void setPassword(long password) {
        this.password = password;
    }
    /**
     *
     * @return  pass of player and owner
     */
    public long getPassword() {
        return password;
    }
    public void setID(long ID) {
        this.ID = ID;
    }
    /**
     *
     * @return  ID of player and owner
     */
    public long getID() {
        return ID;
    }
}
