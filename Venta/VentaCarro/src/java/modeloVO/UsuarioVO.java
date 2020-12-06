
package modeloVO;

public class UsuarioVO {
    
    private String usuId, usuLogin, usuPassword;

    public UsuarioVO() {
    }

    public UsuarioVO(String usuId, String usuLogin, String usuPassword) {
        this.usuId = usuId;
        this.usuLogin = usuLogin;
        this.usuPassword = usuPassword;
    }

  
    public UsuarioVO(String usuLogin) {
         //To change body of generated methods, choose Tools | Templates.
    }

    public UsuarioVO(String string, String string0) {
         //To change body of generated methods, choose Tools | Templates.
    }

    public String getUsuId() {
        return usuId;
    }

    public void setUsuId(String usuId) {
        this.usuId = usuId;
    }

    public String getUsuLogin() {
        return usuLogin;
    }

    public void setUsuLogin(String usuLogin) {
        this.usuLogin = usuLogin;
    }

    public String getUsuPassword() {
        return usuPassword;
    }

    public void setUsuPassword(String usuPassword) {
        this.usuPassword = usuPassword;
    }
    
    
}
