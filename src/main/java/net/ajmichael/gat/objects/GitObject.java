package net.ajmichael.gat.objects;

import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;

import java.nio.charset.Charset;

public abstract class GitObject {

  public abstract String getTypeName();

  public abstract HashCode getChecksum();

  private HashCode getChecksum(String content) {
    return Hashing.sha1()
        .newHasher()
        .putString(getTypeName(), Charset.defaultCharset())
        .putChar(' ')
        .putString(Integer.toString(content.length()), Charset.defaultCharset())
        .putChar('\0')
        .putString(content, Charset.defaultCharset())
        .hash();
  }
}
