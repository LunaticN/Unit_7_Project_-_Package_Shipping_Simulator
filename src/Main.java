import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Address myHouse = new Address("1262", "Bay Ridge Ave", "Brooklyn", "NY", "11219");
//        System.out.println(myHouse);
//
//        Address myHouseFromString = new Address(myHouse.toString());
//        System.out.println(myHouseFromString);

        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------\nWhat would you like to do?\n1. Calculate the cost of one package\n2. Simulate packages\n3. How package costs are calculated\n4. Exit\nInput: ");
        String choice = scanner.nextLine();
        while (!(choice.equals("4"))){
            if (choice.equals("1")){
                System.out.println("Where are you shipping the package from? (Please format correctly)");
                String originStr = scanner.nextLine();
                System.out.println("Where are you shipping the package to? (Please format correctly)");
                String destinationStr = scanner.nextLine();
                System.out.println("Enter the package weight: ");
                double weight = Double.parseDouble(scanner.nextLine());
                System.out.println("Package Length: ");
                double length = Double.parseDouble(scanner.nextLine());
                System.out.println("Package Width: ");
                double width = Double.parseDouble(scanner.nextLine());
                System.out.println("Package Height: ");
                double height = Double.parseDouble(scanner.nextLine());

                Address origin = new Address(originStr);
                Address destination = new Address(destinationStr);
                Package aPackage = new Package(origin, destination, weight, length, width, height);
                System.out.println(PostageCalculator.calculatePostage(aPackage));
            }
            else if (choice.equals("2")){
                System.out.println("How many packages would you like to create?: ");
                int count = Integer.parseInt(scanner.nextLine());
                PackageSimulator simulate = new PackageSimulator();
                simulate.generatePackages(count);
                System.out.println(simulate.generateSimulationInfo());
            }
            else if (choice.equals("3")){
                System.out.println("The formula to determine the cost of shipping is:\n" +
                        "The base cost is $3.75\n" +
                        "Add 5 cents for each tenth of a pound\n" +
                        "Divide the difference in county codes by 100 and add that to calculate the final total\n" +
                        "The county code is the first 3 digits f the zip code\n" +
                        "\n" +
                        "Accounting for oversize packages:\n" +
                        "Any package that exceeds a combined 36 inches will cost an additional 10 cents per inch.\n" +
                        "Additionally, packages that are more than 40 pounds will be charged 10 cents per tenth of a pound over the 40 pound limit.\n");
            }
            System.out.println("----------------------------\nWhat would you like to do?\n1. Calculate the cost of one package\n2. Simulate packages\n3. How package costs are calculated\n4. Exit\nInput: ");
            choice = scanner.nextLine();
        }
        System.out.println("Come again!");
    }
}