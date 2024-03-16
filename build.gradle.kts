plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
    id("com.android.library") version "8.2.2" apply false
    id("io.gitlab.arturbosch.detekt") version("1.23.3")
}
detekt{
    toolVersion= "1.23.3"
    config = files("config/detekt/detekt.yml")
    buildUponDefaultConfig = true
}
dependencies {
    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.23.3")
}

buildscript {

    repositories {
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
        google()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.2")
        classpath("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.23.5")
    }
}

