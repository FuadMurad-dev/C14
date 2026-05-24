# C14

## Project Overview

This Java project converts a list of video games into JSON format and saves the result to a file named `games.json`.

The application initializes a predefined set of games, including their name, music, difficulty, Metascore, and release year. It then serializes the list into pretty-printed JSON using Gson.

## Features

- Initializes a small collection of games
- Uses Lombok to simplify the `Game` model with builder support
- Converts game objects to JSON using `Gson`
- Writes formatted JSON output to `games.json`

## Technologies

- Java 22
- Maven
- Lombok
- Gson
- JUnit 4 (for tests)

## Project Structure

- `src/main/java/Main.java` - application entry point
- `src/main/java/information/Game.java` - game data model
- `src/main/java/json/JsonService.java` - JSON conversion and file save logic
- `src/test/java/` - unit tests for game functionality
- `pom.xml` - Maven project configuration

## How to Run

1. Open the project in your IDE or terminal.
2. Build the project:
   ```bash
   mvn clean compile
   ```
3. Run the application:
   ```bash
   mvn exec:java -Dexec.mainClass=Main
   ```

> Note: If the Maven Exec plugin is not configured in the current `pom.xml`, you may run the compiled classes directly from your IDE or add the plugin to the Maven configuration.

## Output

- The application generates `games.json` in the project root directory.
- The JSON file contains a pretty-printed array of game objects.

## Tests

Run the test suite with:

```bash
mvn test
```
