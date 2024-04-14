plugins {
    id("java")
}

group = "com.teachmeskills.lesson21.hw.task1_1"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("com.teachmeskills.lesson21.hw.task1", "TeachMeSkills_C27_Lesson_21_HW", "1.0")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}