package List;

public class DynamicListTest {
    public static void main(String[] args) {
        // Create a dynamic-sized list of integers
        Dynamic_Sized_list<Integer> myList = new Dynamic_Sized_list<>();

        // Adding elements to the list
        myList.add(10);
        System.out.println("Size of the list: " + myList.size());
        myList.add(20);
        System.out.println("Size of the list: " + myList.size());
        myList.add(30);
        System.out.println("Size of the list: " + myList.size());

        myList.add(30);
        System.out.println("Size of the list: " + myList.size());

        myList.add(30);
        System.out.println("Size of the list: " + myList.size());

        myList.add(30);
        System.out.println("Size of the list: " + myList.size());

        myList.add(30);
        System.out.println("Size of the list: " + myList.size());

        myList.add(30);
        System.out.println("Size of the list: " + myList.size());

        myList.add(30);
        System.out.println("Size of the list: " + myList.size());

        myList.add(30);
        System.out.println("Size of the list: " + myList.size());

        // Display the elements of the list
        System.out.println("Elements of the list:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // Remove an element from the list
        myList.remove(1);
        System.out.println("Size of the list after removal: " + myList.size());

        // Display the elements of the list after removal
        System.out.println("Elements of the list after removal:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
