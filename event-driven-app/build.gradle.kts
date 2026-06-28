plugins {
    id("java")
}

group = "org.acme"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.testcontainers:testcontainers-postgresql:2.0.5")

}

tasks.test {
    useJUnitPlatform()
}