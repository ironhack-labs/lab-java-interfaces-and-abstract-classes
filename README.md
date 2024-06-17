# Java Implementations

## BigDecimal Operations
This section includes two methods for BigDecimal operations:
1. `roundToNearestHundredth(BigDecimal number)`: Rounds the BigDecimal number to the nearest hundredth.
2. `reverseSignAndRoundToNearestTenth(BigDecimal number)`: Reverses the sign of the BigDecimal number and rounds it to the nearest tenth.

## Car Inventory System
Defines an abstract class `Car` with the properties and behaviors common to all cars. Subclasses `Sedan`, `UtilityVehicle`, and `Truck` extend `Car` and add specific properties:
- `UtilityVehicle`: Has a `fourWheelDrive` property.
- `Truck`: Has a `towingCapacity` property.

## Video Streaming Service
Defines an abstract class `Video` with properties and behaviors common to all videos. Subclasses `TvSeries` and `Movie` extend `Video` and add specific properties:
- `TvSeries`: Has an `episodes` property.
- `Movie`: Has a `rating` property.

## IntList Interface
Defines an `IntList` interface with methods to add a number and retrieve a number by its ID. Implements two classes:
- `IntArrayList`: Starts with an array of length 10. Increases the array size by 50% when full.
- `IntVector`: Starts with an array of length 20. Doubles the array size when full.

### Efficiency Considerations
- `IntArrayList` is more efficient when dealing with a smaller list of elements due to its initial smaller size and slower growth rate.
- `IntVector` is more efficient when dealing with a larger list of elements due to its initial larger size and faster growth rate.
