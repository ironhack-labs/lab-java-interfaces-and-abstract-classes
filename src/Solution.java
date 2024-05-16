public class Solution {
    public static int[] balancer(int[] numList, int sum) {
        // Insert solution code here
        int totalSum = calculateTotalSum(numList);

        if (totalSum == sum){
            return numList;
        } else if (totalSum < sum) {
            while (totalSum < sum) {
                int minIndex = findMinimumIndex(numList);
                numList[minIndex]++;
                totalSum++;

            }
        }
        return numList;
    }

    //calculateTotalSum / totalSum
    private static int calculateTotalSum(int[] numList) {
        int totalSum = 0;
        for (int num : numList) {
            totalSum += num;
        }
        return totalSum;
    }

    //findMinimumIndex / minIndex
    private static int findMinimumIndex(int[] numList) {
        int minIndex = 0;
        for (int i = 1; i < numList.length; i++) {
            if (numList[i] < numList[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}