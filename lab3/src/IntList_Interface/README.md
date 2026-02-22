IntArrayList:

-- using this class is good when you are adding not many elements to the list. because it creates less free slots that will not take much memory

IntVector:

-- this class is good when you need to add more items. it makes less copies and give more slots.


note:
-- if use IntArrayList when you need more slots, then copying of the prev. arrays will fill memory.

