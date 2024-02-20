import java.util.ArrayList;
import java.util.Random;

public class PackageSimulator {
    private ArrayList<Package> packages;

    public PackageSimulator(){
        this.packages = new ArrayList<Package>();
    }

    public void generatePackages(int numberOfPackages){
        Random rand = new Random();
        for (int i = 0; i < numberOfPackages; i++) {
            Address origin = new Address(rand.nextInt(1000, 9999) + " Random Street, City, State " + rand.nextInt(10000, 99999));
            Address destination = new Address(rand.nextInt(1000, 9999) + " Random Street, City, State " + rand.nextInt(10000, 99999));
            packages.add(new Package(origin, destination, rand.nextDouble(1, 120), rand.nextDouble(1, 36), rand.nextDouble(1, 36), rand.nextDouble(1, 36)));
        }
    }

    public double generateTotalCost(){
        double total = 0.0;
        for (int i = 0; i < packages.size(); i++) {
            total += PostageCalculator.calculatePostage(packages.get(i));
        }
        return total;
    }

    public String generateSimulationInfo(){
        String output = "";
        for (int i = 0; i < packages.size(); i++) {
            output += "\nPackage " + (i + 1) + ":-----------------------------------\nOrigin Address: " + packages.get(i).getOrigin() + "\nDestination Address: " + packages.get(i).getDestination() + "\nWeight: " + packages.get(i).getWeight() + "\nLength: " + packages.get(i).getLength() + "\nWidth: " + packages.get(i).getWidth() + "\nHeight: " + packages.get(i).getHeight();
        }
        output += "\nTotal Cost: $" + generateTotalCost();
        return output;
    }

    public void resetSimulation(){
        packages.clear();
    }
}
