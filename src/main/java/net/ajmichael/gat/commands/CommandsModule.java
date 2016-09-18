package net.ajmichael.gat.commands;

import dagger.Module;
import dagger.Provides;

@Module
public class CommandsModule {
  @Provides
  static Command provideCommands() {
    return new HashObject();
  }
}
