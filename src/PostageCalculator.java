public class PostageCalculator {
    public static double calculatePostage(Package aPackage){
        double base = 3.75;
        if (aPackage.getWeight() > 40 || ((aPackage.getLength() + aPackage.getWidth() + aPackage.getHeight()) > 36)){
            if (aPackage.getWeight() > 40){
                double excessWeight = aPackage.getWeight() - 40;
                base += (40*0.05)+(excessWeight*0.10);
            }
            if ((aPackage.getLength() + aPackage.getWidth() + aPackage.getHeight()) > 36){
                double excessSize = (aPackage.getLength() + aPackage.getWidth() + aPackage.getHeight()) - 36;
                base += excessSize*0.10;
            }
            int originCountryCode = Integer.parseInt(aPackage.getOrigin().getZipCode().substring(0, 4));
            int destinationCountryCode = Integer.parseInt(aPackage.getDestination().getZipCode().substring(0, 4));
            base += (((double) originCountryCode /100) + ((double) destinationCountryCode /100));
            return base;
        }
        base += (aPackage.getWeight()/.1) * 0.05;
        int originCountryCode = Integer.parseInt(aPackage.getOrigin().getZipCode().substring(0, 4));
        int destinationCountryCode = Integer.parseInt(aPackage.getDestination().getZipCode().substring(0, 4));
        base += (((double) originCountryCode /100) + ((double) destinationCountryCode /100));
        return base;
    }

    public static double calculatePostage(String originZipcode, String destinationZipcode, double weight, double length, double width, double height){
        double base = 3.75;
        if (weight > 40 || ((length + width + height) > 36)){
            if (weight > 40){
                double excessWeight = weight - 40;
                base += (40*0.05)+(excessWeight*0.10);
            }
            if ((length + width + height) > 36){
                double excessSize = (length + width + height) - 36;
                base += excessSize*0.10;
            }
            int originCountryCode = Integer.parseInt(originZipcode.substring(0, 4));
            int destinationCountryCode = Integer.parseInt(destinationZipcode.substring(0, 4));
            base += (((double) originCountryCode /100) + ((double) destinationCountryCode /100));
            return base;
        }
        base += (weight/.1) * 0.05;
        int originCountryCode = Integer.parseInt(originZipcode.substring(0, 4));
        int destinationCountryCode = Integer.parseInt(destinationZipcode.substring(0, 4));
        base += (((double) originCountryCode /100) + ((double) destinationCountryCode /100));
        return base;
    }

    public static double calculatePostage(Address origin, Address destination, double weight, double length, double width, double height){
        double base = 3.75;
        if (weight > 40 || ((length + width + height) > 36)){
            if (weight > 40){
                double excessWeight = weight - 40;
                base += (40*0.05)+(excessWeight*0.10);
            }
            if ((length + width + height) > 36){
                double excessSize = (length + width + height) - 36;
                base += excessSize*0.10;
            }
            int originCountryCode = Integer.parseInt(origin.getZipCode().substring(0, 4));
            int destinationCountryCode = Integer.parseInt(destination.getZipCode().substring(0, 4));
            base += (((double) originCountryCode /100) + ((double) destinationCountryCode /100));
            return base;
        }
        base += (weight/.1) * 0.05;
        int originCountryCode = Integer.parseInt(origin.getZipCode().substring(0, 4));
        int destinationCountryCode = Integer.parseInt(destination.getZipCode().substring(0, 4));
        base += (((double) originCountryCode /100) + ((double) destinationCountryCode /100));
        return base;
    }
}
