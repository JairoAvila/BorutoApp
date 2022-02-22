object AppDependencies {

    const val androidApplication = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val androidKotlin = "org.jetbrains.kotlin.android"

    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val lifecycleKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleKtx}"

    const val composeUI = "androidx.compose.ui:ui:${Versions.compose}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.compose}"
    const val composePreview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
    const val composeActivity = "androidx.activity:activity-compose:${Versions.activityCompose}"
    const val composeJunit = "androidx.compose.ui:ui-test-junit4:${Versions.compose}"
    const val composeTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"

    const val junit = "junit:junit:${Versions.junit}"
    const val junitTest = "androidx.test.ext:junit:${Versions.junitTest}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"

}