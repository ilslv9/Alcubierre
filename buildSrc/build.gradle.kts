plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(libs.gradle.android.tools)
    implementation(libs.gradle.kotlin)
    implementation(libs.gradle.ksp)
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}