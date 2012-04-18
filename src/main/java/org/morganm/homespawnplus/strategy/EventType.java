package org.morganm.homespawnplus.strategy;

/** The HomeSpawnPlus event types. Strategy chains are defined and
 * based on these event types.
 * 
 * @author morganm
 *
 */
public enum EventType {
	ON_JOIN("onJoin"),
	ON_DEATH("onDeath"),
	HOME_COMMAND("onHomeCommand"),
	NAMED_HOME_COMMAND("onNamedHomeCommand"),
	SPAWN_COMMAND("onSpawnCommand"),
	GROUPSPAWN_COMMAND("onGroupSpawnCommand");
	
	private String configOption;
	EventType(String configOption) {
		this.configOption = configOption;
	}
	public String getConfigOption() { return configOption; }
	public String toString() { return getConfigOption(); }
}