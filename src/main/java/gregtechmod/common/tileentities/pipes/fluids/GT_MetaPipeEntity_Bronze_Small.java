package gregtechmod.common.tileentities.pipes.fluids;

import gregtechmod.api.interfaces.IGregTechTileEntity;
import gregtechmod.api.interfaces.IMetaTileEntity;
import gregtechmod.api.metatileentity.implementations.GT_MetaPipeEntity_Fluid;

public class GT_MetaPipeEntity_Bronze_Small extends GT_MetaPipeEntity_Fluid {

   public GT_MetaPipeEntity_Bronze_Small(int aID, String aName) {
      super(aID, aName);
   }

   public GT_MetaPipeEntity_Bronze_Small() {}

   public IMetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
      return new GT_MetaPipeEntity_Bronze_Small();
   }

   public int getTextureIndex(byte aSide, byte aConnections, boolean aConnected, boolean aRedstone) {
      return aConnected?401:364;
   }

   public float getThickNess() {
      return 0.375F;
   }

   public int getFluidCapacityPerTick() {
      return 40;
   }
}
