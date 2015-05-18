package org.ice;

public class ManagementPacket extends Packet {
	//two types of constructors defined to implement multiple packets at the same time 
	//if time is undefined it increments by the static count of packets
	public ManagementPacket(int size){

		this.name = "Management";
		this.value = 2; //value is set to 1 to differentiate between a data and management packet
		this.size = size;
		this.time = count++;
	}
	//to implement the time functionality to the packets input
	public ManagementPacket(int size,int time){

		this.name = "Management";
		this.value = 2;
		this.size = size;
		this.time = time;
	}
}