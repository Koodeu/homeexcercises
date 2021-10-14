package kl.zadanie7;

public class AmmoClip {

    private int clipSize;
    private int currentAmmoAmout;

    public AmmoClip(int clipSize) {
        this.clipSize = clipSize;
    }

    public int getClipSize() {
        return clipSize;
    }

    public int getCurrentAmmoAmout() {
        return currentAmmoAmout;
    }

    public void setCurrentAmmoAmout(int currentAmmoAmout) {
        this.currentAmmoAmout = currentAmmoAmout;
    }

    public boolean isLoaded() {
        if (this.getCurrentAmmoAmout() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void loadAmmo(String reload) {
        int i = 0;
        do {
            i++;
            currentAmmoAmout++;
            System.out.println("Dodano nabój:" + i);
        }
        while (i < this.clipSize);
    }

    public void shot() {
        currentAmmoAmout--;
        if(this.currentAmmoAmout > 0) {
            System.out.println("pozostało naboi: " + this.getCurrentAmmoAmout());
        }
        else {
            System.out.println("Pusty magazynek. Przeładuj!");
        }
    }


}
