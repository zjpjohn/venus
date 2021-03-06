/**
 * 
 */
package com.meidusa.venus.exception;

import com.meidusa.venus.annotations.RemoteException;

/**
 * 
 * 
 * @author Sun Ning
 * @since 2010-3-16
 */
@RemoteException(errorCode=VenusExceptionCodeConstant.SERVICE_UNAVAILABLE_EXCEPTION)
public class InvocationAbortedException extends AbstractVenusException {
    private static final long serialVersionUID = 1L;

    public InvocationAbortedException(String msg) {
        super("InvocationAbortedException:" + msg);
    }

    @Override
    public int getErrorCode() {
        return VenusExceptionCodeConstant.SERVICE_UNAVAILABLE_EXCEPTION;
    }
}
