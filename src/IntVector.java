public class IntVector implements IntList{
    private int[] intArray = new int[20];
    private int size = 0;
    @Override
    public void add(int number){
        if(intArray.length == size){
            int[] newIntArray = new int[size*2];
            System.arraycopy(intArray,0,newIntArray,0,intArray.length);
            this.intArray = newIntArray;
            intArray[size] = number;
        }else{
            intArray[size] = number;
        }
        size++;
    }

    public int get(int id){
        for(int number : intArray){
            if(number == id){
                return number;
            }
        }
        return 0;
    }
}
