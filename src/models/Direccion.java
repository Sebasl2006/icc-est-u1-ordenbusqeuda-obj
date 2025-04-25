package models;

public class Direccion {
    private String calle;
    private String ciudad;
    private String estado;
    private int codigo;

    public Direccion(String calle, String ciudad, String estado, int codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigo = codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigoPostal() {
        return codigo;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigo = codigoPostal;
    }

    
}
