# java-read-calendars

This sample will show you to read your calendars Nylas Java SDK.

### System dependencies

- Java 18.0.2
- Maven 3.8.6

### Gather environment variables

You'll need the following values:

```text
V3_TOKEN = ""
NYLAS_API_SERVER = ""
CALENDAR_ID = ""
```

Add the above values to a new `.env` file:

```bash
$ touch .env # Then add your env variables
```

### Install dependencies

```bash
org.slf4j / slf4j-simple / 1.7.25
com.nylas.java / nylas_java / 2.0.0
io.github.cdimascio / dotenv-java / 2.3.2
```

# Compilation

To compile the comment we need to use this `maven` command:

```bash
mvn clean compile
```

## Usage

Run the application using the `maven` command:

```bash
$ mvn exec:java -Dexec.mainClass="read_calendars"
```

If successful, your calendars will be displayed.
