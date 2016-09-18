package net.ajmichael.gat.objects.tree;

import net.ajmichael.gat.objects.GitObject;
import net.ajmichael.gat.objects.Mode;

class TreeEntry {
  private final Class<? extends GitObject> type;
  private final String filename;
  private final Mode mode;

  private TreeEntry(Class<? extends GitObject> type, String filename, Mode mode) {
    this.type = type;
    this.filename = filename;
    this.mode = mode;
  }
}
