package kl.zadanie17;

public enum ConversionType {

    METERS_TO_YARDS {
        @Override
        double convert(double meters) {
            return meters * 1.0936;
        }
    },

    YARDS_TO_METERS {
        @Override
        double convert ( double yards){
            return yards / 1.0936;
        }

    },
    CENTIMETERS_TO_INCHES{
        @Override
        double convert ( double centimeters){
            return centimeters * 0.3937;
        }
    },
    INCHES_TO_CENTIMETERS{
        @Override
        double convert ( double inches){
            return inches / 0.3937;
        }
    },
    KILOMETERS_TO_MILES{
        @Override
        double convert ( double kilometers){
            return kilometers * 0.6213;
        }
    },
    MILES_TO_KILOMETERS{
        @Override
        double convert ( double miles){
            return miles / 0.6213;
        }
    };

    abstract double convert(double valueToConvert);

}
