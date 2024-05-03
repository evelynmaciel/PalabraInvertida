class PalabraInversa{
    private String palabra, palabraInver;

    public String invertir(){

        palabraInver = new StringBuilder(palabra).reverse().toString();

        return palabraInver;

    }

    public void mostrarRes(){

        System.out.println(palabraInver);
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabraInver() {
        return palabraInver;
    }

    public void setPalabraInver(String palabraInver) {
        this.palabraInver = palabraInver;
    }

    @Override
    public String toString() {
        return "palabraInver [palabra=" + palabra + ", palabraInver=" + palabraInver + "]";
    }

}
