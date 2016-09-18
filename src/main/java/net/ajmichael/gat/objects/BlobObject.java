package net.ajmichael.gat.objects;

import com.google.common.hash.HashCode;

public final class BlobObject extends GitObject {
  private static final String TYPE_NAME = "blob";

  @Override
  public String getTypeName() {
    return TYPE_NAME;
  }

  @Override
  public HashCode getChecksum() {
    return null;
  }
}
