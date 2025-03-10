package bancsapp;

public class CompteBancari {

    private String nom;
    private int numSecret;
    private static float saldoInicial = 100;
    private float saldo;

    public CompteBancari(String nom, int numSecret) {
        this.nom = nom;
        this.numSecret = numSecret;
        this.saldo = CompteBancari.saldoInicial;
    }

    public String getNom() {
        return this.nom;
    }

    public int getNumSecret() {
        return this.numSecret;
    }

    public float consultarSaldo() {
        return this.saldo;
    }

    public static float getSaldoInicial() {
        return CompteBancari.saldoInicial;
    }

    public static void setSaldoInicial(float saldoIncial) {
        CompteBancari.saldoInicial = saldoIncial;
    }

    public String mostrarDades() {
        return ("El propietari es diu: " + this.nom + " amb número secret: "
                + this.numSecret + ". El saldo actual es: " + this.saldo);
    }

    public boolean ingressar(float quantitat) {
        boolean resultat = false;
        if (quantitat >= 0) {
            this.saldo = this.saldo + quantitat;
            resultat = true;
        }
        return resultat;
    }

    public boolean extreure(float quantitat) {
        boolean resultat = false;
        if (quantitat >= 0) {
            this.saldo = this.saldo - quantitat;
            resultat = true;
        }
        return resultat;
    }
    public void saludo2() {
        System.out.println("Hola.");
    }
}
