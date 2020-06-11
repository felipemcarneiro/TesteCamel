# console-java-simple

A simple java "Hello World!" application, buildable with both maven and gradle. Useful for testing Eclipse Che Java workspaces.


# Building manually

|        | Task  | Command                    |
| ------ | ----- | -------------------------- |
| Maven  | Build | `mvn clean install`        |
|        | Run   | `java -jar ./target/*.jar` |
| Gradle | Build | `gradle build`             |
|        | Run   | `gradle run`               |


# App output

App output is streamed into a console. Note that if your app expects user input, do not use command but execute jars in the terminal directly.


# comando pra guardar:

mvn dependency:resolve

mvn clean install -U

mvn eclipse:eclipse

mvn exec:java -e -D exec.mainClass="org.eclipse.che.examples.HelloWorld"

# pra mandar
git remote set-url origin https://github.com/felipemcarneiro/TesteCamel.git
git commit -a -m 'Inicializacao'
git push -u origin dev

# pra receber
git fetch
git checkout dev