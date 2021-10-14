package kl.zadanie7;

public class Application {

    public static void main(String[] args) {

        AmmoClip ammoClip = new AmmoClip(6);
        ammoClip.setCurrentAmmoAmout(0);

        System.out.println(ammoClip.isLoaded());
        ammoClip.loadAmmo("reload");
        System.out.println(ammoClip.isLoaded());
        System.out.println("obecnie znajmuje się "+  ammoClip.getCurrentAmmoAmout() + " naboi w  magazynku");

        ammoClip.shot();
        ammoClip.shot();
        ammoClip.shot();
        ammoClip.shot();
        ammoClip.shot();
        ammoClip.shot();

        ammoClip.loadAmmo("reload");
        System.out.println("obecnie znajmuje się "+  ammoClip.getCurrentAmmoAmout() + " naboi w  magazynku");


    }
}
