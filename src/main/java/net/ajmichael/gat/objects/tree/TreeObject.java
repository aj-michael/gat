package net.ajmichael.gat.objects.tree;

import com.google.common.hash.HashCode;
import net.ajmichael.gat.objects.GitObject;

import java.util.ArrayList;
import java.util.List;

public final class TreeObject extends GitObject {
  private static final String TYPE_NAME = "tree";

  private final List<TreeEntry> entries = new ArrayList<>();

  @Override
  public String getTypeName() {
    return TYPE_NAME;
  }

  @Override
  public HashCode getChecksum() {
    return null;
  }
}
