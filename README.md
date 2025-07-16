## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).



 javac --release 17 -cp "src:lib/*" -d bin src/validaciones/ValidacionesLibro.java src/models/Book.java
jar cf lib/validadores-evaluacion.jar -C bin validaciones

pablo@CV1PTORRESP icc-est-u2-evaluacion % jar tf lib/validadores-evaluacion.jar                                                                  

META-INF/
META-INF/MANIFEST.MF
validaciones/
validaciones/ValidacionesLibro.class
pablo@CV1PTORRESP icc-est-u2-evaluacion % javap -verbose -cp lib/validadores-evaluacion.jar validaciones.ValidacionesLibro | grep "major version"

  major version: 61
pablo@CV1PTORRESP icc-est-u2-evaluacion % git add .




javac -cp "src:lib/*" -d bin src/validaciones/ValidacionesLibro.java src/models/Book.java
