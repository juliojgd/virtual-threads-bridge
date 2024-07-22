package io.github.thunkware.vt.bridge;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;

/**
 * Executor that limits concurrency to a number of sempahore permits
 *
 * @deprecated Because of a typo in class name
 */
@Deprecated(forRemoval = true, since = "0.0.5")
public class SempahoreExecutor extends SemaphoreExecutor {

    public SempahoreExecutor(ExecutorService delegate, int permits) {
        this(delegate, new Semaphore(permits, true));
    }

    public SempahoreExecutor(ExecutorService delegate, Semaphore semaphore) {
        super(delegate, semaphore);
    }

}