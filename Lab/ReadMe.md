## IntArrayList vs IntVector (efficiency examples)

### IntArrayList is more efficient when:
- You expect the list to stay relatively small or grow slowly.
- You want to reduce wasted memory (it grows by 50%, so it uses less extra space after each resize).

Example: you usually store 0–30 integers, occasionally adding a few more.

### IntVector is more efficient when:
- You expect many rapid appends and want fewer resizes/copies.
- You prefer performance over memory (doubling reduces how often grow() happens).

Example: you will append thousands of integers in a loop.
