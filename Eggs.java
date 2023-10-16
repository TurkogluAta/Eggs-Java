/*
* Eggs.java
* @author: Ata Turkoglu & Idil Zehra Tatar
* Date: 14/02/2023
*/

public class Eggs{
    //Declare data members - All private
    private int egg;
    private int box;
    private int remainder;

    //Constructor - Same name as the class, give each variable a default value 
    public Eggs(){
        egg = 0;
        box = 0;
        remainder = 0;
    }

    //Setters - One for every input variable
    public void setEgg(int egg){
        this.egg = egg;
    }

    //Compute method(s)
    public void computeBox(){
        box = egg/12;
    }
    public void computeRemainder(){
        remainder = egg%12;
    }
    //Getters - One for every output variable
    public int getBox(){
        return box;
    }
    public int getRemainder(){
        return remainder;
    }
}