package ifsc.poo.Naves;

import ifsc.poo.Interface.Autonoma;
import ifsc.poo.Interface.Blindada;

public class NaveCargueira extends NaveEspacial implements Autonoma, Blindada {
    private int cargaMaxima;
    private int cargaAtual;

    public NaveCargueira(int velocidadeAtual, int velocidadeMaxima, boolean emVoo, int cargaAtual, int cargaMaxima){
        super(velocidadeAtual,velocidadeMaxima,emVoo);

        this.cargaAtual = cargaAtual;
        this.cargaMaxima = cargaMaxima;
    }

    public boolean carregar(int p){
        if(p + cargaAtual > cargaMaxima){
            System.out.println("Sobrecarga!");
            return false;
        }
        this.cargaAtual += p;
        return true;
    }


    @Override
    public void controleAutomatico() {
        System.out.println("https://youtu.be/s1ATTIQrmIQ?si=XcOYaldI8gQDZP3E");
    }


    @Override
    public boolean ativarBlindagem() {
        System.out.println("Ativando escudos");
        return true;
    }
}
