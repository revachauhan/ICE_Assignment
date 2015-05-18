 package org.ice;

public class ManagementPacket extends Packet {

public ManagementPacket(int size){

    this.name = "Management";
    this.value = 2;
    this.size = size;
    this.time = count++;


}
public ManagementPacket(int size,int time){

    this.name = "Management";
    this.value = 2;
    this.size = size;
    this.time = time;


}
}