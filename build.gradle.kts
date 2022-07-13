plugins {
    id("com.android.application") version "7.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.6.21" apply false
}

val clean by tasks.creating(Delete::class) {
    delete = setOf(rootProject.buildDir)
}