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
//def githubProperties = new Properties() githubProperties.load(new FileInputStream(rootProject.file('github.properties')))
repositories {
    maven {
        url "https://maven.pkg.github.com/sokolyaka/sizes"
        credentials {
            /** Create github.properties in root project folder file with
             ** gpr.usr=GITHUB_USER_ID & gpr.key=PERSONAL_ACCESS_TOKEN
             ** Or set env variable GPR_USER & GPR_API_KEY if not adding a properties file
             * {@link https://proandroiddev.com/publishing-android-libraries-to-the-github-package-registry-part-1-7997be54ea5a}**/

            username = System.getenv("GPR_USER") /*?: githubProperties['gpr.usr']*/
            password = System.getenv("GPR_API_KEY") /*?: githubProperties['gpr.key']*/
        }
    }
}
```

```gradle
dependencies {
    implementation 'com.github.sokolyaka:androidsizes:1.0.5'
}
```
