package org.ice;
import java.util.Comparator;

public class PacketComparator implements Comparator<Packet>{
	@Override
	public  int compare(Packet packet1, Packet packet2) {

		if(packet1.getValue()>packet2.getValue())
			return -1;
		else if(packet1.getValue()==packet2.getValue())
		{
			if(packet1.getSize()>packet2.getSize())
				return -1;
			else if(packet1.getSize()==packet2.getSize())
			{
				if(packet1.getTime()>packet2.getTime())
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