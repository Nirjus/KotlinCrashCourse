// Add this import at the very top of your build.gradle.kts file
import org.gradle.api.tasks.testing.Test
plugins {
    kotlin("jvm") version "1.9.22"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3") // Use the latest stable version
    testImplementation(kotlin("test"))

}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}