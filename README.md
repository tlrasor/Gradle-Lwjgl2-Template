# Gradle LWJGL(Lightweight Java Game Library) Template

A gradle project template to help set up LWJGL2 applications using Gradle.
Provides a standard gradle template using cjstehno's gradle-natives plugin (https://github.com/cjstehno/gradle-natives/).

## Installation
Clone this repository into your new project's directory
```bash
git clone https://github.com/tlrasor/Gradle-Lwjgl2-Template.git yourProjectDirectory
```
Edit build.gradle for your group, version, and author details
```groovy
group = 'org.thathanka'
version = '0.1.1'

ext {
    authorName = "Travis Rasor"
    authorEmail = "travis@thathanka.org"
```

Edit settings.gradle with your project's name
```groovy
rootProject.name = yourProjectName
```

## Usage
The gradle natives plugin needs to be unpacked before tests can be run using:
```
gradle clean unpackNatives -x test
```
Then the project can be built and tested using:
```
gradle test
```
The project comes with a test that asserts an LWJGL Display can be created its environment.