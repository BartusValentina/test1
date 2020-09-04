package obiecte;

public class Main {
    public static void main(String[] args) {
        Cantec c1 = new Cantec();
        c1.nume= "Symphony1";
        Cantec c2 = new Cantec();
        c2.nume= "Symphony2";

        NotaMuzicala n1 = new NotaMuzicala();
        n1.durata= DurataNotaMuzicala.NOTA_INTREAGA;
        n1.inaltime= InaltimeNotaMuzicala.SOL;

    }
}
