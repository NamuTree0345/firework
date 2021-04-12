package xyz.namutree0345.firework.tabCompleter

import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.TabCompleter

class PlayerListTabCompleter : TabCompleter {
    override fun onTabComplete(
        sender: CommandSender,
        command: Command,
        alias: String,
        args: Array<out String>
    ): MutableList<String> {
        val a = mutableListOf<String>()
        for (player in Bukkit.getOnlinePlayers()) {
            a.add(player.name)
        }
        if(args.isNotEmpty()) {
            for (plrname in a) {
                if(!plrname.startsWith(args[args.size - 1])) {
                    a.remove(plrname)
                }
            }
        }
        return a
    }
}