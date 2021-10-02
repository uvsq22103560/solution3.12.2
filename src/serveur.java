import java.util.ArrayList;
import java.util.ListIterator;

public class serveur {

    private ArrayList <Client> liste;

    public serveur () {
        this.liste=new ArrayList <Client>();
    }

    public boolean connecter (Client c) {
        if(this.liste.add(c)==false) return false;
        return true;
    }

    public void diffuser(String message) {
        ListIterator i=this.liste.listIterator();
        int ii;
        for(ii=0;ii<this.liste.size();ii++) {
            this.liste.get(ii).recevoir(message);
        }
    }

}

