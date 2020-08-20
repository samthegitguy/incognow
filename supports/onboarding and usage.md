# Basic compiling
## Compile with JDK if you insist

Make sure you run this in the root folder if you want to build yourself not the bin folder - we have moved the jar file to the bin folder after creating in the root.

``` shell
javac *.java
jar cmf manifest.txt program.jar *.class supports
```

## Run program with JRE


``` shell
java -jar program.jar 
```