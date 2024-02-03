
pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

includeBuild("sub-sub-project")

includeBuild("sub-project1") {
    dependencySubstitution {
        //substitute(module("sub-sub-project:ModuleX")).using(project(":sub-sub-project"))
    }
}

includeBuild("sub-project2") {
    dependencySubstitution {
        //substitute(module("sub-sub-project:ModuleX")).using(project(":sub-sub-project"))
    }
}

include(":ModuleA")

