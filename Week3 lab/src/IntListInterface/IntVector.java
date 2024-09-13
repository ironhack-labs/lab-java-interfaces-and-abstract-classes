package IntListInterface;
//////IntVector should store numbers in an array with a length of 20 by default.
////// When the add method is called, you must first determine if the array is full.
////// If it is, create a new array that is double the size of the current array, move all elements over
////// to the new array and add the new element.
////// (For example, an array of length 10 would be increased to 20.)
////public class Main {
public class IntVector implements IntList{

    int[] numbersVector = new int[20];
    int currentAmount = 0;


    @Override
    public void add(int number) {
        if (currentAmount < numbersVector.length) {
            //array is not full, add a new number to the list ->
            //assign the counter we've created(+1) as a position of the new element in the array
            numbersVector[currentAmount] = number;
            currentAmount += 1;
        } else {
            //create new array which is twice larger->
            //created an int variable with a value of array length multiplied by two
            int increasedArrayLength = numbersVector.length * 2;
            //create a new array and assign the value of the previous variable as it's length
            int[] increasedLengthNumbers = new int[increasedArrayLength];
            //move all elements over to the new array by coping it
            System.arraycopy(numbersVector, 0, increasedLengthNumbers, 0, numbersVector.length);
            //assign the counter we've created(+1) as a position of the new element in the array
            increasedLengthNumbers[currentAmount] = number;
            currentAmount += 1;
            //re-assign the new array to the old array
            numbersVector = increasedLengthNumbers;
        }
    }

    @Override
    public int get(int id) {
        return numbersVector[id];
    }

}

