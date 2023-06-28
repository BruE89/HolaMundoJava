Considere que estás construyendo un programa para administrar una biblioteca virtual. Tu tarea es implementar una clase llamada BibliotecaVirtual, que contendrá las siguientes funcionalidades:

Declarar una variable de instancia de tipo ArrayList llamada libros, que almacenará objetos de la clase Libro.
Declarar una variable de instancia de tipo Set llamada categorias, que almacenará los nombres de las categorías de los libros sin duplicados.
Declarar una variable de instancia de tipo Map llamada librosPorAutor, que almacenará objetos Autor como clave y una lista de libros escritos por ese autor como valor.
A continuación, debes implementar los siguientes métodos en la clase BibliotecaVirtual:

El método agregarLibro(Libro libro) que agregue un libro a la biblioteca. Este método debe agregar el libro a la lista libros, agregar la categoría del libro al conjunto categorias y actualizar el mapa librosPorAutor agregando el libro al autor correspondiente.

El método obtenerLibrosPorCategoria(String categoria) que devuelva una lista con todos los libros que pertenecen a una categoría específica.

El método obtenerLibrosPorAutor(Autor autor) que devuelva una lista con todos los libros escritos por un autor específico.

El método obtenerCantidadLibros() que devuelva la cantidad total de libros en la biblioteca.

Recuerda definir las clases Libro y Autor con sus respectivos atributos y métodos necesarios.