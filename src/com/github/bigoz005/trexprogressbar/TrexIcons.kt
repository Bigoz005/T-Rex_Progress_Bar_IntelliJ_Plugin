package com.github.bigoz005.trexprogressbar

import com.intellij.openapi.util.IconLoader
import com.intellij.util.ui.JBUI
import java.awt.Color

val TREX_ICON by lazy(LazyThreadSafetyMode.NONE) { IconLoader.getIcon("/trexgif.gif") }
val TREXR_ICON by lazy(LazyThreadSafetyMode.NONE) { IconLoader.getIcon("/trexgif2.gif") }

val TREX_BG by lazy(LazyThreadSafetyMode.NONE) { IconLoader.getIcon("/bck.gif") }
val TREXR_BG by lazy(LazyThreadSafetyMode.NONE) { IconLoader.getIcon("/bckr.gif") }

val TREX_WIDTH by lazy(LazyThreadSafetyMode.NONE) { JBUI.scale(32) }

val TREX_BGCOLOR by lazy(LazyThreadSafetyMode.NONE) { Color(0xFFFFFF) }