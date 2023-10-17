//Name: Omar Elharbili
//Due date: 6/24/23
//Final Exam Coding Assignment
//In this project we had to use our knowledge from this semester and create a program that'll be used to give the price of different products and the add ons with them.
//For this class we are basically testing our two other classes 
package FinalProject;
//The test program
public class ComforterDemo {

    public static void main(String[] args) {
//Doing some "designing"
    	System.out.println("Prices:");
    	System.out.println("-----------------------------------------------------------");
//Creating the comforter object for the output in this class
        Comforter com = new Comforter();
        com.setsSize("King"); //Setting the size
        com.setColor("Purple"); //Setting the color (the most annoying part)
        com.setMaterial("Down"); //Setting the Material
        System.out.println(com); //And the output
//Creating the ECR object 
        ElectricComforter eCr = new ElectricComforter();
        eCr.setnumhtSettings(5); //The number for the heat settings
        eCr.setAutomaticShutOff(true); //Setting the shut-off feature
        //Btw if you switch to false it'll give you a different output and not add the 15.75
        System.out.println(eCr); //The output
        System.out.println("-----------------------------------------------------------");
    }
}