## ENDTERM DE ENTORNOS DE DESARROLLO


### GRUPO_01

Componentes:

- Lisardo Garcia
- Miguel de Lara
- Raúl Teruel


## Trabajo con ramas

Hemos utilizado un sistema de trabajo basado en ramas para simular un entorno de producción.

Cada funcionalidad del proyecto se ha desarrollado en una rama independiente (como feature/coche, feature/frenar, feature/acelerar, etc.), evitando trabajar directamente sobre la rama main.

Esto nos permite desarrollar funcionalidades de forma aislada y realizar la integración final cuando el código está probado y estable.

## Integración de Tests

Hemos integrado en el proyecto Tests, que serán ejecutados por Maven. Esto permite verificar que las funcionalidades del proyecto funcionan correctamente antes de integrar los cambios de las ramas secundarias en la rama principal.

## Autorización merge

Se ha configurado una regla de protección en la rama main que requiere la aprobación de al menos otro compañero antes de realizar la integración de cambios.
Esto garantiza la revisión y protección del código.

## Integración continua

Se ha configurado un sistema de integración continua mediante GitHub Actions.

El archivo ci.yml ejecuta automáticamente los tests definidos en Maven cada vez que se realiza un push o una pull request.

Esto permite detectar errores de forma automática y asegurar la estabilidad del proyecto.

## Integración de funcionalidades

Todas las funcionalidades desarrolladas en ramas independientes se han integrado en la rama main mediante pull requests.

Cada integración se ha realizado una vez verificado el correcto funcionamiento de la funcionalidad correspondiente.
