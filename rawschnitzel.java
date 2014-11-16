package com.jimdo.food;

import com.jimdo.ibornlp.iborns;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class rawschnitzel extends ItemFood {
	public rawschnitzel(int heal, float saturation, boolean wolf) {
		super (heal, saturation, false);
		this.setCreativeTab(CreativeTabs.tabBlock);
		   this.setMaxStackSize(64);
} }
