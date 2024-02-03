IntArrayList is more efficient in applications where frequents small additions are needed:

IntArrayList intList = new IntArrayList();

for (int i = 0; i < 50; i++) {
intList.add(i);
}


for (int i = 51; i < 100; i++) {
intList.add(i);
}


for (int i = 101; i < 150; i++) {
intList.add(i);
}

While IntVector is more efficient when fewer additions are made but they need more increase in size:

IntVector intList = new IntVector();
for (int i = 0; i < 1000; i++) {
intList.add(i);
}
