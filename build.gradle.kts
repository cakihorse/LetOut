plugins {
    id("java")
}

group = "fr.cakihorse"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation ("org.swinglabs:swingx:1.6.1")


}

tasks.test {
    useJUnitPlatform()
}