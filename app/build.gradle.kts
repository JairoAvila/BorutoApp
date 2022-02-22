plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
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

    implementation(AppDependencies.coreKtx)
    implementation(AppDependencies.lifecycleKtx)
    implementation(AppDependencies.composeUI)
    implementation(AppDependencies.composeMaterial)
    implementation(AppDependencies.composePreview)
    implementation(AppDependencies.composeActivity)
    testImplementation(AppDependencies.junit)
    androidTestImplementation(AppDependencies.junitTest)
    androidTestImplementation(AppDependencies.espresso)
    androidTestImplementation(AppDependencies.composeJunit)
    debugImplementation(AppDependencies.composeTooling)
}