## Boilerplate Minecraft Plugin

This is repo provides some template code for setting up a plugin with **Maven**.

### Defaults

#### Minecraft version: `1.19`
> ℹ️ The version can be change by updating the `mcVersion` maven property.

### Setup

#### In *pom.xml*, replace:

* `__PROJ_GROUP__` - the project's group id.
* `__PROJ_NAME__` - the project's artifact id (name).
* `__PROJ_VERSION__` - the project's version (ei `1.0-SNAPSHOT`).

### Extra

This template has been designed with productivity in mind. When compiling a new version of your plugin, you can configure the output directory directly into the server's plugins directory:

> clean package dependency:copy -DskipTests -DmcVersion=1.2.3 -DoutputDirectory=/path/to/server/plugins
