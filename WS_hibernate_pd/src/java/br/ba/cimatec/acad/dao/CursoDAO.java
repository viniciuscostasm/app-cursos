/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.cimatec.acad.dao;

import br.ba.cimatec.acad.mapeamento.Curso;
import br.ba.cimatec.acad.mapeamento.Elemento;
import br.ba.cimatec.acad.mapeamento.Subelemento;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author andre
 */
public class CursoDAO implements CursoDAOListener {
    private Session sessao;
    
    public void setSessao(Session sessao) {
        this.sessao = sessao;
    }
    
    @Override
    public List<Curso> listarTodosCursos() {
        List<Curso> lista = this.sessao.createCriteria(Curso.class).list();
        this.sessao.close();
        return lista;
    }
    
    
    @Override
    public Curso consultarCursoPorID(Integer id) {
        
        Curso a = (Curso) this.sessao.get(Curso.class, id);
        this.sessao.close();
        return a;
        
        
    }

   @Override
   public List<Elemento> listarElementosPorCurso(Integer idcurso) {
        String hql = "select t from Elemento t where t.elementoCursoId.cursoId = :idcurso";
        Query consulta = this.sessao.createQuery(hql);
        consulta.setInteger("idcurso", idcurso);
        
        List<Elemento> lista = (List<Elemento>) consulta.list();
        this.sessao.close();
        return lista;

    }
   
    @Override
   public List<Subelemento> listarSubElementosPorCurso(Integer idcurso) {
        String hql = "select t from Subelemento t where t.subelementoElementoId.elementoCursoId.cursoId = :idcurso";
        Query consulta = this.sessao.createQuery(hql);
        consulta.setInteger("idcurso", idcurso);
        
        List<Subelemento> lista = (List<Subelemento>) consulta.list();
        this.sessao.close();
        return lista;

    }
   
    @Override
   public List<Subelemento> listarSubElementosPorElemento(Integer idelemento) {
        String hql = "select t from Subelemento t where t.subelementoElementoId.elementoId = :idelemento";
        Query consulta = this.sessao.createQuery(hql);
        consulta.setInteger("idelemento", idelemento);
        
        List<Subelemento> lista = (List<Subelemento>) consulta.list();
        this.sessao.close();
        return lista;

    }
    

    
}
