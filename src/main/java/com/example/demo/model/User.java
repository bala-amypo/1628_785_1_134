coder@3ade3b4d83a2:~/Workspace$ cd demo
coder@3ade3b4d83a2:~/Workspace/demo$ mvn clean install
[INFO] Scanning for projects...
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for com.example:demo:jar:0.0.1-SNAPSHOT
[WARNING] 'dependencies.dependency.(groupId:artifactId:type:classifier)' must be unique: org.springframework.boot:spring-boot-starter-security:jar -> duplicate declaration of version (?) @ line 94, column 15
[WARNING] 
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING] 
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING] 
[INFO] 
[INFO] --------------------------< com.example:demo >--------------------------
[INFO] Building demo 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:3.3.2:clean (default-clean) @ demo ---
[INFO] Deleting /home/coder/Workspace/demo/target
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ demo ---
[INFO] Copying 1 resource from src/main/resources to target/classes
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.11.0:compile (default-compile) @ demo ---
[INFO] Changes detected - recompiling the module! :source
[INFO] Compiling 42 source files with javac [debug release 17] to target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/repository/UserRepository.java:[3,30] cannot find symbol
  symbol:   class User
  location: package com.example.demo.model
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/repository/UserRepository.java:[6,55] cannot find symbol
  symbol: class User
[INFO] 2 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  14.694 s
[INFO] Finished at: 2025-12-25T17:53:54Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.11.0:compile (default-compile) on project demo: Compilation failure: Compilation failure: 
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/repository/UserRepository.java:[3,30] cannot find symbol
[ERROR]   symbol:   class User
[ERROR]   location: package com.example.demo.model
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/repository/UserRepository.java:[6,55] cannot find symbol
[ERROR]   symbol: class User
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
coder@3ade3b4d83a2:~/Workspace/demo$ 