package com.yyz.buildsrc.plugin

import com.android.build.gradle.BaseExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

/**
 * @author yyz(杨云召)
 * @date   2020/1/13
 * time   13:52
 * description
 * android{} 配置
 */
private typealias AndroidBaseExtension = BaseExtension

internal fun Project.configureAndroid() = this.extensions.getByType<AndroidBaseExtension>().run {
    compileSdkVersion(28)
    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(28)
        versionCode = 2
        versionName = "1.0.1"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }

        getByName("debug") {
            isTestCoverageEnabled = true
        }
    }

    packagingOptions {
        exclude("META-INF/NOTICE.txt")
        // ...
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}