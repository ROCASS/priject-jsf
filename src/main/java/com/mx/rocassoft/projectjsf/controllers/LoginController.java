/**
 * 
 */
package com.mx.rocassoft.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;

/**
 * @author rocassoft 
 * Clase que permite controlar el funcionamiento con la pantalla de login.xhtml
 *
 */

@ManagedBean(name="loginConnect")
public class LoginController {
	
	/**
	 * @return usuario que ingresa en el login.
	 */
	private String usuario;
	private String password;
	
	
	public void ingresar() {
		
		if (usuario.equals("demo") && password.equals("demo")) {
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				FacesContext.getCurrentInstance().addMessage("formLogin.txtusuario", new FacesMessage(
						FacesMessage.SEVERITY_FATAL, "La página no existe", ""));
				e.printStackTrace();
			}
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin.txtusuario", new FacesMessage(
					FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña incorrecto", ""));
		}
	}
	


	
	private void redireccionar (String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
	
	
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	
}
