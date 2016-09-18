package net.ajmichael.gat.objects.commit;

import com.google.common.hash.HashCode;
import net.ajmichael.gat.objects.GitObject;

public final class CommitObject extends GitObject {
  private static final String TYPE_NAME = "TODO WHAT IS THIS";

  @Override
  public String getTypeName() {
    return TYPE_NAME;
  }

  @Override
  public HashCode getChecksum() {
    return null;
  }
}
