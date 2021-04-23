package com.dragontechdev.projectshadow.common.items.jewellery;

import com.dragontechdev.projectshadow.common.items.psItem;
import com.dragontechdev.projectshadow.core.enums.psEnum_Gem_Quality;
import com.dragontechdev.projectshadow.core.enums.psEnum_Gems;

public class psBaseAmulet extends psItem {
	
	public int sockets;
	public int[] socketArray;

	public psBaseAmulet(Properties prop, int sockets) {
		super(prop);
		this.sockets = sockets;
		this.socketArray = new int[sockets];
	}
	
	public int getSocket() {
		return sockets;
	}
	
	public int getNumSockets()
	{
		return socketArray.length;		
	}
	
	public void setSocket(psEnum_Gem_Quality quality, psEnum_Gems gem, int socket)
	{
		
	}

}
