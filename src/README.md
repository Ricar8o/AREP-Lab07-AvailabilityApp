# AREP - Laboratorio #6



[![CircleCI](https://circleci.com/gh/Ricar8o/AREP-Lab07-AvailabilityApp.svg?style=svg)](https://app.circleci.com/pipelines/github/Ricar8o/AREP-Lab07-AvailabilityApp)

## Conceptos



## Comenzando 
Para obtener una copia local del repositorio puede ejecutar la siguiente línea en la consola de comandos.
    
    git clone https://github.com/Ricar8o/AREP-Lab07-AvailabilityApp.git

## Pre-requisitos

Debe tener instalado lo siguiente:

* [GIT](https://git-scm.com/book/es/v2/Inicio---Sobre-el-Control-de-Versiones-Instalación-de-Git)
* [JAVA 8](https://www.java.com/es/download/)
* [MAVEN](https://maven.apache.org)

GIT no es completamente necesario pero si es recomendable, también puede descargar el repositorio como un .zip.

## Otras Tecnologías
* [CircleCI](https://circleci.com/) - Es una plataforma que ofrece integración continua en el codigo.

## Pruebas y Compilación

Para compilar el proyecto podemos ejecutar varias opciones. 

* Para compilar el codigo fuente únicamente.

        mvn compile

* Para ejecutar todas las fases.

        mvn package

## Ejecución

IMPORTANTE! - Antes de cualquier ejecución asegurese de haber compilado o ejecutado mvn clean install.



## Documentación

La documentacion se encuentra en la carpeta del repositorio llamada [docs](docs), pero en caso de que quiera generarla tiene las siguientes opciones.

### Maven
Para generar la documentacion con Maven puede ejecutar cualquiera de los siguientes comandos.

*        mvn javadoc:javadoc
*        mvn javadoc:jar

## PDF Diseño

[Arep_Lab_7.PDF](Arep_Lab_7.pdf)



## Autor 

Andrés Ricardo Martínez Díaz - [Ricar8o](https://github.com/Ricar8o)

## Licencia
Mire el archivo [LICENSE](LICENSE) para más detalles.