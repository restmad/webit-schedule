// Copyright (c) 2013, Webit Team. All Rights Reserved.
package webit.schedule.core;

/**
 * Invalid cron exception.
 *
 * @author zqq90
 */
public class InvalidCronException extends RuntimeException {

    public InvalidCronException(String message) {
        super(message);
    }
}
