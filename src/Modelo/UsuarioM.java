
package Modelo;

public class UsuarioM {

    int idU;
    String nombre;
    String usuario;
    String clave;
    String perfil;
    String estado;
    
      public UsuarioM(){
     }
      
     public UsuarioM(int idU, String nombre, String usuario, String clave, String perfil, String estado) {
        this.idU = idU;
        this.nombre = nombre;
        this.usuario = usuario;
        this.clave = clave;
        this.perfil = perfil;
        this.estado=estado;
    }
   
    public int getIdU() {
        return idU;
    }

    public void setIdU(int idU) {
        this.idU = idU;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
     
      public String getEstado() {
        return perfil;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
