package intlistinterface;

public class EfficiencyTest {
    public static void main(String[] args) {
        long startTime, endTime;
        long intArrayListResult;
        long intVectorResult;

        IntList arrayList = new IntArrayList();
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        endTime = System.nanoTime();
        intArrayListResult = endTime - startTime;
        System.out.println("IntArrayList time: " + intArrayListResult + " ns");

        IntList vectorList = new IntVector();
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            vectorList.add(i);
        }
        endTime = System.nanoTime();
        intVectorResult = endTime - startTime;
        System.out.println("IntVector time: " + intVectorResult + " ns");

        System.out.println("Difference: " + Math.abs(intArrayListResult-intVectorResult));
    }
}