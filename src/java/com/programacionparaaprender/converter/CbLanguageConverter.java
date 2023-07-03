package com.programacionparaaprender.converter;

import com.programacionparaaprender.jpa.CbLanguage;
import com.programacionparaaprender.facade.CbLanguageFacade;
import com.programacionparaaprender.controller.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.convert.FacesConverter;
import javax.enterprise.inject.spi.CDI;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

@FacesConverter(value = "cbLanguageConverter")
public class CbLanguageConverter implements Converter {

    private CbLanguageFacade ejbFacade;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.getEjbFacade().find(getKey(value));
    }

    java.lang.String getKey(String value) {
        java.lang.String key;
        key = value;
        return key;
    }

    String getStringKey(java.lang.String value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value);
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof CbLanguage) {
            CbLanguage o = (CbLanguage) object;
            return getStringKey(o.getIdlanguage());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), CbLanguage.class.getName()});
            return null;
        }
    }

    private CbLanguageFacade getEjbFacade() {
        this.ejbFacade = CDI.current().select(CbLanguageFacade.class).get();
        return this.ejbFacade;
    }
}
