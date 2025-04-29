package IntListInterface;

public class IntVector implements IIntList{
    private int[] numbers;
    private int count;
    //private int id;

    public IntVector() {
        this.numbers = new int[20];//array tiene 20 posiciones
        this.count = 0;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int[] addNumber(int number) {

        if (this.count == this.numbers.length) {
            int newLength = this.numbers.length * 2; //crear una nueva var con el doble de longitud
            int[] newNumbers = new int[newLength];
            System.arraycopy(this.numbers, 0, newNumbers, 0, this.numbers.length);
            //copia los 20 elementos orig, desde la pos 0 del nuevo array, y la cantidad de numeros que copio
            // System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);

            this.numbers = newNumbers;
        }

        this.numbers[this.count] = number;
        this.count++;
        return this.numbers;
    }

    @Override
    public int id(int number) {
        for (int i = 0; i < this.count; i++) {
            if (this.numbers[i] == number) {
                return i;
            }
        }
        return -1; // Retorna -1 si no se encuentra
    }
}