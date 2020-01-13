package com.yyz.buildsrc.plugin

import org.gradle.api.Project

/**
 * @author yyz (杨云召)
 * @date   2020/1/13
 * time   13:51
 * description
 * 公共插件
 */
internal fun Project.configurePlugins() {
    plugins.apply("kotlin-android")
    plugins.apply("kotlin-android-extensions")
}