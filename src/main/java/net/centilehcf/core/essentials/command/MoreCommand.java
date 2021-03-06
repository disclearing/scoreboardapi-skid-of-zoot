package net.centilehcf.core.essentials.command;

import net.centilehcf.core.util.CC;
import com.qrakn.honcho.command.CommandMeta;
import org.bukkit.entity.Player;

@CommandMeta(label = "more", permission = "rank.admin")
public class MoreCommand {

	public void execute(Player player) {
		if (player.getItemInHand() == null) {
			player.sendMessage(CC.RED + "There is nothing in your hand.");
			return;
		}

		player.getItemInHand().setAmount(64);
		player.updateInventory();
		player.sendMessage(CC.GREEN + "You gave yourself more of the item in your hand.");
	}

}
