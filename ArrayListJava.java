import java.util.ArrayList;
import java.util.List;

public class ArrayListJava {
    public static void main(String[] args) {
        // List<Datatype> variableName = new ArrayList<>();
        // Datatype must be an object

        List<Integer> listOne = new ArrayList<>(); // initial number of elements(capacity) 10

        // use constructor to declare initial capacity
        List<Integer> listTwo = new ArrayList<>(3);
        List<Integer> listThree = new ArrayList<>();

        // index starts from 0

        // adding elements
        listOne.add(12);
        listOne.add(13);
        listOne.add(25);
        listOne.add(56);
        listOne.add(17);
        listOne.add(15);
        
        //adding element to a particular index
        listOne.set(5, 1000);
        
        // getting value from array listOne
        System.out.println("Element at 0th index " + listOne.get(0));

        // inserting element at particular index
        listOne.add(0, 33); // (index,element)
        System.out.println("Inserting element at index 0");
        System.out.println("Element at 0th index " + listOne.get(0));

        // removing element by index
        listOne.remove(0); // removes element at position 0
        System.out.println("removing element at index 0");
        System.out.println(listOne.get(0));

        // removing element by value
        // Integer.valueOf() converts int or String to Integer form
        System.out.println("removing element 56");
        listOne.remove(Integer.valueOf(56));

        // checks the listOne is empty and returns boolean value
        System.out.println("checking the listOne is empty: " + listOne.isEmpty());

        // returns index of given element in the list, returns -1 if element is not
        // present
        System.out.println("index of 17 in listOne: " + listOne.indexOf(17));
        System.out.println("index of 100 in listOne: " + listOne.indexOf(100));

        // lastIndexOf returns the last index of given element if the element is
        // repeated
        // System.out.println("index of 17 in listOne: " + listOne.lastIndexOf(17));

        // checks the element is present in listOne or not, returns boolean
        System.out.println("checking the listOne contains 17: " + listOne.contains(17));
        System.out.println("checking the listOne contains 77: " + listOne.contains(77));

        listTwo.add(13);
        listTwo.add(25);
        listTwo.add(17);

        // checks all the elements of given listOne is present in current listOne,
        // returns boolean
        System.out.println("checking all elements of listTwo is in listOne: " + listOne.containsAll(listTwo));

        listThree.add(1);
        listThree.add(2);
        listThree.add(3);
        listThree.add(4);
        listThree.add(5);

        // adding all the elements of given listOne to current listOne
        System.out.println("before adding");
        printList(listOne);
        // adds all the elements in listThree to listOne
        listOne.addAll(listThree);
        System.out.println("after adding all elements in listThree to listOne");
        printList(listOne);

        List<Integer> listFour = new ArrayList<>();
        listFour.add(101);
        listFour.add(102);
        listFour.add(103);
        listFour.add(104);
        listFour.add(105);

        // adds all elements of given list starting from given index,
        // all elements of listFour are inserted to listOne starting from given index
        listOne.addAll(2, listFour);
        System.out.println("after adding all elements of listFour to ListOne from index 2");
        printList(listOne);

        // creating sublist from given index
        List<Integer> subList = listOne.subList(0, 5);
        System.out.println("Creating sublist");
        printList(subList);

        // checking for common elements
        List<Integer> temp = new ArrayList<>(listOne); // copying elements with constructor
        temp.retainAll(listTwo);
        System.out.println("after Removing elements that are not common");
        printList(temp);

        // removing all elements of given list from current list
        System.out.println("listOne");
        printList(listOne);
        System.out.println("listThree");
        printList(listThree);
        // removing all elements of listThree from listOne
        listOne.removeAll(listThree);
        System.out.println("after removing all elements of listThree from listOne");
        printList(listOne);
    }

    public static void printList(List<Integer> list) {
        for (int i : list)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("---------------------------------");
    }
}
