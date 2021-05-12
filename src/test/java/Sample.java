import java.util.*;

public class Sample {


    public void esempioMappa() {
        Map<String, Persona> mappa = new HashMap<>();
        mappa.put("RSSMRI", new Persona("Mario", "Rossi", 26));
        mappa.put("ESSLIG", new Persona("Luigi", "Rossi", 32));
        mappa.put("VCCFRZ", new Persona("Fabrizio", "Vecchio", 45));

        Iterator<String> it = mappa.keySet().iterator();
        while (it.hasNext()) {
            String k = it.next();
            System.out.println("K = " + k);
            System.out.println("V = " + mappa.get(k));
        }

        Iterator<Persona> it2 = mappa.values().iterator();
        while (it2.hasNext()) {
            System.out.println("V = " + it2.next());
        }

        mappa.forEach((k, v) -> System.out.println( k + " = " + v));

    }



    public void esempioLista() {
        List<Persona> lista = new LinkedList<>();

        lista.add(new Persona("Mario", "Rossi", 26));
        lista.add(new Persona("Luigi", "Rossi", 35));
        lista.add(new Persona("Luigi", "Rossi", 32));
        lista.add(new Persona("Carlo", "Zappacosta", 48));
        lista.add(new Persona("Fabrizio", "Vecchio", 45));
        lista.add(new Persona("Andrea", "Sguera", 22));

        Comparator<Persona> c1 = (Persona p1, Persona p2) ->
            {return Integer.compare(p1.getEta(), p2.getEta());};

        lista.sort(c1);

        lista.stream().forEach(p -> {
            p.setCognome(p.getCognome().toUpperCase());
            p.setNome(p.getNome().toUpperCase());
            System.out.println(p);
        });

        //lista.stream().forEach(p -> System.out.println(p));
    }

    public static void main(String[] args) {
        Sample s = new Sample();
        s.esempioMappa();
    }
}
