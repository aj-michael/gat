package net.ajmichael.gat;

import dagger.Component;
import javax.inject.Singleton;
import net.ajmichael.gat.commands.Command;
import net.ajmichael.gat.commands.CommandsModule;

@Singleton
@Component(modules = {CommandsModule.class})
public interface GatComponent {

  Command getCommand();
}
