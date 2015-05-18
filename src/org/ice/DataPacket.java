package org.ice;

public class DataPacket extends Packet{
//two types of constructors defined to implement multiple packets at the same time 
//if time is undefined it increments by the static count of packets
	public DataPacket(int size){

		this.name = "User Data";
		this.value = 1;			//value is set to 1 to differentiate between a data and management packet
		this.size = size;
		this.time = count++;	
	}
	//to implement the time functionality to the packets input
	public DataPacket(int size,int time){

		this.name = "User Data";
		this.value = 1;
		this.size = size;
		this.time = time;
	}
} 