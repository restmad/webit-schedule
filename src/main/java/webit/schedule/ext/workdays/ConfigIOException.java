// Copyright (c) 2013, Webit Team. All Rights Reserved.
package webit.schedule.ext.workdays;

/**
 * Config IOException
 *
 * @author Zqq
 */
public class ConfigIOException extends RuntimeException {

    public ConfigIOException() {
    }

    public ConfigIOException(String message) {
        super(message);
    }

    public ConfigIOException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConfigIOException(Throwable cause) {
        super(cause);
    }

    public ConfigIOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
