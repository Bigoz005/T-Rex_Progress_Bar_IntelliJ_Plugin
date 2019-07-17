package com.github.bigoz005.trexprogressbar

import com.intellij.ide.ui.LafManager
import com.intellij.openapi.components.BaseComponent
import javax.swing.UIManager
import com.intellij.openapi.application.ApplicationManager

class TrexApp : BaseComponent {
    init {
        LafManager.getInstance().addLafManagerListener {
            updateProgressBarUi()
        }
    }

    companion object {
        fun getInstance(): TrexApp {
            return ApplicationManager.getApplication().getComponent(TrexApp::class.java)
        }
    }

    override fun initComponent() {
        updateProgressBarUi()
    }

    private fun updateProgressBarUi() {
        UIManager.put("ProgressBarUI", TrexProgressBarUiConnector::class.java.name)
        UIManager.getDefaults()[TrexProgressBarUiConnector::class.java.name] = TrexProgressBarUiConnector::class.java
    }

    override fun getComponentName(): String = "TrexLafUpdater"
}