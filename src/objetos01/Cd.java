package objetos01;

/**
 * 2- Cread la clase Cd con title y duration.
 * También la clase CdPlayer, que podrá contener un Cd.
 * El CdPlayer podrá ser encendido (método play) para reproducir el Cd
 * (simularemos que se está reproduciendo simplemente haciendo que play devuelva el título del disco introducido)
 * */

public class Cd {

    private String title;

    //Duración del cd en segundos
    private int duration;

    public Cd(String title, int duration){

        this.title = title;
        this.duration = duration;

    }

    public String getTitle() {
        return this.title;
    }
}
