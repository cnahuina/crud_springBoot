package com.csti.capacitacion.util;

import java.util.ArrayList;
import java.util.List;

public class PortalException extends RuntimeException{

    private String message;

    private List<Error> details;

    public PortalException(String message) {
        this.message = message;
        details = new ArrayList<>();
    }

    public PortalException(String message, List<Error> details) {
        this.message = message;
        this.details = details;
    }

//    public void addDetail(String field, String message){
//        this.details.add(new Error(field, message));
//    }

    public String getMessage() {
        return message;
    }

    public List<Error>  getDetails(){
        return this.details;
    }
}
