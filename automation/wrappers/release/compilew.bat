echo off
echo Please ensure you have git and JDK installed. This script depends on them.
echo This script is for creating the java file. If you wish to run the code please come back later.
echo There is no production version for this program yet.
pause
javac src/*.java -d bin/classes -cp bin/libs
javadoc src/*.java -d docs
jar vcmf MANIFEST.MF passwordmanagerone.jar -C bin/classes . -C docs . -C assets .
move passwordmanagerone.jar bin/jar -cp bin/libs
git add bin && git commit -m "Update bin and docs files for release"
echo on
