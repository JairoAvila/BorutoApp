plugins {
    id(AppDependencies.androidApplication)
    id(AppDependencies.androidKotlin)
    id("kotlinx-serialization")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "com.jairoavila.borutoapp"
        minSdk = 22
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    // Support Libraries
    implementation(AppDependencies.coreKtx)
    implementation(AppDependencies.lifecycleKtx)
    implementation(AppDependencies.material)

    // Jetpack Compose
    implementation(AppDependencies.composeUI)
    implementation(AppDependencies.composeMaterial)
    implementation(AppDependencies.composePreview)
    implementation(AppDependencies.composeActivity)
    implementation(AppDependencies.navigation)
    debugImplementation(AppDependencies.composeTooling)

    // Room
    implementation(AppDependencies.roomRuntime)
    implementation(AppDependencies.roomPaging)
    kapt(AppDependencies.roomCompiler)
    implementation(AppDependencies.roomKtx)

    // Paging
    implementation(AppDependencies.paging)

    // Ktor
    implementation(AppDependencies.ktor)
    implementation(AppDependencies.ktorSerialization)
    implementation(AppDependencies.kotlinSerialization)
    implementation(AppDependencies.ktorLogging)

    // Data Store
    implementation(AppDependencies.dataStore)

    // Hilt
    implementation(AppDependencies.hilt)
    kapt(AppDependencies.hiltCompiler)
    implementation(AppDependencies.hiltCompose)

    // Coil
    implementation(AppDependencies.coil)

    // Pager
    implementation(AppDependencies.accompanistPager)
    implementation(AppDependencies.accompanistPagerIndicators)

    // Swipe
    implementation(AppDependencies.accompanistSwiperRefresh)

    // Test Libraries
    testImplementation(AppDependencies.junit)
    androidTestImplementation(AppDependencies.junitTest)
    androidTestImplementation(AppDependencies.espresso)
    androidTestImplementation(AppDependencies.composeJunit)
}