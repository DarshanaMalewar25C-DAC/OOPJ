/*
26. Smart Devices  
Scenario: Smart devices can perform actions like calling, messaging, and browsing internet. 
Problem Statement: 
● Interface Callable → method makeCall(String number) 
● Interface Messaging → method sendMessage(String number, String message) 
● Interface Internet → method browse(String website) 
● Class SmartPhone implements all three interfaces → provide respective implementations 
Sample Input: 
Call → number="9876543210" 
Message → number="9876543210", message="Hello!" 
Browse → website="www.google.com" 
Sample Output: 
Calling 9876543210 
Sending message to 9876543210: Hello! 
Browsing website: www.google.com 
*/

interface Callable {
	public void makeCall(String number);
}
interface Messaging {
	public void sendMessage(String number, String message);
}
interface Internet{
	public void browse(String website);
}
class SmartPhone implements Callable,Messaging,	Internet{
	String number;
	String message;
	String website;
	
	SmartPhone(String number,String message,String website){
		this.number=number;
		this.message=message;
		this.website=website;
	}
	@Override
	public void makeCall(String number){
		System.out.println("Calling "+number);
	}
	@Override
	public void sendMessage(String number, String message){
		System.out.println("Sending message to"+number+" : "+message);
	}
	@Override
	public void browse(String website){
		System.out.println("Browsing website:" + website);
	}
}
	

class SmartDevices{
	public static void main(String args[]){
		SmartPhone s1 = new SmartPhone("9876543210","9876543210"+" Hello!","www.google.com");
		s1.makeCall(s1.number);
		s1.sendMessage(s1.number , s1.message);
		s1.browse(s1.website);
	}
}
		
