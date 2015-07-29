1. ./gradlew assemble
2. Run the project
3. Observe crash on call to `JniTestLib.test()` but not on `JniTest.test()`

You can unzip `testlib/build/outputs/aar/testlib-debug.aar`, observe no libtest.so present, but
that the build generated libtest.so as seen by its presence in
`testlib/build/intermediates/binaries/debug/lib/$ARCH`. Shouldn't it be in the AAR?

According to http://tools.android.com/tech-docs/new-build-system/gradle-experimental,
"There’s no support for NDK-only modules. The only supported project types are hybrid app projects
and hybrid Library Projects.", so I think library projects with JNI modules are supported.
(I'm not sure what an NDK-only module would be, maybe something based off of an older NDK project
based around .mk files?)
