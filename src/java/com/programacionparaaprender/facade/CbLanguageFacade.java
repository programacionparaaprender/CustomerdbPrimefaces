/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacionparaaprender.facade;

import com.programacionparaaprender.jpa.CbLanguage;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lacorrea
 */
@Stateless
public class CbLanguageFacade extends AbstractFacade<CbLanguage> {

    @PersistenceContext(unitName = "CustomerdbPrimefacesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CbLanguageFacade() {
        super(CbLanguage.class);
    }
    
}
