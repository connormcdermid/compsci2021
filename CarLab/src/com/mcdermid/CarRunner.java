package com.mcdermid;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
public class CarRunner {

    public static void main( String[] args ) {
        Car c = new Car( 9000, 3000 );	//single constructor that takes in miles
        //driven and when to change the oil
        //assumes car has never had an oil change
        //sets last oil change mileage to 0



        System.out.println( c.timeForOilChange( ) );	//checks if it is time to change oil
        //returns true as 9000 is >= 3000
        //resets last oil change mileage to 0



        c.addMiles( 2000 );					//add 2000 miles to miles driven



        System.out.println( c.timeForOilChange( ) );	//checks if it is time to change oil
        //car has driven 2000 miles since
        //last oil change – returns false



        c.addMiles( 2000 );					//add 2000 miles to miles driven



        System.out.println( c.timeForOilChange( ) );	//checks if it is time to change oil
        //car has now driven 4000 miles since
        //last oil change – return true
        //4000 is >= 3000 so time to change oil

    }
}