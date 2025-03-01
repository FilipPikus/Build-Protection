package filip.hardcorecode.buildPlugin;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

import static filip.hardcorecode.buildPlugin.BuildPlugin.buildMode;


public class BuildCommand implements CommandExecutor {
    public static String buildmodeenabled = "§aBuildMode enabled!";
    public static String buildmodedisabled = "§cBuildMode disabled!";
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            UUID playerId = player.getUniqueId();

            if (buildMode.contains(playerId)) {
                buildMode.remove(playerId);
                player.sendMessage(buildmodedisabled);
                player.setGameMode(GameMode.SURVIVAL);
            } else {
                buildMode.add(playerId);
                player.sendMessage(buildmodeenabled);
                player.setGameMode(GameMode.CREATIVE);
            }
            return true;
        }
        return false;
    }

}