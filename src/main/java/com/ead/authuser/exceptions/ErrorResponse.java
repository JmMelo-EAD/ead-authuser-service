package com.ead.authuser.exceptions;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponse {

    private int errorCode;
    private String errroMessage;
    private Map<String, String> errorsDetails = new HashMap<>();

    public ErrorResponse(int errorCode, String errroMessage, Map<String, String> errorsDetails) {
        this.errorCode = errorCode;
        this.errroMessage = errroMessage;
        this.errorsDetails = errorsDetails;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrroMessage() {
        return errroMessage;
    }

    public void setErrroMessage(String errroMessage) {
        this.errroMessage = errroMessage;
    }

    public Map<String, String> getErrorsDetails() {
        return errorsDetails;
    }

    public void setErrorsDetails(Map<String, String> errorsDetails) {
        this.errorsDetails = errorsDetails;
    }
}
