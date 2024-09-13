package IntListInterface;

//IntArrayList should store numbers in an array with a length of 10 by default. When the add method is called, you must first
// determine if the array is full. If it is, create a new array that is 50% larger,
// move all elements over to the new array and add the new element. (For example, an array of length 10 would be increased to 15.)
public class IntArrayList implements IntList {

    int[] numbersList = new int[10];
    int currentAmount = 0;


    @Override
    public void add(int number) {
        if (currentAmount < numbersList.length) {
            //array is not full, add a new number to the list ->
            //assign the counter we've created(+1) as a position of the new element in the array
            numbersList[currentAmount] = number;
            currentAmount += 1;
        } else {
            //create new array which is 50% larger->
            //created an int variable with a value of array length + half of it's length
            int increasedArrayLength = numbersList.length + numbersList.length / 2;
            //create a new array and assign the value of the previous variable as it's length
            int[] increasedLengthNumbers = new int[increasedArrayLength];
            //move all elements over to the new array by coping it
            System.arraycopy(numbersList, 0, increasedLengthNumbers, 0, numbersList.length);
            //assign the counter we've created(+1) as a position of the new element in the array
            increasedLengthNumbers[currentAmount] = number;
            currentAmount += 1;
            //re-assign the new array to the old array
            numbersList = increasedLengthNumbers;
        }
    }

    @Override
    public int get(int id) {
        return numbersList[id];
    }

}

