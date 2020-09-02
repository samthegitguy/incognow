For information on how to behave and react in this repo see COLLABORATION.md

Ensure you always comment objects you create using /** */ javadoc comments and add your name to the CODEOWNERS file 
# Dependencies
+ JDK
# Before commiting
1. `javac *.java`
2. `java %Main class name`
3. Remove all class files

Ensure the program works
# On release
1. Create documentation `javadoc *.java -d docs`
2. Create jar
Make sure you run this in the root folder if you want to build yourself not the bin folder - we have moved the jar file to the bin folder after creating in the root.
` jar cmf manifest.txt program.jar *.class docs assets `
3. Move all binary / byte code files to bin
4. Commit `git commit -m "Update bin and docs files for release"`
3. Create release on Github


## Extract jar just coz your suspicous or you want to read documentation
``` shell
# Do this only in bin
cd bin
# Extract
jar xvf program.jar
```
