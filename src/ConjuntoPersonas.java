import java.util.Iterator;

public class ConjuntoPersonas  implements Iterable<Persona>{
    public Persona[] conjuntoPersonas;

    public ConjuntoPersonas(Persona[]p){
        conjuntoPersonas = p;
    }

    public Iterator<Persona> iterator(){
        Iterator it = new MiIteratorPersona();
        return it;
    }
    protected class MiIteratorPersona implements Iterator<Persona>{
        protected int posicionArray;

        public MiIteratorPersona(){
            posicionArray = 0;
        }

        public boolean hasNext(){
            boolean result;
            if (posicionArray < conjuntoPersonas.length){
                result = true;
            }else {
                result = false;
            }
            return result;
        }

        public Persona next(){
            posicionArray++;
            return conjuntoPersonas[posicionArray-1];
        }

        public void remove(){
            throw new UnsupportedOperationException("No soportado.");
        }
    }
}
