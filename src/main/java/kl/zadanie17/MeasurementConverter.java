package kl.zadanie17;

public class MeasurementConverter {

    public static void main(String[] args) {

        System.out.println(convert(1, ConversionType.KILOMETERS_TO_MILES));

    }

    public static double convert(double value, ConversionType conversionType) {
        double result = conversionType.convert(value);
        return result;

    }

}