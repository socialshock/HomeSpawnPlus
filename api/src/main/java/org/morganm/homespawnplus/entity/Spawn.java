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
 *
 * Contributors:
 *     Andune - initial API and implementation
 */
package org.morganm.homespawnplus.entity;

import java.sql.Timestamp;

import org.morganm.homespawnplus.server.api.Location;

public interface Spawn extends EntityWithLocation {

	public abstract void setLocation(Location l);

	public abstract Location getLocation();

	/**
	 * Return true if this spawn is the new player spawn.
	 * 
	 * @return
	 */
	public abstract boolean isNewPlayerSpawn();

	/**
	 * Return true if this is the default spawn for the world it is in.
	 * 
	 * @return
	 */
	public abstract boolean isDefaultSpawn();

	public abstract int getId();

	public abstract void setId(int id);

	public abstract String getWorld();

	public abstract void setWorld(String world);

	public abstract Double getX();

	public abstract void setX(Double x);

	public abstract Double getY();

	public abstract void setY(Double y);

	public abstract Double getZ();

	public abstract void setZ(Double z);

	public abstract String getName();

	public abstract void setName(String name);

	public abstract String getGroup();

	public abstract void setGroup(String group);

	public abstract String getUpdatedBy();

	public abstract void setUpdatedBy(String updatedBy);

	public abstract Float getPitch();

	public abstract void setPitch(Float pitch);

	public abstract Float getYaw();

	public abstract void setYaw(Float yaw);

	public abstract Timestamp getLastModified();

	public abstract void setLastModified(Timestamp lastModified);

	public abstract Timestamp getDateCreated();

	public abstract void setDateCreated(Timestamp dateCreated);

}