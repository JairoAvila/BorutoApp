object AppDependencies {

    const val androidApplication = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val androidKotlin = "org.jetbrains.kotlin.android"
    //const val ksp = "com.google.devtools.ksp"
    const val kotlinSerializationPlugin = "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlinSerialization}"

    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val lifecycleKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleKtx}"
    const val material = "com.google.android.material:material:${Versions.material}"

    const val accompanistPager = "com.google.accompanist:accompanist-pager:${Versions.accompanist}"
    const val accompanistPagerIndicators = "com.google.accompanist:accompanist-pager-indicators:${Versions.accompanist}"

    const val composeUI = "androidx.compose.ui:ui:${Versions.compose}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.compose}"
    const val composePreview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
    const val composeActivity = "androidx.activity:activity-compose:${Versions.activityCompose}"
    const val composeJunit = "androidx.compose.ui:ui-test-junit4:${Versions.compose}"
    const val composeTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"

    const val navigation = "androidx.navigation:navigation-compose:${Versions.navigation}"

    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomPaging = "androidx.room:room-paging:${Versions.roomPaging}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"

    const val paging = "androidx.paging:paging-compose:${Versions.paging}"

    const val ktor = "io.ktor:ktor-client-android:${Versions.ktor}"
    const val ktorSerialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"
    const val kotlinSerialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.kotlinSerialization}"
    const val ktorLogging = "io.ktor:ktor-client-logging-jvm:${Versions.ktor}"

    const val dataStore = "androidx.datastore:datastore-preferences:${Versions.dataStore}"

    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:${Versions.hilt}"
    const val hiltCompose = "androidx.hilt:hilt-navigation-compose:${Versions.hiltCompose}"
    const val hiltGradle = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"

    const val coil = "io.coil-kt:coil-compose:${Versions.coil}"

    const val junit = "junit:junit:${Versions.junit}"
    const val junitTest = "androidx.test.ext:junit:${Versions.junitTest}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"

}