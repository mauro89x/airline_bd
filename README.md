# airline_bd ✈️

Trabajo del curso Diseño de Bases De Datos

## Software requerido

1. Java Development Kit version 1.8.0_301
   - https://www.oracle.com/java/technologies/downloads/
2. Paquete MySql 8.0.26
   - https://dev.mysql.com/downloads/mysql/
3. Instalar Maven
   - https://maven.apache.org/download.cgi
4. Intellij IDEA
   - https://www.jetbrains.com/idea/download/#section=windows
5. Instalar Postman
   - https://www.postman.com/downloads/

## Setup :shipit:

1. Setear la variable de entorno para JDK
   - Ir a variables de entorno y agregar en variables del sistema una nueva variable.
     `JAVA_HOME` con el valor `C:\Program Files\Java\jdk1.8.0_301`
   - Reiniciar terminales
   - `echo %JAVA_HOME%`
   - `mvn -version`
2. Iniciar MySql Workbench y crear un nuevo `schema` con el nombre `tpbd`
3. Iniciar Intellij con el proyecto, aguardar que finalice el proceso de carga :hourglass_flowing_sand:
4. `mvn install`
5. Run project! :arrow_forward:

## Probar endpoints

- Iniciar el browser y pegar la URL `http://localhost:8081/apibd/prueba`
- Debe retornar `OK!`

## Otros endpoints

- GET `http://localhost:8081/apibd/airplanes/{id}`
- POST `http://localhost:8081/apibd/airplanes`
