package net.ajmichael.gat;

import net.ajmichael.gat.commands.Command;
import net.ajmichael.gat.commands.CommandsModule;

public class Gat {

  public static void main(String[] args) {
    System.out.println("Starting gat");
    /*Command command = DaggerGat_GatComponent.builder()
        .commandsModule(new CommandsModule())
        .build();
    System.out.println(command.getClass());*/
  }
}
