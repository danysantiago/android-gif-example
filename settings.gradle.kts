pluginManagement {
  repositories {
    google()
    gradlePluginPortal()
    mavenCentral()
    maven(url  = "https://oss.sonatype.org/content/repositories/snapshots/")
  }
}

dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    google()
    gradlePluginPortal()
    mavenCentral()
    maven(url  = "https://oss.sonatype.org/content/repositories/snapshots/")
  }
}

plugins {
  id("com.gradle.enterprise") version "3.4.1"
}

gradleEnterprise {
  buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"
  }
}

rootProject.name = "android-gif-example"

include(":app")
include(":test-shared")
