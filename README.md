# Android Blank Starter Project

Java 21 + Android (minSdk 24, targetSdk 34) + GitHub Actions APK Build

## প্রজেক্ট স্ট্রাকচার

```
android-starter/
├── .github/workflows/build.yml     ← GitHub Actions (APK বিল্ড)
├── app/
│   ├── build.gradle
│   ├── proguard-rules.pro
│   └── src/main/
│       ├── AndroidManifest.xml
│       ├── java/com/example/myapp/
│       │   └── MainActivity.java
│       └── res/
│           ├── layout/activity_main.xml
│           └── values/strings|colors|themes.xml
├── gradle/wrapper/
│   └── gradle-wrapper.properties
├── gradlew
├── build.gradle
├── settings.gradle
└── .gitignore
```

## ⚠️ প্রথমবার সেটআপ (gradle-wrapper.jar)

`gradle-wrapper.jar` বাইনারি ফাইল, Git এ রাখা যায় না সরাসরি।
Android Studio দিয়ে open করলে অটো তৈরি হয়। অথবা:

```bash
# Gradle ইনস্টল থাকলে:
gradle wrapper --gradle-version 8.4
```

## GitHub-এ পুশ করুন

```bash
git init
git add .
git commit -m "Initial Android project"
git remote add origin https://github.com/<username>/<repo>.git
git push -u origin main
```

## GitHub Actions এ কী হবে?

Push করলে অটোমেটিক:
1. Java 21 সেটআপ হবে
2. `./gradlew assembleDebug` → **debug APK** তৈরি হবে
3. `./gradlew assembleRelease` → **release APK** তৈরি হবে
4. দুটো APK Artifacts হিসেবে ডাউনলোড করা যাবে

## লোকালি বিল্ড

```bash
./gradlew assembleDebug
# APK পাবেন: app/build/outputs/apk/debug/app-debug.apk
```
