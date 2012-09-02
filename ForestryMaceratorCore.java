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
import forestry.api.recipes.RecipeManagers;

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
		RecipeManagers.carpenterManager.addRecipe(30,new LiquidStack(Block.waterStill.blockID, 2000), null ,new ItemStack(Item.ingotIron,2),new Object[]{"DDD","DDD","DDD", Character.valueOf('D'), Block.dirt});
	}
	
	public String getPriorities() {
	    return "after:mod_IC2;after:mod_BuildCraftCore;after:mod_BuildCraftEnergy;after:mod_BuildCraftFactory;after:mod_BuildCraftSilicon;after:mod_BuildCraftTransport;after:mod_RedPowerWorld;after:mod_Forestry";
	  }

	public void ModsLoaded() {
		
	}

}