# Android Sizes
Set of utilities to work with the Size abstraction in Android.

# How to use?
Get Screen width and height
```java
ISize size = new SizeFromDisplay(getWindowManager().getDefaultDisplay());
size.width();
size.hight();
```
Get video width and height
```java
ISize size = new SizeFromVideoFile(videoFilePath);
size.width();
size.hight();
```
Get image file width and height
```java
ISize size = new SizeFromImage(imgFilePath);
size.width();
size.hight();
```
# How to set-up?
```gradle
repositories {
    jcenter()
}
```

```gradle
dependencies {
    compile 'com.github.sokolyaka:androidsizes:1.0.2'
}
```
