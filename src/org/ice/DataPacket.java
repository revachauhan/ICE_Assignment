package org.ice;

public class DataPacket extends Packet{

	public DataPacket(int size){

		this.name = "User Data";
		this.value = 1;
		this.size = size;
		this.time = count++;
	}
	public DataPacket(int size,int time){

		this.name = "User Data";
		this.value = 1;
		this.size = size;
		this.time = time;
	}
} 