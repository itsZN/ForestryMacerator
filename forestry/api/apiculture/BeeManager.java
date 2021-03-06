package forestry.api.apiculture;

import java.util.ArrayList;
import java.util.HashMap;

import net.minecraft.src.ItemStack;

import forestry.api.genetics.IMutation;


public class BeeManager {

	/**
	 * See {@link IBeeInterface} for details
	 */
	public static IBeeInterface beeInterface;

	/**
	 * Species templates for bees that can drop from hives.
	 * 
	 * 0 - Forest 1 - Meadows 2 - Desert 3 - Jungle 4 - End 5 - Snow 6 - Swamp
	 * 
	 * see {@link IMutation} for template format
	 */
	public static ArrayList<IHiveDrop>[] hiveDrops;

	/**
	 * 0 - Default Villages 1 - Desert Villages
	 */
	public static ArrayList<IBeeGenome>[] villageBees;
	
	/**
	 * Access to Forestry's breeding manager for breeding information.
	 */
	public static IBreedingManager breedingManager;
	/**
	 * List of possible mutations on species alleles.
	 */
	public static ArrayList<IBeeMutation> beeMutations = new ArrayList<IBeeMutation>();
	
	/**
	 * List of items that can induce swarming. Integer denotes x in 1000 chance.
	 */
	public static HashMap<ItemStack, Integer> inducers = new HashMap<ItemStack, Integer>();
}
