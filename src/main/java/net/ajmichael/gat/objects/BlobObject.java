package net.ajmichael.gat.objects;

public final class BlobObject extends GitObject {
  private static final String TYPE_NAME = "blob";

  @Override
  public String getTypeName() {
    return TYPE_NAME;
  }
}
