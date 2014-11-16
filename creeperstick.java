package ibornsitems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class creeperstick extends Item {
	
	public ItemStack onItemRightClick(ItemStack par1, World par2, EntityPlayer par3){
		
		par2.createExplosion(par3, 20, 20, 20, 20, bFull3D);
		par1.damageItem(1, par3);
		return par1;
		
	}

	}
