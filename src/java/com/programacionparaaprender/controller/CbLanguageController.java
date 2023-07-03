package com.programacionparaaprender.controller;

import com.programacionparaaprender.jpa.CbLanguage;
import com.programacionparaaprender.facade.CbLanguageFacade;
import com.programacionparaaprender.controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "cbLanguageController")
@ViewScoped
public class CbLanguageController extends AbstractController<CbLanguage> {

    @Inject
    private MobilePageController mobilePageController;

    public CbLanguageController() {
        // Inform the Abstract parent controller of the concrete CbLanguage Entity
        super(CbLanguage.class);
    }

}
