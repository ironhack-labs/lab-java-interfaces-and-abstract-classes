# IntList Interface

- **IntArrayList**: starts with size 10, grows by 50% when full.
- **IntVector**: starts with size 20, doubles when full.

## When to use each

- **IntArrayList**  
  Best for small, slowly growing data where memory efficiency matters.  
  _Example_: Saving recent user searches.

- **IntVector**  
  Best for fast, large data growth where fewer resizes are needed.  
  _Example_: Storing thousands of sensor readings.
