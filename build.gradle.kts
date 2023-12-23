// Top-level build file where you can add configuration options common to all sub-projects/modules.
@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
//    # == id 'kotlin-kapt'
//    https://developer.android.com/build/migrate-to-kotlin-dsl#find-plugin-id
    alias(libs.plugins.jetbrainsKotlinKapt) apply false
}
true // Needed to make the Suppress annotation work for the plugins block