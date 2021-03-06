package com.meidusa.venus.exception;

import com.meidusa.venus.annotations.RemoteException;

@RemoteException(errorCode=VenusExceptionCodeConstant.SERVICE_VERSION_NOT_ALLOWD_EXCEPTION)
public class ServiceVersionNotAllowException extends AbstractVenusException {
    private static final long serialVersionUID = 1L;

    public ServiceVersionNotAllowException(String message) {
        super(message);
    }

    @Override
    public int getErrorCode() {
        return VenusExceptionCodeConstant.SERVICE_VERSION_NOT_ALLOWD_EXCEPTION;
    }

    public ExceptionLevel getLevel() {
        return ExceptionLevel.INFO;
    }
}
