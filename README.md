# TorneoDeFrescas

-Maven es una herramienta para la gestión de proyectos de software, que se basa en el concepto de POM (Proyect Object Model). Es decir, con Maven vamos a poder compilar, empaquetar, generar documentación, pasar los test, preparar las builds, etc.

-POM significa Project Object Model y es un archivo xml que contiene informacion sobre el proyecto con sus detalles de configuracion(dependencias,fuentes,test,plugins,entre otros) para construir dicho proyecto.

-Archetype es un template o plantilla que se puede elegir antes de empezar un proyecto, y ArtifactId es un componente de software que podemos incluir en un proyecto como dependencia.

Goals:

Clean: limpia todas las clases compiladas del proyecto.

Package: Es la fase en la que se toman las clases compiladas y recursos y se crea un paquete con el proyecto (jar, war, ear).

Install: Fase en la que se instala el paquete en el repositorio local para ser usado como dependencia por otros proyectos locales.

Compile: Es la fase en la que se compila el código fuente del proyecto.

Scopes:

Compile: es el scope predeterminado, se utiliza si no se especifica ningun scope. Indica que la dependencia es necesaria para compilar.

Provide: es usado para marcar dependencias que deben ser proporcionadas en tiempo de ejecucion por JDK o un contenedor. Runtime: las dependencias con este enfoque son requeridas en tiempo de ejecución, pero no son necesitadas para la compilacion del codigo del proyecto. Por Ejemplo: JDBC.

Test: es utilizado para propositos de testing.
System: es muy similar al alcance provide. La diferencia principal es que se debe incluir la dependencia explicitamente.Maven no va a buscar este artefacto en tu repositorio local, sino que habrá que especifir la ruta de dependencia mediante la etiqueta
