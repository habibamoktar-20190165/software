package com.company;

/**
 * this is player class aggregate from playground and reservation
 *
 * @author basmala Mostafa
 * @version 1.0
 * @since 11 November 2021
 */
public class Player{
    private Reservations obj;
    Playground object;
    public Player(){};
    public Player(Reservations obj){
        this.obj=obj;
    }/**
     *
     * doing reservation for player
     */
    public void createAccount(Reservations obj){
        this.obj=obj;
    }

    public void setObj(Reservations obj) {
        this.obj = obj;
    }
    /**
     *
     * @return account info
     */
    public Reservations getObj() {
        return obj;
    }

    /**
     * player book playground with his team
     */
    public void bookSlot(){
        object.Booking_playground();
    }

}
