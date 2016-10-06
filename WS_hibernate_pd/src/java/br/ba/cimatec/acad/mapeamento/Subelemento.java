/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.cimatec.acad.mapeamento;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author andre
 */
@Entity
@Table(name = "subelemento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subelemento.findAll", query = "SELECT s FROM Subelemento s")})
public class Subelemento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "subelemento_id")
    private Integer subelementoId;
    @Size(max = 200)
    @Column(name = "subelemento_titulo")
    private String subelementoTitulo;
    @Size(max = 1000)
    @Column(name = "subelemento_descricao")
    private String subelementoDescricao;
    @Size(max = 1000)
    @Column(name = "subelemento_caminhoarqpdf")
    private String subelementoCaminhoarqpdf;
    @JoinColumn(name = "subelemento_elemento_id", referencedColumnName = "elemento_id")
    @ManyToOne
    private Elemento subelementoElementoId;

    public Subelemento() {
    }

    public Subelemento(Integer subelementoId) {
        this.subelementoId = subelementoId;
    }

    public Integer getSubelementoId() {
        return subelementoId;
    }

    public void setSubelementoId(Integer subelementoId) {
        this.subelementoId = subelementoId;
    }

    public String getSubelementoTitulo() {
        return subelementoTitulo;
    }

    public void setSubelementoTitulo(String subelementoTitulo) {
        this.subelementoTitulo = subelementoTitulo;
    }

    public String getSubelementoDescricao() {
        return subelementoDescricao;
    }

    public void setSubelementoDescricao(String subelementoDescricao) {
        this.subelementoDescricao = subelementoDescricao;
    }

    public String getSubelementoCaminhoarqpdf() {
        return subelementoCaminhoarqpdf;
    }

    public void setSubelementoCaminhoarqpdf(String subelementoCaminhoarqpdf) {
        this.subelementoCaminhoarqpdf = subelementoCaminhoarqpdf;
    }

    public Elemento getSubelementoElementoId() {
        return subelementoElementoId;
    }

    public void setSubelementoElementoId(Elemento subelementoElementoId) {
        this.subelementoElementoId = subelementoElementoId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.subelementoId);
        hash = 71 * hash + Objects.hashCode(this.subelementoTitulo);
        hash = 71 * hash + Objects.hashCode(this.subelementoDescricao);
        hash = 71 * hash + Objects.hashCode(this.subelementoCaminhoarqpdf);
        hash = 71 * hash + Objects.hashCode(this.subelementoElementoId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Subelemento other = (Subelemento) obj;
        if (!Objects.equals(this.subelementoTitulo, other.subelementoTitulo)) {
            return false;
        }
        if (!Objects.equals(this.subelementoDescricao, other.subelementoDescricao)) {
            return false;
        }
        if (!Objects.equals(this.subelementoCaminhoarqpdf, other.subelementoCaminhoarqpdf)) {
            return false;
        }
        if (!Objects.equals(this.subelementoId, other.subelementoId)) {
            return false;
        }
        if (!Objects.equals(this.subelementoElementoId, other.subelementoElementoId)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "br.ba.cimatec.acad.mapeamento.Subelemento[ subelementoId=" + subelementoId + " ]";
    }
    
}
