package kl.zadanie8;

public class ParcelValidator implements Validator {


    @Override
    public boolean validate(Parcel parcel) {

        if ((((parcel.getxLength() + parcel.getzLength() + parcel.getyLength()) < 300))
                && (parcel.getyLength() < 30 && parcel.getzLength() < 30 && parcel.getxLength() < 30)
                && (parcel.getWeight() < 15)
                && (parcel.isExpress() == true)) {
            return true;
        } else if ((((parcel.getxLength() + parcel.getzLength() + parcel.getyLength()) < 300))
                && (parcel.getyLength() < 30 && parcel.getzLength() < 30 && parcel.getxLength() < 30)
                && (parcel.getWeight() < 30)
                && (parcel.isExpress() == false)) {
            return true;
        } else {
            return false;
        }

    }
}
