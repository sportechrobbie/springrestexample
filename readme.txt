Requirements for building

Java 1.6 or above
Maven 3+


Build for Executable JAR
-------------------------

From the command line at the root of the project folder, run the following command

>>mvn clean package

The above will create an executable JAR in the target/ folder this can then be executed using the following command

>>java -jar target/[jar filename]