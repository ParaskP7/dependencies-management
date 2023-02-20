import com.example.Deps

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_11)
        targetCompatibility(JavaVersion.VERSION_11)
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.2"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(Deps.Main.AndroidX.Core.Main)
    implementation(Deps.Main.AndroidX.Core.Ktx)
    implementation(Deps.Main.AndroidX.Lifecycle.RuntimeKtx)
    implementation(Deps.Main.AndroidX.Activity.Compose)
    implementation(Deps.Main.AndroidX.Lifecycle.Runtime)
    implementation(platform(Deps.Main.AndroidX.Compose.Bom))
    implementation(Deps.Main.AndroidX.Compose.UI.Main)
    implementation(Deps.Main.AndroidX.Compose.UI.Graphics)
    implementation(Deps.Main.AndroidX.Compose.UI.ToolingPreview)
    implementation(Deps.Main.AndroidX.Compose.Material3.Material)
    testImplementation(Deps.Test.Junit)
    androidTestImplementation(Deps.Test.AndroidX.Junit)
    androidTestImplementation(Deps.Test.AndroidX.Espresso)
    androidTestImplementation(platform(Deps.Main.AndroidX.Compose.Bom))
    androidTestImplementation(Deps.Test.AndroidX.Compose.UI.Junit)
    debugImplementation(Deps.Debug.AndroidX.Compose.UI.Tooling)
    debugImplementation(Deps.Debug.AndroidX.Compose.UI.TestManifest)
}
