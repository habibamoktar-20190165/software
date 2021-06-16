package com.company;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Scanner;
/**
 * this is owner class ,it is register himself on the system and enter his playground info
 * it is aggregate from playground ,e wallet to show his money ,and reservations
 * @author Dalia Karem
 * @version 1.0
 * @since 11 November 2021
 */
public class Owner extends Reservations{
    Reservations obj;
    private Playground[] p1;
    private Ewallet []e1;
    Owner(Reservations obj){
        this.obj=obj;
    }
    /**
     *
     * owner book his playground
     */
    public void booking_playground(Playground[] p1){
        for(int i=0;i<p1.length;i++){
            System.out.println("playground's location"+p1[i].get_ground());
            System.out.println("playground's time"+p1[i].get_size());
            System.out.println("your avaliable hour for your playground");
            p1[i].get_avahours();

        }
    }

    /**
     * showing booking of owner
     */
    public void view_booking(){
//loc +players
        for(int i=0;i<p1.length;i++){
            System.out.println("location is"+p1[i].get_ground());
            System.out.println("players in this loc");
            p1[i].display_player();
        }
    }

}

