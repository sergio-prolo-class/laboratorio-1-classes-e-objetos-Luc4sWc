package ifsc.poo;

public class relogio {
    byte hora, minuto, segundo;

    void ajustaHora(byte hora, byte minuto, byte segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    String getHora() {
        return String.format("%02d:%02d:%02d\n", this.hora, this.minuto,this.segundo);
    }

    void avancaHora(){
        if(this.minuto == 0){
            if(this.hora < 23){
                this.hora++;
            }
            if(this.hora == 23){
                this.hora = 0;
                return;
            }
        }
        if(this.hora < 23){
            this.hora++;
        }
        if(this.hora == 23){
            this.hora = 0;
        }

    }
    void avancaMinuto(){
        if(this.segundo == 0){
            if(this.minuto == 59){
                this.minuto = 0;
                return;
            }
            if(this.minuto < 59){
                this.minuto++;
                return;
            }
        }
        if(this.minuto < 59){
            this.minuto++;
        }
        if(this.minuto == 59){
            this.minuto = 0;
        }

    }
    void avancaSegundo(){
        if(this.segundo < 59){
            this.segundo++;
        }
        if(this.segundo == 59){
            this.segundo = 0;
            avancaMinuto();
            avancaHora();
        }
    }

    void novaFormatacao(){
        switch (this.hora){
            case 0: this.hora = 23; this.hora = 11; break;

        }
    }
}
