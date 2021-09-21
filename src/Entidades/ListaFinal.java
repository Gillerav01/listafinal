package Entidades;

public class ListaFinal {
    private Nodo prim;
    private Nodo fin;
    
    /* TODO BorrarPrimero, Borrar*/

    public ListaFinal() {
        this.prim = null;
        this.fin = null;
    }

    public Nodo getPrim() {
        return prim;
    }

    public void setPrim(Nodo prim) {
        this.prim = prim;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }
    
    public boolean esVacia() {
        return this.prim == null && this.fin == null;
    }
    
    public void add (int x){
        Nodo nuevo = new Nodo(x, null);
        
        if (this.esVacia()) {
            prim = nuevo;
            fin = nuevo;
        } else {
            fin = prim;
            nuevo.setSig(prim);
            prim = nuevo;
        }
    }
    
    public void addFin (int x){
        Nodo nuevo = new Nodo(x, null);
        if (this.esVacia()) {
            prim = nuevo;
            fin = nuevo;
        } else {
            fin.setSig(nuevo);
            fin = nuevo;
        }
    }
    
    public void leer () {
        Nodo aux = prim;

        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getSig();
        }
    }
    
    public boolean borrar (int x) {
        boolean encontrado = false;
        Nodo aux = prim;
        
            while (aux.getSig() != null) {
                
                if ( aux.getInfo() == x){
                    encontrado = true;
                }
                aux = aux.getSig();
            }
        
        return encontrado;
    }
    
    public boolean borrarPrimero () {
        boolean encontrado = false;
        
            
        
        return encontrado;
    }
    
    
}
