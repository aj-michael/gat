package net.ajmichael.gat.objects;

public final class TreeObject extends GitObject {
  private static final String TYPE_NAME = "tree";

  @Override
  public String getTypeName() {
    return TYPE_NAME;
  }
}
