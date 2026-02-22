When we don't know how many additional places is needed and when we are working on a machine that has limited memory(RAM), its better to use IntArrayList.
Because it sets only 50% additional space that might be extended later if needed, and also it avoids setting 50% more unnecessary space in RAM.

Since creating a new huge list and copying all the elements takes up a lot of time and process power(CPU usage), its better to use IntVector if our goal is the speed of adding new items and when we have no problem about RAM or CPU usage.


