public int getDato() {   //se crea el get y el set 
        return dato;  // se retorna el dato
    }
public void setDato(int dato) { 
        this.dato = dato;
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
