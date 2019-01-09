import java.util.ArrayList;
public class NumberSequence {
    public NumberSequence(){}
    private int fibonacci (int index) {
        if (index <= 2) return 1;
        return fibonacci(index-1) + fibonacci(index-2);
    }
    public void printFibonacci (int index) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < index; i++) {
            list.add(fibonacci(i));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("");
    }
    public void cubic (int index) {
        ArrayList<Integer> cubeList = new ArrayList<Integer>();
        for (int i = 1; i <= index; i++) {
            cubeList.add(i*i*i);
        }
        for (int i = 0; i < cubeList.size(); i++) {
            System.out.print(cubeList.get(i) + " ");
        }
        System.out.println("");
    }
    public void square (int index) {
        ArrayList<Integer> squareList = new ArrayList<Integer>();
        for (int i = 1; i <= index; i++) {
            squareList.add(i*i);
        }
        for (int i = 0; i < squareList.size(); i++) {
            System.out.print(squareList.get(i) + " ");
        }
        System.out.println("");
    }
    private int triangular (int index) {
        if (index == 1) return 1;
        return triangular(index-1) + index;
    }
    public void printTriangular (int index) {
        ArrayList<Integer> triList = new ArrayList<Integer>();
        for (int i = 1; i <= index; i++) {
            triList.add(triangular(i));
        }
        for (int i = 0; i < triList.size(); i++) {
            System.out.print(triList.get(i) + " "); 
        }
        System.out.println("");
    }
}