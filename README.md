# What's this?

This project serves an example about how to upload custom JSweet candies to a
Maven repository using Gradle. It makes use of the
[JSweet Gradle plugin](https://github.com/lgrignon/jsweet-gradle-plugin).

Use this to upload the artifact to a local Maven repository located at `/tmp/maven-repo`:

    ./gradlew clean upload


Use this to build the JSweet output in `build/target/javascript`:

    ./gradlew jsweet

## Automatically use source dependencies

In contrast to the master branch, this branch includes a dependency on
`de.topobyte:viewports-core:0.0.2`. It would be very useful if the plugin would
download the respective source jar, extract it to a temporary directory in the
build directory and add it as a source set so that the build succeeds.
