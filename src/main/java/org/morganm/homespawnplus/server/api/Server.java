/**
 * 
 */
package org.morganm.homespawnplus.server.api;

import org.morganm.homespawnplus.i18n.HSPMessages;
import org.morganm.homespawnplus.server.api.events.EventDispatcher;


/**
 * @author morganm
 *
 */
public interface Server {
    /**
     * Find the given world
     *   
     * @param worldName the world to find
     * @return the World object or null if no World was found
     */
    public World getWorld(String worldName);

    public EventDispatcher getEventDispatcher();
    
    /**
     * Schedule a teleport to happen at the next possible time on the
     * main thread. This can be used to safely teleport a player on an async
     * thread or to safely teleport them in events where it is otherwise not
     * safe to teleport them directly (such as onJoinEvent).
     * 
     * @param player the player to teleport
     * @param location the Location to teleport the player to
     */
    public void delayedTeleport(Player player, Location location);
    
    /**
     * Given a localized key value and optional arguments, return a localized
     * message.
     * 
     * At some point this method should be phased out in favor of a better i18n
     * system like Google gettext-commons, where the key values are unecessary
     * and the text can be embedded and translated directly in the original code.
     *
     * @param key the key value, @see {@link org.morganm.homespawnplus.i18n.HSPMessages}
     * @param args varargs key-value pairs, ie. {"player", "fluffybunny", "amount", 42}
     * @return
     */
    public String getLocalizedMessage(final HSPMessages key, final Object...args);
    
    /**
     * Given a player name, return the corresponding Player object (if any).
     * 
     * @param playerName the playerName to look for
     * 
     * @return the player object
     */
    public Player getPlayer(String playerName);
}
