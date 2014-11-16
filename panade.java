package com.jimdo.ibornlp;




import javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = iborns.MODID, version = iborns.VERSION)
public class iborns
{
	
    public static final String MODID = "ibornsmod";
    public static final String VERSION = "0.0.1";
	
    
    public Block TestBlock = new com.jimdo.ibornlp.blocks.TestBlock(Material.rock).setBlockName("testBlock").setBlockTextureName(MODID + ":TestBlock");
    public Block armorblock1 = new com.jimdo.ibornlp.blocks.armorblock1(Material.rock).setBlockName("armorblock1").setBlockTextureName(MODID + ":armorblock1");
    public Block armorblock2 = new com.jimdo.ibornlp.blocks.armorblock2(Material.rock).setBlockName("armorblock2").setBlockTextureName(MODID + ":armorblock2");
    public Block armorblock3 = new com.jimdo.ibornlp.blocks.armorblock3(Material.rock).setBlockName("armorblock3").setBlockTextureName(MODID + ":armorblock3").setHardness(2.5F);
    public Item schnitzel = new com.jimdo.food.schnitzel(20, 1.0F, false).setTextureName(MODID + ":schnitzel").setUnlocalizedName("schnitzel");
    public Item rawschnitzel = new com.jimdo.food.rawschnitzel(1, 1.0F, false).setTextureName(MODID + ":rawschnitzel").setUnlocalizedName("rawschnitzel");
    public Item panade = new com.jimdo.food.panade(0, 1.0F, false).setTextureName(MODID + ":panade").setUnlocalizedName("panade");		
    public Item schokolade = new com.jimdo.food.schokolade(1, 1.0F, true).setTextureName(MODID + "schokolade.png").setUnlocalizedName("schokolade");
    public Item spekulatius = new com.jimdo.food.spekulatius(5, 1.0F, false).setTextureName(MODID + "spekulatius").setUnlocalizedName("spekulatius");
    public Item creeperstick = new ibornsitems.creeperstick().setCreativeTab(CreativeTabs.tabBlock).setUnlocalizedName("creeperstick");

    
    @EventHandler
    public void init(FMLInitializationEvent event) {
	} {
	}
    
    @EventHandler
    public void preinit(FMLInitializationEvent event){
    	CreativeTabs tab = new CreativeTabs("ibornsmod") {;
        @Override
        public Item getTabIconItem() {
       	return Item.getItemFromBlock(armorblock1);}
    	};
    //GR
    	//GR-Block
    GameRegistry.registerBlock(armorblock1, "armorblock1");
    GameRegistry.registerBlock(armorblock2, "armorblock2");
    GameRegistry.registerBlock(armorblock3, "armorblock3");
       //GR-Items 
    GameRegistry.registerItem(schnitzel, "schnitzel");
    GameRegistry.registerItem(rawschnitzel, "rawschnitzel");
    GameRegistry.registerItem(panade , "panade");
    GameRegistry.registerItem(schokolade, "schokolade");
    GameRegistry.registerItem(spekulatius, "spekulatius");
    GameRegistry.registerItem(creeperstick, "creeperstick");
    
    
    }
    
    
    
    
    @EventHandler
    public void postinit(FMLInitializationEvent event) {
	}
   	
    
    //CraftingRezepte
    
    
    public void CraftingRezepte(){
    	 
    	 GameRegistry.addRecipe(new ItemStack(armorblock1, 1), new Object[]{
    		 "efe",
    		 "dcj",
    		 "eme",
    		 
    		Character.valueOf('e'), Items.diamond },
    	    Character.valueOf('c'), Items.leather_boots);
    	 
    	 GameRegistry.addShapelessRecipe(new ItemStack(panade, 8), Items.bread);
    	 GameRegistry.addShapelessRecipe(new ItemStack(rawschnitzel, 1), Items.beef);
    	 GameRegistry.addSmelting(rawschnitzel, new ItemStack (schnitzel, 1), 10.0F);
    		
    	 GameRegistry.addRecipe(new ItemStack(spekulatius, 1), new Object[]{
    		 "efe",
    		 "dcj",
    		 "eme",
    		 
    		Character.valueOf('e'), Items.wheat},
    	    Character.valueOf('c'), schokolade);
    		 {
    			 GameRegistry.addRecipe(new ItemStack(schokolade, 1), new Object[]{
    	    		 "efe",
    	    		 "dcj",
    	    		 "eme",
    	    		 
    	    		Character.valueOf('e'), Items.milk_bucket},
    	    	    Character.valueOf('c'), Blocks.cocoa);
    		
    		
    ; }


	
	;}  ; ; ;};  
    		 
    		 
    	
    

    

