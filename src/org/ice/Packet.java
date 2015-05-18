package org.ice;

public abstract class Packet {

	String name;
	int value;
	int size;
	public int time;
	public static int count = 1;

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
	@Override
	public String toString() {
		return "Packet [name=" + name + ", size=" + size + ", time=" + time
				+ "]";
	}
}