package net.ajmichael.gat.objects.tree;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.google.common.truth.Truth.assertThat;

@RunWith(JUnit4.class)
public class TreeObjectTest {

  @Test
  public void testChecksum() {
    TreeObject treeObject = new TreeObject();
    assertThat(treeObject.getChecksum()).isNotNull();
  }
}