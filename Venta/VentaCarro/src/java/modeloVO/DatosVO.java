package modeloVO;

public class DatosVO {

    private String datId, usuId, datNombre, datApellido, daTipoId, datNumeroId, daTelefono, datCorreo;
    
    public DatosVO(String datId, String usuId, String datNombre, String datApellido, String daTipoId, String datNumeroId, String daTelefono, String datCorreo) {
        this.datId = datId;
        this.usuId = usuId;
        this.datNombre = datNombre;
        this.datApellido = datApellido;
        this.daTipoId = daTipoId;
        this.datNumeroId = datNumeroId;
        this.daTelefono = daTelefono;
        this.datCorreo = datCorreo;
    }

    public String getDatId() {
        return datId;
    }

    public void setDatId(String datId) {
        this.datId = datId;
    }

    public String getUsuId() {
        return usuId;
    }

    public void setUsuId(String usuId) {
        this.usuId = usuId;
    }

    public String getDatNombre() {
        return datNombre;
    }

    public void setDatNombre(String datNombre) {
        this.datNombre = datNombre;
    }

    public String getDatApellido() {
        return datApellido;
    }

    public void setDatApellido(String datApellido) {
        this.datApellido = datApellido;
    }

    public String getDaTipoId() {
        return daTipoId;
    }

    public void setDaTipoId(String daTipoId) {
        this.daTipoId = daTipoId;
    }

    public String getDatNumeroId() {
        return datNumeroId;
    }

    public void setDatNumeroId(String datNumeroId) {
        this.datNumeroId = datNumeroId;
    }

    public String getDaTelefono() {
        return daTelefono;
    }

    public void setDaTelefono(String daTelefono) {
        this.daTelefono = daTelefono;
    }

    public String getDatCorreo() {
        return datCorreo;
    }

    public void setDatCorreo(String datCorreo) {
        this.datCorreo = datCorreo;
    }
    
}
