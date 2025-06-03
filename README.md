# 🧪 Java Practice: Interfaces, Abstract Classes & BigDecimal

Este proyecto incluye una serie de ejercicios prácticos para reforzar los conceptos de clases abstractas, interfaces e implementación de operaciones con `BigDecimal` en Java. Se compone de tres bloques principales: operaciones matemáticas, gestión de coches y sistema de vídeos, además de la implementación de estructuras de datos personalizadas.

---

## 🧱 Estructura del Proyecto

```

src/
├── bigdecimal/
│   ├── BigDecimalOperations.java
│   └── BigDecimalTest.java
├── car/
│   ├── Car.java
│   ├── Sedan.java
│   ├── UtilityVehicle.java
│   ├── Truck.java
│   └── CarTest.java
├── video/
│   ├── Video.java
│   ├── Movie.java
│   ├── TvSeries.java
│   └── VideoTest.java
└── intlist/
├── IntList.java
├── IntArrayList.java
├── IntVector.java
└── IntListTest.java

````

---

## ▶️ Cómo correr el código

### Requisitos
- Tener instalado Java 17 (o superior)
- Estar ubicada en la carpeta `src/` para compilar y ejecutar

### Compilar
```bash
javac -encoding UTF-8 ruta\*.java
````

Ejemplo:

```bash
javac -encoding UTF-8 bigdecimal\*.java
```

### Ejecutar

```bash
java paquete.Clase
```

Ejemplo:

```bash
java bigdecimal.BigDecimalTest
```

---

## 🧮 Ejemplo de uso de las clases

### BigDecimalOperations

```java
BigDecimal num = new BigDecimal("4.2545");
double rounded = BigDecimalOperations.roundToHundredth(num); // → 4.25
```

### Car (herencia)

```java
Truck truck = new Truck("789GHI", "Ford", "F-150", 80000, 3500.5);
System.out.println(truck.getInfo());
// → VIN: 789GHI, Make: Ford, Model: F-150, Mileage: 80000, Towing Capacity: 3500.5
```

### Video (herencia)

```java
Movie movie = new Movie("Inception", 148, 8.8);
System.out.println(movie.getInfo());
// → Title: Inception, Duration: 148 minutes, Rating: 8.8
```

### IntList (interfaces)

```java
IntList list = new IntArrayList();
list.add(5);
list.add(10);
System.out.println(list.get(1)); // → 10
```

---

## ⚖️ Comparativa: IntArrayList vs IntVector

| Característica            | IntArrayList                                       | IntVector                                                  |
| ------------------------- | -------------------------------------------------- | ---------------------------------------------------------- |
| Tamaño inicial            | 10                                                 | 20                                                         |
| Estrategia de crecimiento | +50% cuando se llena                               | x2 (duplica el tamaño)                                     |
| Uso recomendado           | Crecimientos moderados, poco espacio desperdiciado | Crecimientos grandes o impredecibles, menos reasignaciones |

### 🧠 Conclusión:

* **IntArrayList** es más eficiente si esperas un crecimiento **moderado** y quieres **evitar sobreasignación de memoria**.
* **IntVector** es ideal para crecimiento **rápido y masivo**, ya que duplica su tamaño y reduce la cantidad de veces que se tiene que copiar la estructura.

---

## ✨ Autoría

Ejercicio realizado por mi como práctica de Java para interfaces, clases abstractas y estructuras dinámicas.

