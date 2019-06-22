[ ![Download](https://api.bintray.com/packages/sokolyaka/maven/androidsizes/images/download.svg) ](https://bintray.com/sokolyaka/maven/androidsizes/_latestVersion)
# Android Sizes
Set of utilities to work with the Size abstraction in Android.

# How to use?
Get Screen width and height
```java
ISize size = new SizeFromDisplay(getWindowManager().getDefaultDisplay());
size.width();
size.height();
```
Get video width and height
```java
ISize size = new SizeFromVideoFile(videoFilePath);
size.width();
size.height();
```
Get image file width and height
```java
ISize size = new SizeFromImage(imgFilePath);
size.width();
size.height();
```
# How to set-up?
```gradle
repositories {
    jcenter()
}
```

```gradle
dependencies {
    compile 'com.github.sokolyaka:androidsizes:1.0.4'
}
```
