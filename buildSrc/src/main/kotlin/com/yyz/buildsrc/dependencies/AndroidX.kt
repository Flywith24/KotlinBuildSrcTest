package com.yyz.buildsrc.dependencies

/**
 * @author yyz (杨云召)
 * @date   2020/1/13
 * time   14:09
 * description
 */
@Suppress("SpellCheckingInspection")
object AndroidX {
    const val appcompat = "androidx.appcompat:appcompat:1.1.0"
    const val coreKtx = "androidx.core:core-ktx:1.1.0"
    const val constraintlayout = "androidx.constraintlayout:constraintlayout:1.1.3"

    val lifecycle = Lifecycle

    object Lifecycle {
        private const val lifecycle_version = "2.1.0"
        const val extensions = "androidx.lifecycle:lifecycle-extensions:$lifecycle_version"
        const val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
        const val commonJava8 = "androidx.lifecycle:lifecycle-common-java8:$lifecycle_version"
    }

    val navigation = Navigation

    object Navigation {
        private const val navigation_version = "2.1.0"
        const val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:$navigation_version"
        const val uiKtx = "androidx.navigation:navigation-ui-ktx:$navigation_version"
    }

    val room = Room

    object Room {
        private const val room_version = "2.2.3"
        const val roomRuntime = "androidx.room:room-runtime:$room_version"
        const val roomCompiler = "androidx.room:room-compiler:$room_version"
        const val roomKtx = "androidx.room:room-ktx:$room_version"
    }
}