//Name: Omar Elharbili
//Due date: 6/24/23
//Final Exam Coding Assignment
//In this project we had to use our knowledge from this semester and create a program that'll be used to give the price of different products and the add ons with them. 
package FinalProject;
//Setting up the class
public class Comforter {
//The variables will be using
	public String Size;
	public String Material;
	public String Color; 
	public double Price;
//Size, Material, Color, and Price
	public Comforter() {
//Here we have our constructors
		Size = "Twin";
		Material = "Cotton";
		Color = "White";
		Price = 60;
		
	}
//Now to the process of setters and getters
	public void setsSize(String sz) { //sz = size
		
	    if (sz.equals("Double")) { //Setting up the price for the products
//If else statement to help us get the output we need if the function calls for it
	        Size = "Double"; 
	        Price += 30; //30 for double 
	        
	    } else if (sz.equals("Queen")) { //Same thing as double
	    	
	        Size = "Queen";
	        Price += 60; //We add 60 instead
	        
	    } else if (sz.equals("King")) { //Same thing as double
	    	
	        Size = "King";
	        Price += 100; //100 for the king
	        
	    } else {
	        resetToDefault(); //A quicker way to reset our values rather than having to repeat
	    }
	}
//Setting up the setter for colors
	public void setColor(String cr) {
		
			Color = cr; //Always remember to add all components
		}
//Materials setters
	public void setMaterial(String ml) {
//We got Wool, Down, and Bamboo
	    if (ml.equals("Wool")) {
	    	
	        Material = "Wool";
	        Price += 50; //50 for Wool
	        
	    } else if (ml.equals("Down")) {
	    	
	        Material = "Down";
	        Price += 80; //80 for Down
	        
	    } else if (ml.equals("Bamboo")) {
	    	
	        Material = "Bamboo";
	        Price += 100; //100 for Bamboo
	        
	    } else {
	        resetToDefault();
	        
	    }
	}
//Basically what'll reset the comforter class values
	private void resetToDefault() {
		
		Size = "Twin";
		Material = "Cotton";
		Color = "White";
		Price = 60;
	}
	@Override
//Creating the string
    public String toString() {
        return "Price for the " + Size + " " + "sized " + Material +  " " + Color + " comforter will be $" +  String.format("%.2f", Price);
//Our return Values and how we want it to be worded out in the output
    }
}

	


