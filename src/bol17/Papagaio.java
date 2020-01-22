package bol17;

public class Papagaio extends Aves implements IPodeVoar {

    @Override
    public void podeCaminar() {
        System.out.println("Os papagaios poden camiñar");
    }
    @Override
    public void podeVoar() {
        System.out.println("Os papagaios poden voar");
    }
}
