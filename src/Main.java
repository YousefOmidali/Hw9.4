import java.util.*;

public class Main {
    public static void main(String[] args) {
        String key;
        String value;
        int order = 6;
        Boolean appRun = true;
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> hashMap = new HashMap<>();
        while (appRun) {
            System.out.println("What to do ? \n1.put \n2.have a specific key?" +
                    " \n3.is empty? \n4.get all values \n5.replace a value \n6.Exit \n7.view map");
            try {
                order = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("InputMismatchException ");
                switch (order) {
                    case 1:
                        scanner.nextLine();
                        System.out.println("enter key: ");
                        key = scanner.nextLine();
                        System.out.println("enter value: ");
                        value = scanner.nextLine();
                        hashMap.put(key, value);
                        break;

                    case 2:
                        scanner.nextLine();
                        System.out.println("Enter key: ");
                        String keyToBeChecked = scanner.nextLine();

                        // Print the initial HashMap
                        System.out.println("HashMap: " + hashMap);

                        // Get the iterator over the HashMap
                        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();

                        // flag to store result
                        boolean isKeyPresent = false;

                        // Iterate over the HashMap
                        while (iterator.hasNext()) {

                            // Get the entry at this iteration
                            Map.Entry<String, String> entry = iterator.next();

                            // Check if this key is the required key
                            if (keyToBeChecked.equals(entry.getKey())) {
                                isKeyPresent = true;
                            }
                        }

                        // Print the result
                        System.out.println("Does key " + keyToBeChecked + " exists: " + isKeyPresent);
                        break;

                    case 3:
                        System.out.println(hashMap.isEmpty());
                        break;

                    case 4:
                        System.out.println(hashMap.values());
                        break;

                    case 5:
                        System.out.println("Enter key: ");
                        key = scanner.nextLine();
                        System.out.println("Enter new value: ");
                        value = scanner.nextLine();
                        hashMap.put(key, value);
                        break;

                    case 6:
                        appRun = false;
                        break;
                    case 7:
                        System.out.println(hashMap);
                        break;
                }
            }
        }
    }
}


