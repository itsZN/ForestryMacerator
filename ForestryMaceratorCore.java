package ForestryMacerator;

import java.util.logging.Logger;

import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

import buildcraft.api.liquids.LiquidStack;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import forestry.api.core.BlockInterface;
import forestry.api.core.ForestryAPI;
import forestry.api.core.ItemInterface;
import forestry.api.recipes.RecipeManagers;

@Mod(modid = "ForestryMacerator", name = "Forestry Macerator Addon", version = "1.0.0")
public class ForestryMaceratorCore {
	public static Logger cmLog = Logger.getLogger("ForestryMacerator");
	public static ShapedOreRecipe copperRecipe;
	public static ShapedOreRecipe tinRecipe;
	
	@Instance("ForestryMacerator")
	public static ForestryMaceratorCore instance;
	
	@PreInit
	public void loadConfiguration(FMLPreInitializationEvent evt) {
		cmLog.setParent(FMLLog.getLogger());
		cmLog.info("Starting ForestryMacerator v1.0.0");
		
		
		
	}
	
	
	
	@Init
	public void initialize(FMLInitializationEvent evt) {
		//cmLog.info("Test");
		//cmLog.info(Block.blocksList[BlockInterface.getBlock("oreCopper").itemID].getBlockName());
		//cmLog.info(String.valueOf(BlockInterface.getBlock("oreCopper").itemID));
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 3000), null ,new ItemStack(Item.ingotIron,3),new Object[]{"   "," X ","   ", Character.valueOf('X'), Block.oreIron});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 3000), null ,new ItemStack(Item.ingotGold,2),new Object[]{"   "," X ","   ", Character.valueOf('X'), Block.oreGold});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 3000), null ,new ItemStack(Item.flint,1),new Object[]{"   "," X ","   ", Character.valueOf('X'), Block.gravel});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 3000), null ,new ItemStack(ItemInterface.getItem("ingotCopper").getItem(),2), new Object[]{"   "," X ","   ", Character.valueOf('X'), new ItemStack(Block.blocksList[BlockInterface.getBlock("resources").itemID],1,1)});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 3000), null ,new ItemStack(Block.gravel,1),new Object[]{"   "," X ","   ", Character.valueOf('X'), Block.cobblestone});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 3000), null ,new ItemStack(ItemInterface.getItem("ingotTin").getItem(),2), new Object[]{"   "," X ","   ", Character.valueOf('X'), new ItemStack(Block.blocksList[BlockInterface.getBlock("resources").itemID],1,2)});
		
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), null ,new ItemStack(ItemInterface.getItem("crate").getItem(),24),new Object[]{" X ","X X"," X ", Character.valueOf('X'), Block.wood});
		
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedCobblestone").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), Block.cobblestone});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedDirt").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), Block.dirt});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedStone").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), Block.stone});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedBrick").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), Block.brick});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedCacti").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), Block.cactus});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedSand").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), Block.sand});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedObsidian").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), Block.obsidian});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedNetherrack").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), Block.netherrack});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedSandstone").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), Block.sandStone});
		
		//RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedBogearth").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), new ItemStack(Block.blocksList[BlockInterface.getBlock("bogEarth").itemID],1)});
		//RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedHumus").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), new ItemStack(Block.blocksList[BlockInterface.getBlock("humus").itemID],1)});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedNetherbrick").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), Block.netherBrick});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedPeat").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), new ItemStack(ItemInterface.getItem("peat").getItem(),1)});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedApatite").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), new ItemStack(ItemInterface.getItem("apatite").getItem(),1)});
		//RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedFertilizer").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), new ItemStack(ItemInterface.getItem("fertilizer").getItem(),1)});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedWheat").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), Item.wheat});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedMulch").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), new ItemStack(ItemInterface.getItem("mulch").getItem(),1)});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedBeeswax").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), new ItemStack(ItemInterface.getItem("beeswax").getItem(),1)});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedPollen").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), new ItemStack(ItemInterface.getItem("pollen").getItem(),1)});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedPropolis").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), new ItemStack(ItemInterface.getItem("propolis").getItem(),1)});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedHoneydew").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), new ItemStack(ItemInterface.getItem("honeydew").getItem(),1)});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedRoyalJelly").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), new ItemStack(ItemInterface.getItem("royalJelly").getItem(),1)});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedRedstone").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), Item.redstone});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedReeds").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), Block.reed});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedClay").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), Item.clay});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedGlowstone").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), Item.lightStoneDust});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedApples").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), Item.appleRed});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedNetherwart").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), Item.netherStalkSeeds});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedRefractoryWax").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), new ItemStack(ItemInterface.getItem("refractoryWax").getItem(),1)});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedPhosphor").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), new ItemStack(ItemInterface.getItem("phosphor").getItem(),1)});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedAsh").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), new ItemStack(ItemInterface.getItem("ash").getItem(),1)});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedGravel").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), Block.gravel});
		RecipeManagers.carpenterManager.addRecipe(45,new LiquidStack(Block.waterStill.blockID, 1000), new ItemStack(ItemInterface.getItem("crate").getItem(),1) ,new ItemStack(ItemInterface.getItem("cratedSeeds").getItem(),1),new Object[]{"XXX","XXX","XXX", Character.valueOf('X'), Item.seeds});
		
	
	}
	
	public String getPriorities() {
	    return "after:mod_IC2;after:mod_BuildCraftCore;after:mod_BuildCraftEnergy;after:mod_BuildCraftFactory;after:mod_BuildCraftSilicon;after:mod_BuildCraftTransport;after:mod_RedPowerWorld;after:mod_Forestry";
	  }

	public void ModsLoaded() {
		
	}

}