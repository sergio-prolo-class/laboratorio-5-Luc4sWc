package ifsc.poo.Naves;

import ifsc.poo.Interface.Blindada;
import ifsc.poo.Interface.Tripulada;

public class NaveExploradora extends NaveEspacial implements Tripulada, Blindada {
    private boolean holofotes;

    public NaveExploradora(int velocidadeAtual, int velociadadeMaxima,boolean emVoo){
        super(velocidadeAtual,velociadadeMaxima,emVoo);

        this.holofotes = false;
    }

    public boolean ligarHolofotes(){
        this.holofotes = true;
        return this.holofotes;
    }


    @Override
    public void controleManual() {
        System.out.println("https://youtu.be/v2AC41dglnM?si=X2LYD3Eurx_ZqzOB");
    }

    @Override
    public boolean ativarBlindagem() {
        System.out.println("Ativando escudos!");
        return true;
    }
}
