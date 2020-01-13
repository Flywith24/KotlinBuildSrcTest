plugins {
    id("com.android.application")
    id("com.test.plugin")
}

dependencies {
    implementation(com.yyz.buildsrc.dependencies.Kotlin.stdlibJdk7)
    implementation(com.yyz.buildsrc.dependencies.AndroidX.appcompat)
    implementation(com.yyz.buildsrc.dependencies.AndroidX.coreKtx)
    implementation(com.yyz.buildsrc.dependencies.AndroidX.constraintlayout)
}
