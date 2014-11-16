package com.jimdo.food;

import com.jimdo.ibornlp.iborns;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class schnitzel extends ItemFood {

	public schnitzel(int heal, float saturation, boolean wolf) {
		super (heal, saturation, false);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(CreativeTabs.tabBlock);
   this.setMaxStackSize(4);
   
	
	}

}
