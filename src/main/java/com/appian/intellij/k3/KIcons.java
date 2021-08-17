package com.appian.intellij.k3;

import javax.swing.Icon;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.util.IconLoader;
import com.intellij.ui.LayeredIcon;

public final class KIcons {
  public static final Icon FILE = IconLoader.getIcon("k3.png");

  public static final Icon PUBLIC_FUNCTION = new LayeredIcon(AllIcons.Nodes.Function, AllIcons.Nodes.C_public);
  public static final Icon PRIVATE_FUNCTION = new LayeredIcon(AllIcons.Nodes.Function, AllIcons.Nodes.C_private);

  public static final Icon PUBLIC_VARIABLE = new LayeredIcon(AllIcons.Nodes.Variable, AllIcons.Nodes.C_public);
  public static final Icon PRIVATE_VARIABLE = new LayeredIcon(AllIcons.Nodes.Variable, AllIcons.Nodes.C_private);
}
