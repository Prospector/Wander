package prospector.wander.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.config.feature.DefaultFeatureConfig;
import prospector.silk.block.SilkBlockLeaves;
import prospector.silk.block.SilkBlockSapling;
import prospector.silk.util.SilkSaplingGenerator;
import prospector.wander.feature.TraverseTreeFeature;

public class AutumnalLSCompound {
	public static final BlockState OAK_LOG = Blocks.OAK_LOG.getDefaultState();
	public String name;
	public LSLeaves lsLeaves;
	public LSSapling lsSapling;

	public AutumnalLSCompound() {
		lsLeaves = new LSLeaves();
		lsSapling = new LSSapling();
	}

	public class LSLeaves extends SilkBlockLeaves {

		public LSLeaves() {
			super(null);
		}
	}

	public class LSSapling extends SilkBlockSapling {
		public LSSapling() {
			super(new SilkSaplingGenerator(new TraverseTreeFeature(DefaultFeatureConfig::make, false, OAK_LOG, lsLeaves.getDefaultState())));
		}
	}

}