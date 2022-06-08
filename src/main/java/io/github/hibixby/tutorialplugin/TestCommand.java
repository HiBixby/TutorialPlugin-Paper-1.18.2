package io.github.hibixby.tutorialplugin;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class TestCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(sender instanceof Player){
            Player player =(Player)sender;
            player.sendMessage("테스트 명령어를 실행하셨습니다.");

            ItemStack irons=new ItemStack(Material.IRON_INGOT);
            ItemStack diamonds =new ItemStack(Material.DIAMOND);
            irons.setAmount(10);
            diamonds.setAmount(7);

            player.getInventory().addItem(irons,diamonds);
            return true;

        }
        else if(sender instanceof ConsoleCommandSender){
            sender.sendMessage("콘솔에서는 이 명령어를 실행할 수 없습니다.");
            return false;
        }
        return false;
    }
}
