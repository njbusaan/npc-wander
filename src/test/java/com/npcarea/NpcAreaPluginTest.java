package com.npcarea;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class NpcAreaPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(NpcAreaPlugin.class);
		RuneLite.main(args);
	}
}