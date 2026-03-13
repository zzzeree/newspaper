plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

println("configuration.phase")
println("Gradle: ${gradle.hashCode()}, project: ${gradle.hashCode()}, rootProject: ${gradle.hashCode()}")


tasks.register ("hello") {
    description = "Hello World"
    group = "examples"
}
dependencies{
    implementation("org.jsoup:jsoup:1.17.2")
}