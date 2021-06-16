package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.*;
import java.util.ArrayList;
/**
 * this is playground system aggregation from player ,owner and reservations
 * it will show all info about this playground and owner of this playground
 * also you can use it to add new playground and view all playgrounds in same location
 * @author Dalia Karem
 * @version 1.0
 * @since 11 November 2021
 */
public class Playground {
    private String name;
    private int size;
    private int f,t;
    private int length;
    private int width;
    private int period;
    private String location;
    private double time;
    private int price;
    private String a[];
    private Player[] p1;
    private Player p;
    Reservations o;
    /**
     *
     * default constructor
     */
    public Playground(){
        location="";
        String a[]={};
        length=0;
        width=0;
        period=0;
        price=0;
    }
    public void set_length(int len){
        this.length=len;
    }
    public void set_width(int wid){
        this.width=wid;
    }
    /**
     *
     * @return length of playground
     */

    public int get_length(){
        return length;
    }
    /**
     *
     * @return width of playground
     */
    public int get_width(){
        return width;
    }
    public void Set_price_AVAhour(int p){
        this.price=p;
    }
    /**
     *
     * @return price per hour
     */
    public int get_price_AVAhour(){
        return price;
    }
    public void Set_size(int size){
        this.size=size;
    }
    /**
     *
     * @return length*width
     */
    public int get_size(){
        return length*width;
    }

    public Playground(String location,int size,String name, int price,double time){
        this.location=location;
        this.size=size;
        this.name=name;
        this.price=price;
    }
    public void Set_ground(String loc){
        this.location=loc;
    }
    /**
     *
     * @return location of playground
     */
    public String get_ground(){

        return location;
    }
    public  void set_avahours(double time){
        this.time=time;
    }
    /**
     *
     * @return avaliable hour for playground
     */
    public double get_avahours(){
        return time;
    }
    /**
     *
     * it is show free slots in playground and book slots for each team
     */
    public void Booking_playground(){
        ArrayList<Integer> arr = new ArrayList<Integer>(8);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        int idx = 0;
        while (idx < arr.size())
        {
            if(arr.get(idx) == t &&arr.get(idx) == f)
            {
                // Remove item
                arr.remove(idx);
                arr.remove(idx);
            }
            else
            {
                ++idx;
            }
            //System.out.println("free slots now :");

        }




    }
    /**
     *player enter hour of match and show avaliable hours for slots
     *
     */

    public void showing_avahours(){
        System.out.println("we have slots from(1 to 8) choice your slot (slot one hour)");
        Scanner slot=new Scanner(System.in);
        f=slot.nextInt();
        System.out.print("to");
        t= slot.nextInt();
        if(t-f !=1){
            System.out.println("please enter one hour");
        }
        else{
            System.out.println("Done!");
            Booking_playground();
        }

    }


    /* public void adding_player(Player [] p){
   for(int i=0;i<p.length;i++){
       System.out.println("enter name");
      Scanner myObj = new Scanner(System.in);
     String name=myObj.nextLine();
     p[i].setName(name);
     System.out.println("enter email");
     String email=myObj.nextLine();
      p[i].setEmail(email);
      System.out.println("enter phone");
      long phone=myObj.nextLong();
       p[i].setPhone(phone);
       System.out.println("enter ID");
       long ID=myObj.nextLong();
       p[i].setPhone(phone);
       System.out.println("enter password");
       long pass=myObj.nextLong();
       p[i].setPassword(pass);
   }
     }*/
/*public void display_player(){
       for(int i=0;i<p.length;i++){
           System.out.println( "his name"+p[i].getName());
    System.out.println( "his email"+p[i].getEmail());
     System.out.println( "his phone"+p[i].getPhone());
      System.out.println( "his pass"+p[i].getPassword());
       System.out.println( "his ID"+p[i].getID());
        }

   }*/
        /*public void adding_player(Player p){
            System.out.println("enter name");
            Scanner myObj = new Scanner(System.in);
            String name=myObj.nextLine();
            p.setName(name);
            System.out.println("enter email");
            String email=myObj.nextLine();
            p.setEmail(email);
            System.out.println("enter phone");
            long phone=myObj.nextLong();
            p.setPhone(phone);
            System.out.println("enter ID");
            long ID=myObj.nextLong();
            p.setPassword(ID);
            System.out.println("enter password");
            long pass=myObj.nextLong();
            p.setPassword(pass);

        }
        public void display_player(){
            System.out.println( "name is:"+    p.getName());
            System.out.println( "email is:"+  p.getEmail());
            System.out.println( "ID is:"+  p.getID());

            System.out.println( "phone is:"+  p.getPhone());
            System.out.println( "pass is:"+    p.getPassword());

        }*/
    /**
     *
     * adding player for creating team
     */
    public void adding_player(Player p){
        p.setObj(o);
    }
    public void display_player(){
        p.getObj();
    }



}
