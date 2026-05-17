# Build Protection

A simple Minecraft Paper plugin that protects the server world from unwanted building, breaking, and interacting.

## Description

Build Protection is a lightweight Minecraft server plugin for Paper/Spigot servers.

The plugin adds a `/build` command that allows players with permission to toggle BuildMode. When BuildMode is enabled, the player can build, break blocks, and interact with the world. When BuildMode is disabled, these actions are blocked.

This is useful for lobby servers, spawn areas, hub servers, or any server where normal players should not be able to modify the world.

## Features

- Simple `/build` command
- Toggle BuildMode on and off
- Permission-based access
- Blocks block breaking when BuildMode is disabled
- Blocks block placing when BuildMode is disabled
- Blocks player interaction when BuildMode is disabled
- Automatically switches the player to Creative mode when BuildMode is enabled
- Automatically switches the player to Survival mode when BuildMode is disabled
- Configurable enable and disable messages
- Lightweight and easy to use
- Built with Java and Maven

## Command

```txt
/build
```

Using the command toggles BuildMode for the player.

If BuildMode is disabled, the command enables it and puts the player into Creative mode.
If BuildMode is already enabled, the command disables it and puts the player back into Survival mode.

## Permission

```txt
build.use
```

Players need this permission to use the `/build` command.

## How It Works

The plugin stores players with active BuildMode in a list.

When a player tries to:

- Break a block
- Place a block
- Interact with the world

the plugin checks whether the player has BuildMode enabled.

If the player does not have BuildMode enabled, the action is cancelled.

## Installation

1. Download or build the plugin `.jar`
2. Put the `.jar` file into your server's `plugins` folder
3. Restart or start your server
4. Give trusted players the permission:

```txt
build.use
```

5. Use the command in-game:

```txt
/build
```

## Configuration

The plugin creates a configuration file where you can change the BuildMode messages.

Default messages:

```yml
buildmode-enable-message: "§aBuildMode enabled!"
buildmode-disable-message: "§cBuildMode disabled!"
```

You can customize the messages for your server.

Example:

```yml
buildmode-enable-message: "§aYou are now in BuildMode."
buildmode-disable-message: "§cYou are no longer in BuildMode."
```

## Requirements

- Java 17 or newer
- Paper or Spigot server
- Minecraft 1.20 or newer recommended

## Dependencies

This project uses:

- Paper API 1.20.4
- Maven Compiler Plugin
- Maven Shade Plugin

## Build

Clone the repository:

```bash
git clone https://github.com/FilipPikus/Build-Protection.git
cd Build-Protection
```

Build the plugin with Maven:

```bash
mvn clean package
```

The compiled `.jar` file will be located in the `target` folder.

## Project Structure

```txt
src/main/java        Plugin source code
src/main/resources   Plugin resources such as plugin.yml
pom.xml              Maven project file
LICENSE              Project license
```

## Educational Purpose

This project is also useful for learning basic Minecraft plugin development, including:

- Creating commands
- Working with permissions
- Listening to Bukkit/Paper events
- Cancelling player actions
- Managing player states with UUIDs
- Using configuration files
- Building Java plugins with Maven

## License

This project is licensed under the Apache License 2.0.
