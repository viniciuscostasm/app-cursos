/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.cimatec.acad.mapeamento;

import java.io.Serializable;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author andre
 */
@Entity
@Table(name = "elemento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Elemento.findAll", query = "SELECT e FROM Elemento e")})
public class Elemento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "elemento_id")
    private Integer elementoId;
    @Size(max = 200)
    @Column(name = "elemento_titulo")
    private String elementoTitulo;
    @Size(max = 1000)
    @Column(name = "elemento_descricao")
    private String elementoDescricao;
    @Size(max = 1000)
    @Column(name = "elemento_caminhoarqpdf")
    private String elementoCaminhoarqpdf;
    @JoinColumn(name = "elemento_curso_id", referencedColumnName = "curso_id")
    @ManyToOne
    private Curso elementoCursoId;
    
    public Elemento() {
    }

    public Elemento(Integer elementoId) {
        this.elementoId = elementoId;
    }

    public Integer getElementoId() {
        return elementoId;
    }

    public void setElementoId(Integer elementoId) {
        this.elementoId = elementoId;
    }

    public String getElementoTitulo() {
        return elementoTitulo;
    }

    public void setElementoTitulo(String elementoTitulo) {
        this.elementoTitulo = elementoTitulo;
    }

    public String getElementoDescricao() {
        return elementoDescricao;
    }

    public void setElementoDescricao(String elementoDescricao) {
        this.elementoDescricao = elementoDescricao;
    }

    public String getElementoCaminhoarqpdf() {
        return elementoCaminhoarqpdf;
    }

    public void setElementoCaminhoarqpdf(String elementoCaminhoarqpdf) {
        this.elementoCaminhoarqpdf = elementoCaminhoarqpdf;
    }

    public Curso getElementoCursoId() {
        return elementoCursoId;
    }

    public void setElementoCursoId(Curso elementoCursoId) {
        this.elementoCursoId = elementoCursoId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.elementoId);
        hash = 37 * hash + Objects.hashCode(this.elementoTitulo);
        hash = 37 * hash + Objects.hashCode(this.elementoDescricao);
        hash = 37 * hash + Objects.hashCode(this.elementoCaminhoarqpdf);
        hash = 37 * hash + Objects.hashCode(this.elementoCursoId);
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
        final Elemento other = (Elemento) obj;
        if (!Objects.equals(this.elementoTitulo, other.elementoTitulo)) {
            return false;
        }
        if (!Objects.equals(this.elementoDescricao, other.elementoDescricao)) {
            return false;
        }
        if (!Objects.equals(this.elementoCaminhoarqpdf, other.elementoCaminhoarqpdf)) {
            return false;
        }
        if (!Objects.equals(this.elementoId, other.elementoId)) {
            return false;
        }
        if (!Objects.equals(this.elementoCursoId, other.elementoCursoId)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "br.ba.cimatec.acad.mapeamento.Elemento[ elementoId=" + elementoId + " ]";
    }
    
}
