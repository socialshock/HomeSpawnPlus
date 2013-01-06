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
package org.morganm.homespawnplus.server.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.morganm.homespawnplus.config.ConfigException;

/** Interface to YAML configuration. HSP config files are written in
 * YAML, however through this interface they are not bound to any
 * specific implementation. So an implementation could be written to
 * bind to Bukkit's YAML, or SnakeYAML, or some other YAML API.
 * 
 * @author morganm
 *
 */
public interface YamlFile {
    public void save(File file) throws IOException;
    public void load(File file) throws FileNotFoundException, IOException, ConfigException;
    
    /**
     * Gets the requested ConfigurationSection by path.
     *
     * @param path Path of the ConfigurationSection to get.
     * @return Requested ConfigurationSection.
     */
    public ConfigurationSection getConfigurationSection(String path);
    
    /**
     * Returns the root configuration section for this file.
     * 
     * @return root ConfigurationSection.
     */
    public ConfigurationSection getRootConfigurationSection();
}