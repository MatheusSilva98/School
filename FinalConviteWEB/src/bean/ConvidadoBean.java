package bean;

import java.io.IOException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import dao.ConvidadoDAO;
import entidades.Convidado;

@ManagedBean(name = "convidadoBean")
@SessionScoped
public class ConvidadoBean {

	private Convidado convidado;

	public ConvidadoBean(){

		this.convidado = new Convidado();

	}

	public List<Convidado> getCandidatos() {

		return new ConvidadoDAO().getAll();	

	}

	public void inserir() throws IOException{

		ConvidadoDAO convidadoDAO = new ConvidadoDAO();
		convidadoDAO.insert(convidado);	

		FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml"); 	

	}
	
	//Metodo VerificarCodigo
	
	//Metodo VerificarNome

	public Convidado getConvidado() {
		return convidado;
	}

	public void setConvidado(Convidado convidado) {
		this.convidado = convidado;
	}

}