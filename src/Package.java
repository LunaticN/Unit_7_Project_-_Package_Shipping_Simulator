public class Package {
    private Address origin;
    private Address destination;
    private double weight;
    private double length;
    private double width;
    private double height;

    public Package(Address origin, Address destination, double weight, double length, double width, double height){
        if (weight >= 0.10 && (length >= 2 && width >= 2 && height >= 2)){
            this.origin = origin;
            this.destination = destination;
            this.weight = weight;
            this.length = length;
            this.width = width;
            this.height = height;
        }
        else{
            System.out.println("A package cannot be less than a tenth of a pound or smaller than 2 inches on each side. Please try again.");
        }
    }

    public Address getOrigin() {
        return origin;
    }

    public Address getDestination() {
        return destination;
    }

    public double getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
