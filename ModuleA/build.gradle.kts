
plugins {
    kotlin("jvm") version "1.9.22"
}

dependencies {
    api("sub-project1:ModuleB")
    api("sub-project2:ModuleC")
}

