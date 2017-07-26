package objetos01;

/**
 * 2- Cread la clase Cd con title y duration.
 * También la clase CdPlayer, que podrá contener un Cd.
 * El CdPlayer podrá ser encendido (método play) para reproducir el Cd
 * (simularemos que se está reproduciendo simplemente haciendo que play devuelva el título del disco introducido)
 * */

public class CdPlayer {

    boolean power;
    Cd cd;

    public CdPlayer(Cd cd){
        this.cd = cd;
        this.power = false;
    }

    public CdPlayer(){
        this.power = false;
        this.cd = null;

    }

    public void encender(){
        if (power){
            System.out.println("El reproductor ya esta encendido!");
        } else {
            this.power = true;
            System.out.println("Se ha encendido el reproductor :)");
        }
    }

    public void apagar(){
        if (power){
            System.out.println("El reproductor ya esta apagado!");
        } else {
            this.power = true;
            System.out.println("Se ha apagado el reproductor :(");
        }
    }

    public void insertarCd(Cd cd){
        if (power) {
            this.cd = cd;
            System.out.println("Se ha insertado el CD " + cd.getTitle());
        } else {
            System.out.println("Hay que encerder antes el reproductor");
        }
    }

    public void retirarCd(){
        if (power) {
            if (this.cd == null) {
                System.out.println("No hay ningun CD insertado!");
            } else {
                this.cd = null;
                System.out.println("Se ha extraido el CD");
            }
        } else {
            System.out.println("Hay que enceder antes el reproductor");
        }
    }

    public String play(){
    if (power) {
        if (cd == null) {
            System.out.println("Reproduciendo el CD : " + cd.getTitle());
            return cd.getTitle();
        } else {
            System.out.println("No hay ningun CD insertado!");
        }
    } else {
        System.out.println("Hay que encender antes el reproductor");
    }

    return " -- Error, no hay ningun CD -- ";

    }

    @Override
    public String toString() {
        String text = "El reproductor esta ";

        if (power){
            text += "encendido";
        } else {
            text += "apagado";
        }

        if (cd != null){
            text += ", tiene un cd que es: " + cd.getTitle();
        } else {
            text += ", no tiene ningun cd insertado.";
        }

        System.out.println(text);

        return text;
    }
}
