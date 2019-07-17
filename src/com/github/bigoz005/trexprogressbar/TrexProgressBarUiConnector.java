package com.github.bigoz005.trexprogressbar;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicProgressBarUI;

public class TrexProgressBarUiConnector extends BasicProgressBarUI {
    @SuppressWarnings({"MethodOverridesStaticMethodOfSuperclass", "UnusedDeclaration"})
    public static ComponentUI createUI(JComponent c) {
        return new TrexProgressBarUi();
    }
}
