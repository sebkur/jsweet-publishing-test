# What's this?

This project serves an example about how to upload custom JSweet candies to a
Maven repository using Gradle. It makes use of the
[JSweet Gradle plugin](https://github.com/lgrignon/jsweet-gradle-plugin).

Use this to upload the artifact to a local Maven repository located at `/tmp/maven-repo`:

    ./gradlew clean upload


Use this to build the JSweet output in `build/target/javascript`:

    ./gradlew jsweet

## Automatically use source dependencies

See the
[with-deps branch](https://github.com/sebkur/jsweet-publishing-test/tree/with-deps)
on this topic.
