# Ethereal-Odyssey-Game
Ethereal Odyssey is a captivating mobile game that immerses players in a visually stunning and mystical world. Developed for Android, it invites players to embark on a serene journey through a vast, beautifully crafted landscape.

Youtube Channal link: https://youtu.be/F-uKzMLK46c

![How it works (18)](https://github.com/ARIBFIB/Ethereal-Odyssey-Game/assets/125716994/614609f2-c11a-42e7-bfeb-89d3a122e10e)

Other Screen Shots



![IMG-20240510-WA0012(1)](https://github.com/ARIBFIB/Ethereal-Odyssey-Game/assets/125716994/a9c39a8c-04b1-45d0-b568-3758d6f999b9) 
![object](https://github.com/ARIBFIB/Ethereal-Odyssey-Game/assets/125716994/83f472e7-cf3a-439b-b7f4-a5a1e1d32874) 
![map](https://github.com/ARIBFIB/Ethereal-Odyssey-Game/assets/125716994/5f7f5d40-a42b-49a5-8041-e055d3f74363) 
![maps](https://github.com/ARIBFIB/Ethereal-Odyssey-Game/assets/125716994/7e4df4a4-3e48-4069-b265-2c3c29375e92) 
![Screenshot_20240608-174801](https://github.com/ARIBFIB/Ethereal-Odyssey-Game/assets/125716994/0989511c-4d59-4fd9-a387-c8b68f79db3a) 
![Screenshot_20240608-174735](https://github.com/ARIBFIB/Ethereal-Odyssey-Game/assets/125716994/146233c2-ca39-4fed-833b-c7d4e0c91b95) 
![Screenshot_20240608-174813](https://github.com/ARIBFIB/Ethereal-Odyssey-Game/assets/125716994/63d3db19-a9b1-4551-97f0-b144c592ca11)

# Ethereal Odyssey Game

## Game Description

Ethereal Odyssey is a captivating mobile game that immerses players in a visually stunning and mystical world. Developed using the Android platform, this game invites players to embark on a serene and enchanting journey through a vast, beautifully crafted landscape.

## Key Features

### Serene Exploration
Players can freely explore the game's expansive map, discovering hidden pathways, scenic vistas, and enchanting encounters along the way. The game's tranquil atmosphere encourages a sense of wonder and relaxation as players navigate through the ethereal landscape.

### Immersive Visuals
The game features a stunning visual design, with detailed and imaginative environments that seamlessly blend fantasy and realism. The use of vibrant colors, intricate textures, and atmospheric lighting creates a captivating and immersive experience for the player.

### Intuitive Controls
Ethereal Odyssey's controls are designed to be intuitive and user-friendly, allowing players to seamlessly navigate the game world and interact with various elements. The responsive touch-based interface ensures a smooth and enjoyable gameplay experience.

### Calming Soundtrack
The game's soundtrack is composed of soothing and melodic tunes that perfectly complement the serene and contemplative atmosphere of the game. The musical score helps to create a calming and meditative experience for the player.

## Gameplay Mechanics

At the heart of Ethereal Odyssey is the player's ability to explore the game's expansive world. By tapping on the screen, players can guide their character through the landscape, uncovering new areas and encountering various interactive elements.

The game features a minimalist user interface, allowing the player to focus on the beauty of the environment without distractions. Occasional interactive elements, such as puzzles or hidden collectibles, provide subtle challenges that enhance the overall exploration experience.

## Conclusion

Ethereal Odyssey offers a unique and captivating mobile gaming experience, blending serene exploration, stunning visuals, and a calming soundtrack to create a truly immersive and meditative journey. Whether players are seeking a moment of tranquility or an enchanting adventure, Ethereal Odyssey provides a serene and enchanting gaming experience that is sure to leave a lasting impression.

**# Gradle**
#settings.gradle.kts
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

# build.gradle.kts

plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.etherealodysseygame"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.etherealodysseygame"
        minSdk = 30
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}

# build.gradle.kts

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
}
