plugins {
    id(AppDependencies.androidApplication) version Versions.android apply false
    id(AppDependencies.androidLibrary) version Versions.android apply false
    id(AppDependencies.androidKotlin) version Versions.kotlin apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}