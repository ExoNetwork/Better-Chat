package de.javakara.manf.betterchat.listeners;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerChatEvent;

/**
 * Registers all Playerspecific Events
 * @author manf
 */
public class BetterChatPlayerListener implements Listener {
	/**
	 * Every Message will be checked for Links
	 * @see PlayerChatEvent
	 */
	@EventHandler(priority = EventPriority.LOW)
    public void playerChats(PlayerChatEvent event) {
		String mes = event.getMessage();
		String newMes = "";
		
		if(mes != null && mes.contains("http://")){
			String[] f = mes.split(" ");
			
			for(String q:f){
				if(q.startsWith("http://")){
					q = ChatColor.UNDERLINE + q + ChatColor.RESET;
				}
				
				newMes += q + " ";
			}
		}else{
			return;
		}
		
		event.setMessage(newMes);
    }
}