Proyecto calculadora del grupo 5 de Ingeniería de Software Avanzada curso 2023/2024

El proyecto está programado en Java 11 y se usa gradle 8.6 para resolver las dependencias de JUnit

Para ejecutar los test, se puede usar gradle directamente con:

Si estás en Windows: .\gradlew.bat test -i
Si estás en Linux:  .\gradlew test -i


El proyecto se ha generado en IntelliJIDEA. Si se Usa un IDE, se pueden ejecutar los test desde el menú de gradle --> verification --> check
O directamente ejecutando los tests haciendo click derecho en la clase de los test (CalculadoraTest) y después en Run CalculadoraTest

Asñi mimso también se puede usar gradle build, que pasa los test junto a la compilación de las clases.