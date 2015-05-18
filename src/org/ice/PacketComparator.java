package org.ice;
import java.util.Comparator;

public class PacketComparator implements Comparator<Packet>{
	@Override
	public  int compare(Packet packet1, Packet packet2) {

		if(packet1.getValue()>packet2.getValue())			//packet type comparison
			return -1;
		else if(packet1.getValue()==packet2.getValue())		//if same type of packet
		{
			if(packet1.getSize()>packet2.getSize())			//Size Comparison two discrete values
				return -1;
			else if(packet1.getSize()==packet2.getSize())	//if above 2 conditions are equal
			{
				if(packet1.getTime()>packet2.getTime())		//time comparison which was received first is given priority
					return 1;
				else if(packet1.getTime()==packet2.getTime())
					return 0;
				else 
					return -1;
			}
			else 
				return 1;
		}
		else 
			return 1;
	}
}