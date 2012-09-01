package ForestryMacerator;

import java.util.logging.Logger;

import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

import buildcraft.api.liquids.LiquidStack;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import forestry.api.recipes.ICarpenterManager;

@Mod(modid = "ForestryMacerator", name = "Forestry Macerator Addon", version = "1.0.0")
public class ForestryMaceratorCore {
	public static Logger cmLog = Logger.getLogger("ForestryMacerator");
	
	@Instance("ForestryMacerator")
	public static ForestryMaceratorCore instance;
	
	@PreInit
	public void loadConfiguration(FMLPreInitializationEvent evt) {
		cmLog.setParent(FMLLog.getLogger());
		cmLog.info("Starting ForestryMacerator v1.0.0");
		
		
	}
	
	@Init
	public void initialize(FMLInitializationEvent evt) {
	}

	public void ModsLoaded() {
		ICarpenterManager.addRecipe(600,new LiquidStack(Block.waterStill.blockID, 2000), null ,new ItemStack(Item.ingotIron,2),1,1,);
	}

}