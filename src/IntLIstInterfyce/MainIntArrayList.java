package IntLIstInterfyce;

public class MainIntArrayList {
    public static void main(String[] args){
        IntArrayList arrayList = new IntArrayList();
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(8);
        System.out.println("Length is:" + arrayList.size());
        arrayList.get(2);
        System.out.println("ID is: " + arrayList.get(2));
        for(int i=0; i<arrayList.size();i++){
            System.out.println("ID is: " + arrayList.get(i));

        }

    }
}
