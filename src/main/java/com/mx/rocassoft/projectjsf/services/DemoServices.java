/**
 * 
 */
package com.mx.rocassoft.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.mx.rocassoft.projectjsf.entity.Demo;

/**
 * Clase para la logica de negocio demo, 
 * @author ROCASS
 * 
 */
public class DemoServices {
	
	/**
	 * Metodo que permite consulta de tabla demo
	 * @return {@link Demo} lista demo
	 * 
	 */
	public List<Demo> consultarDemo(){
		//Genera lista demo para pruebas.
		List<Demo> demo = new ArrayList<Demo>();
		Demo demoIBM = new Demo();
		Demo demoMicrosoft = new Demo();
		Demo demoApple = new Demo();
		
		demoIBM.setNombre("Memo");
		demoIBM.setEmail("memo@jmail.com");
		demoIBM.setRfc("ASDE65123");
		
		demoMicrosoft.setNombre("Ricardo");
		demoMicrosoft.setEmail("ricardo@jmail.com");
		demoMicrosoft.setRfc("ASDE895642");
		
		demoApple.setNombre("Roberto");
		demoApple.setEmail("roberto@jmail.com");
		demoApple.setRfc("ASDE23654");
		
		demo.add(demoApple);
		demo.add(demoMicrosoft);
		demo.add(demoIBM);
		
		
		return demo;
	}
}
