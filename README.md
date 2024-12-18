# ErrorProne Java Project

This project demonstrates the integration of [Error Prone](https://errorprone.info/), a static analysis tool for Java that catches common programming mistakes at compile-time.

## Prerequisites

Ensure you have the following installed on your system:

- [Java Development Kit (JDK) 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Apache Maven 3.8.0 or higher](https://maven.apache.org/download.cgi)

## Setup

1. **Clone the repository:**

   ```bash
   git clone https://github.com/yourusername/errorProne.git
   cd errorProne
   ```

2. **Build the project:**

   ```bash
   mvn clean install
   ```

   This command compiles the project and runs Error Prone checks. If any issues are detected, the build will fail, and the errors will be displayed in the console output.

## Running the Application

After a successful build, you can run the application using:

```bash
java -cp target/errorProne-1.0-SNAPSHOT.jar org.example.Main
```

Replace `org.example.Main` with the fully qualified name of your main class.

## Testing the Application

To execute the tests:

```bash
mvn test
```

This command runs the test suite. Error Prone checks are also applied during the compilation of test sources.

## Error Prone Configuration

Error Prone is configured in the `pom.xml` file within the `maven-compiler-plugin` section:

```xml
<build>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-compiler-plugin</artifactId>
      <version>3.11.0</version>
      <configuration>
        <source>17</source>
        <target>17</target>
        <encoding>UTF-8</encoding>
        <compilerArgs>
          <!-- Enable Error Prone -->
          <arg>-Xplugin:ErrorProne</arg>
          <!-- Treat all warnings as errors -->
          <arg>-Werror</arg>
        </compilerArgs>
        <annotationProcessorPaths>
          <path>
            <groupId>com.google.errorprone</groupId>
            <artifactId>error_prone_core</artifactId>
            <version>2.36.0</version>
          </path>
        </annotationProcessorPaths>
      </configuration>
    </plugin>
  </plugins>
</build>
```

This configuration enables Error Prone during compilation and treats all warnings as errors, ensuring code quality.

## Customizing Error Prone

You can customize Error Prone's behavior by adding specific compiler arguments in the `compilerArgs` section. For example, to disable a particular check:

```xml
<arg>-Xep:CheckName:OFF</arg>
```

Replace `CheckName` with the name of the check you wish to disable. For a comprehensive list of available checks and configuration options, refer to the [Error Prone documentation](https://errorprone.info/docs/installation).

## Additional Resources

- [Error Prone GitHub Repository](https://github.com/google/error-prone)
- [Error Prone Bug Patterns](https://errorprone.info/bugpatterns)

By following this setup, you ensure that your Java project is analyzed by Error Prone during the build process, helping to catch common mistakes early and maintain high code quality. 