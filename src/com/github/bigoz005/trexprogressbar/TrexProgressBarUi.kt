package com.github.bigoz005.trexprogressbar

import com.intellij.util.ui.JBUI
import javax.swing.*
import javax.swing.plaf.basic.BasicProgressBarUI
import java.awt.*
import java.awt.Graphics2D
import java.awt.geom.RoundRectangle2D


class TrexProgressBarUi : BasicProgressBarUI() {
    override fun getPreferredSize(c: JComponent?): Dimension {
        return Dimension(100, 24)
    }

    private var trexX = 0
    private var trexY = 0
    private var velocity = 1

    private fun updateX(maxX: Int) {
        trexX += velocity
        if (trexX <= 0) {
            trexX = 0
            velocity = 1
        } else if (trexX >= maxX - TREX_WIDTH) {
            trexX = maxX - TREX_WIDTH
            velocity = -1
        }
    }

    private fun drawIcon(g2d: Graphics2D, c: JComponent) {
        val scaledIcon = if (velocity > 0) TREX_ICON else TREXR_ICON
        scaledIcon.paintIcon(c, g2d, trexX, trexY)
    }

    private fun drawBackground(g2d: Graphics2D, c: JComponent) {
        val scaledBck = if (velocity > 0) TREX_BG else TREXR_BG
        g2d.setColor(progressBar.getForeground());
        scaledBck.paintIcon(c, g2d, 0, 0)
    }

    override fun paint(g: Graphics, c: JComponent) {
        val g2d = g.create() as Graphics2D
        updateX(c.width)
        drawBackground(g2d, c)
        drawIcon(g2d, c)
    }
}