plugins {
    id("java")
    id ("idea")
    id ("com.github.johnrengelman.shadow") version "+"
    id ("application")
    id ("org.openjfx.javafxplugin") version "+"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
javafx {
    version = "21"
    modules("javafx.controls", "javafx.fxml")
}
