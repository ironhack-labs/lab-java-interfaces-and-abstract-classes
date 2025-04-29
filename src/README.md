# Proyecto Java

## Descripción

- **Operaciones con BigDecimal**  
  Métodos para redondear y cambiar el signo de números usando la clase BigDecimal.

- **Sistema de Inventario de Autos**  
  Uso de clases abstractas y herencia para representar distintos tipos de autos (Sedán, SUV, Camión).

- **Servicio de Streaming de Videos**  
  Herencia y clases abstractas para representar películas y series.

- **Interfaz IntList con crecimiento dinámico**  
  Implementaciones personalizadas de listas enteras tipo ArrayList y Vector.

## Uso

Se puede ejecutar todo desde `Main.java`, que contiene ejemplos prácticos de cada parte del proyecto.

## Comparación: IntArrayList vs IntVector

| Estructura       | Tamaño inicial | Expansión             | Más eficiente cuando...                 |
|------------------|----------------|------------------------|-----------------------------------------|
| IntArrayList     | 10             | +50%                   | La lista crece lentamente.              |
| IntVector        | 20             | *2                     | Se espera un gran número de elementos.  |

## IntArrayList vs. IntVector

- **IntArrayList**: útil cuando el número de elementos es pequeño y el crecimiento no es frecuente. Solo aumenta un 50% al llenarse. más eficiente si se van a manejar pocos elementos o el crecimiento es ocasional. Aumenta su tamaño solo un 50%, por lo tanto, ocupa menos memoria.
- **IntVector**: más eficiente cuando se agregan muchos elementos. Duplica su tamaño al llenarse, lo que evita redimensionamientos frecuentes. mejor si se esperan muchos elementos o agregarlos constantemente. Al duplicar su tamaño, reduce la cantidad de veces que necesita redimensionarse.

