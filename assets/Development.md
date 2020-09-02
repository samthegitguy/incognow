# Dependencies for development
+ JDK
    + and with it JRE
# I have JDK
## I want to contribute / I am suspicous and I want to build from source
### Compiling induvidual classes
` javac *.java `
### Compiling to jar once it's all done
Make sure you run this in the root folder if you want to build yourself not the bin folder - we have moved the jar file to the bin folder after creating in the root.
` jar cmf manifest.txt program.jar *.class docs assets `
## Extract jar just coz your suspicous
``` shell
# Do this only in bin
cd bin
# Extract
jar xvf program.jar
```