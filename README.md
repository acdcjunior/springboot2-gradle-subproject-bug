Module `sb-aaa` depends on `sb-bbb`, but the addition of 

    apply plugin: 'org.springframework.boot'

to `sb-bbb`'s [`build.gradle`](sb-bbb/build.gradle#L1) makes the dependency stop working.


    $ gradlew clean build
    
    > Task :sb-aaa:compileJava FAILED
    ...\sb-aaa\src\main\java\sb\bug\aaa\ClassAAA.java:3: error: package sb.bug.bbb does not exist
    import sb.bug.bbb.ClassBBB;
                     ^
    ...\sb-aaa\src\main\java\sb\bug\aaa\ClassAAA.java:7: error: cannot find symbol
        public ClassAAA(ClassBBB c) {
                        ^
      symbol:   class ClassBBB
      location: class ClassAAA
    2 errors
    
    
    FAILURE: Build failed with an exception.
    
    * What went wrong:
    Execution failed for task ':sb-aaa:compileJava'.
    > Compilation failed; see the compiler error output for details.
    
    * Try:
    Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output.
    
    * Get more help at https://help.gradle.org
    
    BUILD FAILED in 2s
    4 actionable tasks: 4 executed

