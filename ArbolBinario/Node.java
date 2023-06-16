public int getDato() {   //se crea el get para acceder a los datos 
        return dato;  // se retorna el dato
    }
public void setDato(int dato) { // se crea el set para acceder a los datos
        this.dato = dato;  // se le asigna el dato a la clase
    }
public Node getIzquierdo() { 
        return izquierdo; 
    }
public void setIzquierdo(Node izquierdo) { 
       this.izquierdo = izquierdo; 
    }
 public Node getDerecho() {  // se crea el get y el set para poder acceder a los datos de la clase
        return derecho; // se retorna el dato
    }
  public void setDerecho(Node derecho) {  
        this.derecho = derecho; 
    }
 public String toString(){  // toString ayueda a acceder los datos de la clase
        return "Aqui se presenta el preorden, inorden y el posorden   ";
    }
