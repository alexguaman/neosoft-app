
# Practica de Spring - BackEnd Neosoft-app 

## Estructura del proyecto
```
└───src
    ├───main
    │   ├───java
    │   │   └───com
    │   │       └───neosoft
    │   │           └───app
    │   │               ├───dto
    │   │               ├───entities
    │   │               ├───exception
    │   │               ├───repository
    │   │               ├───services
    │   │               └───web
    │   │                   ├───configuration
    │   │                   └───controller
    │   └───resources
    │       ├───static
    │       └───templates
    └───test
        └───java

```

## Script para BD
En la carpeta /resources se encuentran el script para esta práctica.
* db-neosoft.sql

Crea en MYSQL la Bd "neosoft", la tabla "clientes", e inserta un registro.

## Compilacion y despliegue 
```
mvn compile
mvn package
java - jar target/neosoft-prueba-1.0.jar
```

## Documentación

La documentacion del proyecto en encuentra desplegada con swagger en la url:

* http://localhost:8090/neosoft-api/swagger-ui.html
