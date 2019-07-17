package com.github.bigoz005.trexprogressbar

import com.intellij.openapi.util.IconLoader
import com.intellij.util.ui.JBUI
import java.awt.Color

val TREX_ICON by lazy(LazyThreadSafetyMode.NONE) { IconLoader.getIcon("/trex.png") }
val TREXR_ICON by lazy(LazyThreadSafetyMode.NONE) { IconLoader.getIcon("/trex2.png") }

val TREX_WIDTH by lazy(LazyThreadSafetyMode.NONE) { JBUI.scale(32) }

val TREX_COLOR by lazy(LazyThreadSafetyMode.NONE) { Color(0xFFF176) }