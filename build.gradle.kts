// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        jcenter()
        google()
        maven("https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath(BuildPlugins.TOOLS_BUILD_GRADLE)
        classpath(BuildPlugins.SAFE_ARGS_GRADLE_PLUGIN)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.30")
        classpath(kotlin("serialization", version = Lib.Kotlin.KOTLIN_VERSION))
        classpath(BuildPlugins.KTLINT_GRADLE_PLUGIN)
        classpath(BuildPlugins.GOOGLE_SERVICE)
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}


tasks.register("clean")
    .configure {
        delete(rootProject.buildDir)
    }
