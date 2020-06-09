package reproductor;

//para busqueda de la ruta
import java.io.File;
//para los metodos de la reproduccion
import javazoom.jlgui.basicplayer.BasicPlayer;


public class Reproductor {
    //metodo de la libreria basick player que declara abajo como objeto 
    public BasicPlayer player;
    
    public Reproductor() {
        player = new BasicPlayer();
    }
public void coge(String y){

}
    //metodos para reproducir,pausar,detener y continuar por medio del objeto de la clase basick player
    public void Play() throws Exception {
        player.play();
    }
    
    public void AbrirFichero(String ruta) throws Exception {
        player.open(new File(ruta));
        player.play();
    }

    public void Pausa() throws Exception {
        player.pause();
    }

    public void Continuar() throws Exception {
        player.resume();
    }

    public void Stop() throws Exception {
        player.stop();
    }
    //metodo que nos marcara error si no esta la ruta correcamente 
/*    public void reproducemp3 () throws Exception{//throws exception es una clase la cual hara excepciones 
       try {
        Reproductor   mi_reproductor = new Reproductor();
            mi_reproductor.AbrirFichero("/F:/reproductor/HappierCDC´s.mp3");
            mi_reproductor.Play();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }*/
    public static void main(String args[]) throws Exception{
     Reproductor y = new Reproductor();
     Ventana vent=new Ventana();
     vent.setVisible(true);
     vent.setTitle("Reproductor");
     
    }
}