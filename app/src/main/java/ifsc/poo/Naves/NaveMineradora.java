package ifsc.poo.Naves;

import ifsc.poo.Interface.Tripulada;

public class NaveMineradora extends NaveEspacial implements Tripulada {
    private int energiaLaserMaxima;
    private int energiaLaserAtual;

    public NaveMineradora(int velocidadeAtual, int velocidadeMaxima, boolean emVoo, int energiaLaserAtual, int energiaLaserMaxima){
        super(velocidadeAtual,velocidadeMaxima,emVoo);

        this.energiaLaserAtual = energiaLaserAtual;
        this.energiaLaserMaxima = energiaLaserMaxima;
    }

    public boolean alternarLaser(){
        System.out.println("Laser alternado");
        return true;
    }


    @Override
    public void controleManual() {
        System.out.println("https://youtu.be/XZuM4zFg-60?si=LvR3D5dGqxNKXzAx");
    }
}
