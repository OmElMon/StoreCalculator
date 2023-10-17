//Name: Omar Elharbili
//Due date: 6/24/23
//Final Exam Coding Assignment
//In this project we had to use our knowledge from this semester and create a program that'll be used to give the price of different products and the add ons with them. 
//Here we had to make a child class that'll contain the heat settings and the shut-off feature
package FinalProject;
//The child class
public class ElectricComforter extends Comforter{
//The variable for the heat setting
	private int numhtSettings;
//The variable for the automatic shutoff feature
	private boolean atshutoffFeat;
//The constructors
	public ElectricComforter() {
		super();//Trigerring the parent class
//Setting up the values for the heat settings and what triggers the shut-off feature
		numhtSettings = 1;
		atshutoffFeat = false;
	}
//The method for the # Heat Settings
	public int getNumHeatSettings() { return numhtSettings; }
//The method for the shut-off feature
    public boolean hasAutomaticShutoff() { return atshutoffFeat; }
//Method for the Heat settings 
	public void setnumhtSettings(int numhtSettings) {
		
		if (numhtSettings > 1 || numhtSettings < 5) { //Setting up the ranges neither fewer than 1 and more than 5
	            numhtSettings = numhtSettings; 
	        } 
		else {
	        	numhtSettings = 1; } //Default Settings
	        }
	public void setAutomaticShutOff(boolean atshutoffFeat) { //whether or not true or false
			atshutoffFeat = atshutoffFeat;
			
		if (atshutoffFeat) {
		    	Price += 15.75; //the added 15.75
		    }
		        }
	@Override
//Setting up the strings
	public String toString() {
//The output we want for the comforter
		if (atshutoffFeat) {
			return super.toString() + "\nContaining " + numhtSettings + " heat settings with the automatic shut-off";
		}
			
		else
			return super.toString() + "\nContaining " + numhtSettings + " heat settings with the automatic shut-off";
//Will return with the output we ask for 
		}
		
}
