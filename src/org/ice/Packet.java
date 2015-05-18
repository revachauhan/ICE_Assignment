package org.ice;

public abstract class Packet {

	String name;
	int value; 
	int size;
	int time;
	static int count = 1;
	//Setter and getters for member variables
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getTime() {
		return time;
	}
	//to string method for output to console
	@Override
	public String toString() {
		return "Packet [name=" + name + ", size=" + size + ", time=" + time
				+ "]";
	}
}