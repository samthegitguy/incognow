For information on how to behave and react in this repo see COLLABORATION.md

Ensure you always comment objects you create using /** */ javadoc comments and add your name to the CODEOWNERS file 
# Dependencies
+ JDK
# Before commiting
1. `javac *.java`
2. `java %Main class name%`
3. Remove all class files

Ensure the program works
# On release
1. Create classes `javac src/*.java -d bin`
1. Create documentation `javadoc *.java -d docs`
2. Create jar
Make sure you run this in the src folder if you want to build yourself not the bin folder - we have moved the jar file to the bin folder after creating in the src.
` jar cmf manifest.txt program.jar bin/*.class docs assets `
3. Move jar to bin
4. Commit `git add * && git commit -m "Update bin and docs files for release"`
3. Create release on Github
Final code
```
javac src/*.java -d bin
javadoc src/*.java -d docs
cd bin
jar cmf ../manifest.txt program.jar *.class ../docs ../assets
git add * && git commit -m 'Update bin and docs files for release'
# Create release on github or use git tag. Attach jar and classes.
```

## Extract jar because you want to read documentation
``` shell
# Do this only in bin
cd bin
# Extract
jar xvf program.jar
```
