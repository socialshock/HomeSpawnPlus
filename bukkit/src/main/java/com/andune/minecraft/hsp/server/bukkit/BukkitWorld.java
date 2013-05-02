/**
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright (c) 2013 Andune (andune.alleria@gmail.com)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer
 * in the documentation and/or other materials provided with the
 * distribution.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */
/**
 * 
 */
package com.andune.minecraft.hsp.server.bukkit;

import com.andune.minecraft.hsp.server.api.Location;
import com.andune.minecraft.hsp.server.api.World;

/**
 *  API implementation for a Bukkit world. Essentially a proxy object.
 * 
 * @author andune
 *
 */
public class BukkitWorld implements World {
    final org.bukkit.World bukkitWorld;
    
    public BukkitWorld(org.bukkit.World world) {
        bukkitWorld = world;
    }

    /* (non-Javadoc)
     * @see com.andune.minecraft.hsp.server.api.World#getName()
     */
    @Override
    public String getName() {
        return bukkitWorld.getName();
    }

    @Override
    public boolean setSpawnLocation(int x, int y, int z) {
        return bukkitWorld.setSpawnLocation(x,  y,  z);
    }

    @Override
    public Location getSpawnLocation() {
        return new BukkitLocation(bukkitWorld.getSpawnLocation());
    }
    
    public org.bukkit.World getBukkitWorld() {
        return bukkitWorld;
    }

    @Override
    public int getMaxHeight() {
        return bukkitWorld.getMaxHeight();
    }
}
