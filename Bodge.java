package plus.crates;

import java.util.Arrays;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

public class Bodge {
	
	public static String[] worlds = new String[] {"arena", "herobend"};

	public static boolean canGiveKey(OfflinePlayer player) {
		if (player instanceof Player) {
			if (Arrays.asList(worlds).contains(((Player) player).getWorld().getName())) {
				return false;
			}
		}
		return true;
	}
}
