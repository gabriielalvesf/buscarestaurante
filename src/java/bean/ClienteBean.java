/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import control.Cliente;
import control.Endereco;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author gabrielalves
 */
@ManagedBean
@RequestScoped
public class ClienteBean {
    
    private Cliente cliente = new Cliente();

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
       
    private Endereco endereco = new Endereco();
    
    public ClienteBean() {
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
    public void salvar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("buscaRestaurantePU");
        EntityManager em = emf.createEntityManager();
        
        this.cliente.addEndereco(endereco);
        
        em.getTransaction().begin();
        em.persist(this.cliente);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
