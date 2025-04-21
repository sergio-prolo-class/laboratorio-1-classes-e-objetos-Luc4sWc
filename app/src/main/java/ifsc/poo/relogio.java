package ifsc.poo;

import java.text.SimpleDateFormat;

public class relogio {
    private byte hora, minuto, segundo;
    private static relogio relogio;

    void ajustaHora(byte hora) {
        if(hora > 23 || hora < 0){
            this.hora = 0;
            return;
        }
        this.hora = hora;
    }
    void ajustaMinuto(byte minuto) {
        if(minuto > 59 || minuto < 0){
            this.minuto = 0;
            return;
        }
        this.minuto = minuto;
    }
    void ajustaSegundo(byte segundo) {
        if(segundo > 59 || segundo < 0){
            this.segundo = 0;
            return;
        }
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
            case 1: this.hora = 22; this.hora = 10; break;
            case 2: this.hora = 21; this.hora = 9; break;
            case 3: this.hora = 20; this.hora = 8; break;
            case 4: this.hora = 19; this.hora = 7; break;
            case 5: this.hora = 18; this.hora = 6; break;
            case 6: this.hora = 17; this.hora = 5; break;
            case 7: this.hora = 16; this.hora = 4; break;
            case 8: this.hora = 15; this.hora = 3; break;
            case 9: this.hora = 14; this.hora = 2; break;
            case 10: this.hora = 13; this.hora = 1; break;
            default: ;
        }
    }

    String getHoraAMPM() {
        return String.format("%02dam %02dm %02ds\n", this.hora, this.minuto,this.segundo);
    }

    void Sincroniza(relogio outroRelogio){
        this.hora = outroRelogio.hora;
        this.minuto = outroRelogio.minuto;
        this.segundo = outroRelogio.segundo;
    }

    int Diferenca(relogio a, relogio b){
        int hora_a = a.hora;
        int hora_b = b.hora;
        int diferenca;

        if(hora_a > hora_b){
            diferenca = (hora_a - hora_b) * 3600;
        }
        else{
           diferenca = (hora_b - hora_a) * 3600;
        }

        return diferenca;
    }
}
