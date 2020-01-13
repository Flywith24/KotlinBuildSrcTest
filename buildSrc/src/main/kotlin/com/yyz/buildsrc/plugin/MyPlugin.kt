package com.yyz.buildsrc.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @author yyz (杨云召)
 * @date   2020/1/13
 * time   11:59
 * description
 */
class MyPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.configurePlugins()
        project.configureAndroid()
        project.configureDependencies()
    }
}