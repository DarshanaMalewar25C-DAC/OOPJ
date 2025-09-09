/*
5. Temperature Sensor 
Scenario: Sensor should only accept temperatures in safe range. 
Problem Statement: 
Create a class TemperatureSensor with private temperature. Setter validates range 0–100°C. 
Fields: 
● private int temperature 
Methods: 
● setTemperature(int t) → only 0–100 valid 
● getTemperature() → return temperature 
Sample Input: 
temperature = -5 
Sample Output: 
“Temperature out of range”
*/

class TemperatureSensor{
	private int temperature;
	
	public void setTemperature(int t){
		if(t>0 && t<100){
			temperature= t;
		}
		else{
			System.out.println("Temperature out of range");
		}
	}
	public int getTemperature(){
		return temperature;
	}
}

class Sensor{
	public static void main(String args[]){
		TemperatureSensor t1 = new TemperatureSensor();
		t1.setTemperature(-5);
		t1.getTemperature();
		
		// t1.setTemperature(23);
		// System.out.println("Current temperature: " + t1.getTemperature());    //current temperature
	}
}