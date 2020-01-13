package com.yyz.buildsrc.plugin

import com.android.build.gradle.api.AndroidBasePlugin
import org.gradle.api.Project

/**
 * @author yyz (杨云召)
 * @date   2020/1/13
 * time   13:45
 * description
 * 公共依赖
 */

const val jUnit = "junit:junit:4.12"
const val androidTestRunner = "com.android.support.test:runner:1.0.2"
const val androidTestRules = "com.android.support.test:rules:1.0.2"
const val espressoCore = "com.android.support.test.espresso:espresso-core:3.0.2"

internal fun Project.configureDependencies() = dependencies.apply {
    add("implementation", (fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar")))))
    add("testImplementation", jUnit)

    if (project.containsAndroidPlugin()) {
        add("androidTestImplementation", androidTestRunner)
        add("androidTestImplementation", androidTestRules)
        add("androidTestImplementation", espressoCore)
    }
}

internal fun Project.containsAndroidPlugin(): Boolean {
    return project.plugins.toList().any { plugin -> plugin is AndroidBasePlugin }
}