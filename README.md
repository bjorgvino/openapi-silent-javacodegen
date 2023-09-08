# A silent Java OpenAPI Client Generator

## Overview
This is a workaround to silence the output of the built-in OpenAPI Generator `JavaClientCodegen` in CI pipelines. See https://github.com/OpenAPITools/openapi-generator/issues/11211.

## How do I use this?
You can run this:

```
mvn package
```

In your generator project. A single jar file will be produced in `target`. You can now use that with [OpenAPI Generator](https://openapi-generator.tech):

For mac/linux:
```
java -cp /path/to/openapi-generator-cli.jar:/path/to/your.jar org.openapitools.codegen.OpenAPIGenerator generate -g silent-java -i /path/to/openapi.yaml -o ./test
```
(Do not forget to replace the values `/path/to/openapi-generator-cli.jar`, `/path/to/your.jar` and `/path/to/openapi.yaml` in the previous command)

For Windows users, you will need to use `;` instead of `:` in the classpath, e.g.
```
java -cp /path/to/openapi-generator-cli.jar;/path/to/your.jar org.openapitools.codegen.OpenAPIGenerator generate -g silent-java -i /path/to/openapi.yaml -o ./test
```

## Maven

If you're using `Maven` and the `openapi-generator-maven-plugin` you can add this package as a plugin dependency, like so:

```
<pluginManagement>
  <plugin>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-generator-maven-plugin</artifactId>
    <version>${openapi-generator.version}</version>
    <configuration>
      ...
    </configuration>
    <dependencies>
      <dependency>
        <groupId>in.bjorgv.openapi.codegen</groupId>
        <artifactId>silent-java</artifactId>
        <version>1.0.0</version>
      </dependency>
    </dependencies>
  </plugin>
</pluginManagement>
```

And the build plugin, like so:

```
<build>
  <plugins>
    <plugin>
      <groupId>org.openapitools</groupId>
      <artifactId>openapi-generator-maven-plugin</artifactId>
      <configuration>
        <generatorName>silent-java</generatorName>
          ...
      </configuration>
      <executions>
        <execution>
          ...
        </execution>
      </executions>
    </plugin>
  </plugins>
</build>
```
