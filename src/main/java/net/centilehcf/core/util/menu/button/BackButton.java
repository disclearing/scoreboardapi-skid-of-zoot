package net.centilehcf.core.util.menu.button;

import net.centilehcf.core.util.CC;
import net.centilehcf.core.util.ItemBuilder;
import net.centilehcf.core.util.menu.Button;
import net.centilehcf.core.util.menu.Menu;
import java.util.Arrays;
import lombok.AllArgsConstructor;
import net.centilehcf.core.util.CC;
import net.centilehcf.core.util.ItemBuilder;
import net.centilehcf.core.util.menu.Button;
import net.centilehcf.core.util.menu.Menu;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

@AllArgsConstructor
public class BackButton extends Button {

	private Menu back;

	@Override
	public ItemStack getButtonItem(Player player) {
		return new ItemBuilder(Material.REDSTONE)
				.name(CC.RED + CC.BOLD + "Back")
				.lore(Arrays.asList(
						CC.RED + "Click here to return to",
						CC.RED + "the previous menu.")
				)
				.build();
	}

	@Override
	public void clicked(Player player, ClickType clickType) {
		Button.playNeutral(player);
		back.openMenu(player);
	}

}
