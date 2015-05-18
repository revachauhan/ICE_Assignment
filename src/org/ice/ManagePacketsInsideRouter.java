package org.ice;

import java.util.ArrayList; 
import java.util.Collections; 
import java.util.List;

public class ManagePacketsInsideRouter {

public static void main(String[] args) {
    Packet p1 = new ManagementPacket(2);
    Packet p2 = new DataPacket(2);
    Packet p3 = new ManagementPacket(1);
    Packet p4 = new ManagementPacket(1);
    Packet p5 = new DataPacket(1);
    Packet p12 = new DataPacket(2,9);
    Packet p13 = new DataPacket(1,10);
    Packet p6 = new ManagementPacket(2);
    Packet p7 = new DataPacket(2);
    Packet p8 = new DataPacket(1);;
    Packet p9 = new ManagementPacket(2);
    Packet p10 = new DataPacket(2);
    Packet p11 = new ManagementPacket(2,2);


    List<Packet> packetQueue = new ArrayList<Packet>();

    packetQueue.add(p11);
    packetQueue.add(p13);
    packetQueue.add(p3);
    packetQueue.add(p5);
    packetQueue.add(p6);
    packetQueue.add(p7);
    packetQueue.add(p10);
    packetQueue.add(p11);
    packetQueue.add(p12);
    packetQueue.add(p1);
    packetQueue.add(p2);
    packetQueue.add(p8);
    packetQueue.add(p9);
    packetQueue.add(p4);



    insertIntoRouter(packetQueue);


}

private static void insertIntoRouter(List<Packet> q){
    System.out.println("Packets input into the router");
    for(Packet p : q)
    {
        System.out.println(p.toString());
    }
    System.out.println();


    queueSorting(q);
}

private static  void queueSorting(List<Packet> q) {

    System.out.println("After sorting on Packet");
    Collections.sort(q, new PacketComparator());
    System.out.println();
    for(Packet p : q)
    {
        System.out.println(p.toString());
    }
    System.out.println();




}
}