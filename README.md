# AREP - Laboratorio #7
Este laboratorio se enfoca en resolver un problema que necesite una solución distribuida y necesite alto consumo de procesamiento, el problema escogido fue calcular un número de la sucesión de Padovan de manera recursiva. Así mientras mayor sea el número de la sucesión más consumo de procesamiento tendrá.

En el tutorial se demostrara como se puede crear una solución autoescalable en EC2 y se verá como el sistema efectivamente escala bajo condiciones determinadas de carga.


[![CircleCI](https://circleci.com/gh/Ricar8o/AREP-Lab07-AvailabilityApp.svg?style=svg)](https://app.circleci.com/pipelines/github/Ricar8o/AREP-Lab07-AvailabilityApp)

## Conceptos
### Sucesión de Padovan
La sucesión de Padovan es una secuencia de números enteros cuyos tres primeros términos son 1, mientras que después cada término es el resultado de la suma entre los dos términos anteriores al término que precede al que queremos calcular.
Es decir, el cuarto término será la suma del primero más el segundo.
El quinto será la suma del segundo más el tercero.
Etc…

Una curiosa estructura gráfica relacionada con esta secuencia que se puede formar es una espiral de triángulos equiláteros, siendo la longitud de los lados elementos de la sucesión.


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
* [Spark Framework](http://sparkjava.com) - Es un framework web de desarrollo rápido inspirado en el framework Sinatra para Ruby y se basa en la filosofía Java 8 Lambda Expression.
* [AWS](https://aws.amazon.com/) - Amazon Web Services es una colección de servicios de computación en la nube pública que en conjunto forman una plataforma de computación en la nube, ofrecidas a través de Internet por Amazon.com.

## Pruebas y Compilación

Para compilar el proyecto podemos ejecutar varias opciones. 

* Para compilar el codigo fuente únicamente.

        mvn compile

* Para ejecutar todas las fases.

        mvn package

## Ejecución

IMPORTANTE! - Antes de cualquier ejecución asegurese de haber compilado o ejecutado mvn clean install.

Puede ejecutar el servicio con:

        java -cp target/classes/:target/dependency/* edu.escuelaing.arep.availability.app.SparkWebServer

## Documentación

La documentacion se encuentra en la carpeta del repositorio llamada [docs](docs), pero en caso de que quiera generarla tiene las siguientes opciones.

### Maven
Para generar la documentacion con Maven puede ejecutar cualquiera de los siguientes comandos.

*        mvn javadoc:javadoc
*        mvn javadoc:jar

## Tutorial

[Tutorial.md](Tutorial.md)



## Autor 

Andrés Ricardo Martínez Díaz - [Ricar8o](https://github.com/Ricar8o)

## Licencia
Mire el archivo [LICENSE](LICENSE) para más detalles.