//In your README.md, include an example of when IntArrayList would be more efficient and when IntVector would be more efficient.

# IntArrayList vs. IntVector Efficiency
    
    //Counting TV Series Episodes
## IntArrayList  Example
For a Netflix Series you would you an IntArrayList as they only have 10 Episodes

- **Efficiency**: In this scenario, IntArrayList would be more efficient. The small size of the list (10 search queries) and the essential need for memory optimization align with IntArrayList's approach of increasing the array's capacity by 50% when it's full. 

## IntVector  Example
For other Normal Series of around 20 Episodes it would be better to use a IntVector 

- **Efficiency**: In this case, IntVector would be more efficient. The substantial and growing list of incoming data points necessitates a memory-efficient approach, and IntVector's strategy of doubling the array's size when full allows for efficient memory pre-allocation.
