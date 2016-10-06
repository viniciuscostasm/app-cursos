/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.cimatec.acad.ws;

import br.ba.cimatec.acad.mapeamento.Curso;
import br.ba.cimatec.acad.mapeamento.Elemento;
import br.ba.cimatec.acad.mapeamento.Subelemento;
import br.ba.cimatec.acad.rn.CursoRN;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author andre
 */
@Path("cursows")
public class CursoWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CursoWS
     */
    public CursoWS() {
    }

    /**
     * Retrieves representation of an instance of br.ba.cimatec.acad.ws.CursoWS
     * @return an instance of java.lang.String
     */
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Curso> obtercursos() {
        //TODO return proper representation object
        CursoRN rnc = new CursoRN();
        List<Curso> cursos = rnc.listarTodosCursos();
        return cursos;
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/obterElementosporCurso")
    public List<Elemento> obterElementosporcurso(@QueryParam("idcurso") Integer idcurso) {
        //TODO return proper representation object
        CursoRN rnc = new CursoRN();
        List<Elemento> elementos = rnc.listarElementosPorCurso(idcurso);
        return elementos;
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/obterSubElementosporCurso")
    public List<Subelemento> obterSubelementosporCurso(@QueryParam("idcurso") Integer idcurso) {
        //TODO return proper representation object
        CursoRN rnc = new CursoRN();
        List<Subelemento> subelementos = rnc.listarSubElementosPorCurso(idcurso);
        return subelementos;
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/obterSubElementosporElemento")
    public List<Subelemento> obterSubelementosporElemento(@QueryParam("idelemento") Integer idelemento) {
        //TODO return proper representation object
        CursoRN rnc = new CursoRN();
        List<Subelemento> subelementos = rnc.listarSubElementosPorElemento(idelemento);
        return subelementos;
    }
    
    

}
