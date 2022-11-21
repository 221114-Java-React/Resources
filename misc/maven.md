# Maven

<br>

**Apache Maven** is a cornerstone of Java development, and the most used build management tool for Java. Maven's
streamlined, XML-based configuration model enables developers to rapidly describe or grasp the outlines of any
Java-based project, which makes starting and sharing new projects a snap.

## How Maven works

Like many great tools, Maven takes what was once overcomplicated (configuration hell) and simplifies it to digestible
parts. Maven consists of three components:

- The POM: The file that describes a Maven project and its dependencies.
- The directory: The standardized format for describing a Maven project in the POM.
- Repositories: Where third-party software is stored and discovered.

## The Maven POM

- The root of every Maven project is the pom.xml file.
- Maven's POM is easy to read and reveals much of what's going on in a project.

### Example: Simple Maven POM

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>Maven</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>8</maven.compiler.source>
        <maven.compiler.target>8</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
</project>
```

## Understanding the Maven POM

Once you get the hang of it, the POM is not mysterious.

**Note:** XML namespaces are used for providing uniquely named elements and attributes in an XML document.

- Inside the `<project>` tage you have
    - **groupId:** uniquely identifies your project across all projects. A group ID should follow Java's package name
      rules. For example, `com.revature`
    - **artifactId:** is the name of the jar without version. If you created it, then you can choose whatever name you
      want with lowercase letters and no strange symbols. If it's a third party jar, you have to take the name of the
      jar as it's distributed.
    - **version:** if you distribute it, then you can choose any typical version with numbers and dots (1.0, 1.1, 1.0.1,
      ...). Don't use dates as they are usually associated with SNAPSHOT (nightly) builds.


- Together, these three attributes uniquely identify every Maven-managed resource in the repository
- These attributes at the top of the file describe your Maven project.


- **Dependencies:** In this case we've pulled in just one dependency so far, JUnit. Notice that JUnit is also described
  in
  terms of its groupId, artifactId, and version.