package com.example

object Deps {
    object Main {
        object AndroidX {
            object Core {
                const val Main = "androidx.core:core:${Versions.Main.AndroidX.Core}"
                const val Ktx = "androidx.core:core-ktx:${Versions.Main.AndroidX.Core}"
            }
            object Lifecycle {
                const val Runtime = "androidx.lifecycle:lifecycle-runtime:${Versions.Main.AndroidX.Lifecycle}"
                const val RuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.Main.AndroidX.Lifecycle}"
            }
            object Activity {
                const val Compose = "androidx.activity:activity-compose:${Versions.Main.AndroidX.Activity}"
            }
            object Compose {
                const val Bom = "androidx.compose:compose-bom:${Versions.Main.AndroidX.Compose}"
                object UI {
                    const val Main = "androidx.compose.ui:ui"
                    const val Graphics = "androidx.compose.ui:ui-graphics"
                    const val ToolingPreview = "androidx.compose.ui:ui-tooling-preview"
                }
                object Material3 {
                    const val Material = "androidx.compose.material3:material3"
                }
            }
        }
    }
    object Test {
        const val Junit = "junit:junit:${Versions.Test.Junit}"
        object AndroidX {
            const val Junit = "androidx.test.ext:junit:${Versions.Test.AndroidX.Junit}"
            const val Espresso = "androidx.test.espresso:espresso-core:${Versions.Test.AndroidX.Espresso}"
            object Compose {
                object UI {
                    const val Junit = "androidx.compose.ui:ui-test-junit4"
                }
            }
        }
    }

    object Debug {
        object AndroidX {
            object Compose {
                object UI {
                    const val Tooling = "androidx.compose.ui:ui-tooling"
                    const val TestManifest = "androidx.compose.ui:ui-test-manifest"
                }
            }
        }
    }
}
