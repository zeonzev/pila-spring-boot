Estructura Pila (Stack) en Spring Boot

Nombre: Jonathan Emmanuel Ticona Pérez

Descripción

En este proyecto se define e implementa una "estructura dinámica de Pila genérica" (`Pila<T>`) usando nodos enlazados. Como es dinámica, no tiene un tamaño fijo: crece cuando se agregan elementos y se reduce cuando se quitan.

La pila funciona con el principio **LIFO** (*Last In, First Out*): el último elemento que entra es el primero que sale.


Ejemplos de uso

POST   http://localhost:8080/api/v1/insertar?elemento=hola   ->  Se insertó: hola
POST   http://localhost:8080/api/v1/insertar?elemento=mundo  ->  Se insertó: mundo
GET    http://localhost:8080/api/v1/ver                      ->  ["mundo","hola"]
GET    http://localhost:8080/api/v1/tamanyo                  ->  2
DELETE http://localhost:8080/api/v1/eliminar                 ->  Se eliminó: mundo


Si se intenta eliminar con la pila vacía, la API responde: `La pila está vacía`.

Tecnologías

- Java 17
- Spring Boot
- Spring Web
- Maven

Cómo ejecutar
 Clonar el repositorio:
git clone 
Entrar a la carpeta del proyecto y ejecutar:
./mvnw spring-boot:run
En Windows:
.\mvnw spring-boot:run


