package net.ajmichael.gat.objects;

public enum Mode {
  EXECUTABLE("100755"),
  NORMAL("100644"),
  SUBDIRECTORY("040000"),
  SUBMODULE("160000"),
  SYMLINK("120000");

  private final String value;

  Mode(String value) {
    this.value = value;
  }

  String getValue() {
    return value;
  }
}
