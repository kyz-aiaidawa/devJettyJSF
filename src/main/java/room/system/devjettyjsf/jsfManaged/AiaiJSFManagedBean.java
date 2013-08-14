/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package room.system.devjettyjsf.jsfManaged;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;
import javax.inject.Named;

/**
 *
 * @author lisa
 */
@Named(value = "aiaiJSFManagedBean")
@RequestScoped
public class AiaiJSFManagedBean implements Serializable{
 
    /**
     * Creates a new instance of AiaiJSFManagedBean
     */
    public AiaiJSFManagedBean() {
    }

    public String getMes() {
     FacesContext fc = FacesContext.getCurrentInstance();
        String implementationTitle = fc.getClass().getPackage().getImplementationTitle();
        String implementationVersion = fc.getClass().getPackage().getImplementationVersion();
        return "  "  + implementationTitle  + " " + implementationVersion ;
    }
    @PostConstruct
	public void postConstruct() {
        
                System.out.println("postConstruct()" );
	}
}
