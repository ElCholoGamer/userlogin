package com.elcholostudios.userlogin.events;

import com.elcholostudios.userlogin.util.Utils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerCommandEvent;
import org.jetbrains.annotations.NotNull;

public class OnConsoleCommand implements Listener {

    @EventHandler
    public void onConsoleCommand(@NotNull ServerCommandEvent e) {
        if ((e.getCommand() + " ").startsWith("reload ")) new Utils().reloadWarn(null);
    }
}
