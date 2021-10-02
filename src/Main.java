public class Main {
    public static void main(String[] args) {
        Client c1=new Client("Yacine");
        Client c2=new Client("MANSOUR");
        serveur s=new serveur();
        c1.seConnecter(s);
        c2.seConnecter(s);
        c1.envoyer("Bonjour");
    }
}