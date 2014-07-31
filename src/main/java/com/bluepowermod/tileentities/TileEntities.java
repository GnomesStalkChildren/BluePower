/*
 * This file is part of Blue Power.
 *
 *     Blue Power is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Blue Power is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Blue Power.  If not, see <http://www.gnu.org/licenses/>
 */

package com.bluepowermod.tileentities;

import com.bluepowermod.tileentities.tier1.*;
import com.bluepowermod.tileentities.tier2.TileSortingMachine;
import com.bluepowermod.tileentities.tier2.TileWindmill;
import com.bluepowermod.tileentities.tier3.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntities {
    
    /**
     * Method to register the TE's to the game. If a TE is not registered, it _will_ cause issues!
     */
    public static void init() {
    
        GameRegistry.registerTileEntity(TileAlloyFurnace.class, "tileAlloyFurnace");
        GameRegistry.registerTileEntity(TileBlockBreaker.class, "tileBlockBreaker");
        GameRegistry.registerTileEntity(TileIgniter.class, "tileIgniter");
        GameRegistry.registerTileEntity(TileBuffer.class, "tileBuffer");
        GameRegistry.registerTileEntity(TileTransposer.class, "tileTransposer");
        GameRegistry.registerTileEntity(TileSortingMachine.class, "tileSortingMachine");
        GameRegistry.registerTileEntity(TileSortron.class, "tileSortron");
        GameRegistry.registerTileEntity(TileCPU.class, "tileCPU");
        GameRegistry.registerTileEntity(TileMonitor.class, "tileMonitor");
        GameRegistry.registerTileEntity(TileDiskDrive.class, "tileDiskDrive");
        GameRegistry.registerTileEntity(TileIOExpander.class, "tileIOExpander");
        GameRegistry.registerTileEntity(TileEngine.class, "tileEngine");
        GameRegistry.registerTileEntity(TileWindmill.class, "windmill");
        GameRegistry.registerTileEntity(TileKinectGenerator.class, "kinectgenerator");
        GameRegistry.registerTileEntity(TileDeployer.class, "deployer");
        GameRegistry.registerTileEntity(TileEjector.class, "ejector");
        GameRegistry.registerTileEntity(TileRelay.class, "relay");
        GameRegistry.registerTileEntity(TileLamp.class, "tileLamp");
    }
}