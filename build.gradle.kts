import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    kotlin("jvm") version "1.3.31"
    id("com.github.johnrengelman.shadow") version "5.0.0"
    id("org.jetbrains.dokka") version "0.9.17"
    id("net.minecrell.plugin-yml.nukkit") version "0.3.0"
}

group = "com.uramnoil"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("https://repo.nukkitx.com/main/")
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    compileOnly("cn.nukkit:nukkit:1.0-SNAPSHOT")
    testCompileOnly("cn.nukkit:nukkit:1.0-SNAPSHOT")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.3.2")
    testImplementation("org.junit.platform:junit-platform-launcher:1.3.2")
}

nukkit {
    main = "com.uramnoil.Economy4Nukkit"
    api = listOf("1.0")
    author = "UramnOIL"
}

defaultTasks = mutableListOf("shadowJar")

tasks.dokka {
    outputFormat = "html"
    outputDirectory = "$buildDir/javadoc"
}

tasks.shadowJar {

}