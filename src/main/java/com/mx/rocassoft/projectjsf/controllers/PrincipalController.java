package com.mx.rocassoft.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.mx.rocassoft.projectjsf.entity.Demo;
import com.mx.rocassoft.projectjsf.services.DemoServices;

/**
 * @author ROCASS
 * Clase demo para procesar informacio  para pantalla principal.xhtml
 * 
 */
@ManagedBean
@ViewScoped
public class PrincipalController {
	/**
	 * Servicio con los metodos para la logica de demoServices.
	 */
	private List<Demo> demo;
	
	private DemoServices demoservices = new DemoServices();
	
	/**
	 * Metodo que se encarga de inicializar la informacion de la pantalla principal.
	 */
	@PostConstruct
	public void init() {
		this.consultarDemo();
	}
	
	public void consultarDemo() {
		this.demo = this.demoservices.consultarDemo();
	}
	/**
	 * @return the demo
	 */
	public List<Demo> getDemo() {
		return demo;
	}
	/**
	 * @param demo the demo to set
	 */
	public void setDemo(List<Demo> demo) {
		this.demo = demo;
	}
	
	
}
