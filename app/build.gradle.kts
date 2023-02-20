import com.example.Versions

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
    implementation("androidx.core:core:${Versions.Main.AndroidX.Core}")
    implementation("androidx.core:core-ktx:${Versions.Main.AndroidX.Core}")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:${Versions.Main.AndroidX.Lifecycle}")
    implementation("androidx.activity:activity-compose:${Versions.Main.AndroidX.Activity}")
    implementation("androidx.lifecycle:lifecycle-runtime:${Versions.Main.AndroidX.Lifecycle}")
    implementation(platform("androidx.compose:compose-bom:${Versions.Main.AndroidX.Compose}"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:${Versions.Test.Junit}")
    androidTestImplementation("androidx.test.ext:junit:${Versions.Test.AndroidX.Junit}")
    androidTestImplementation("androidx.test.espresso:espresso-core:${Versions.Test.AndroidX.Espresso}")
    androidTestImplementation(platform("androidx.compose:compose-bom:${Versions.Main.AndroidX.Compose}"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}
