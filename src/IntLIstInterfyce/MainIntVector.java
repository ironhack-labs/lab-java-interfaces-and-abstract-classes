package IntLIstInterfyce;

public class MainIntVector {
    public static void main(String []args){
        IntVector vector = new IntVector();
       for(int i = 0; i<25; i++){
           vector.add(i);
       }
        System.out.println("Number of elements is: " + vector.size());
       for(int i=0; i < vector.size(); i ++){
           System.out.print(vector.get(i) + " ");
       }

    }
}
