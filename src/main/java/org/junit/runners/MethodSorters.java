package org.junit.runners;

import java.lang.reflect.Method;
import java.util.Comparator;

import org.junit.internal.MethodSorter;

/**
 * Sort the methods into a specified execution order.
 * Defines common {@link MethodSorter} implementations.
 */
public enum MethodSorters {
    /** Sorts the test methods by the method name, in lexicographic order */
    NAME_ASCENDING(MethodSorter.NAME_ASCENDING),
    /** the order in which the tests are returned by the JVM, i.e. there is no sorting done */
    JVM(null),
    /** the default value, deterministic, but not predictable */
    DEFAULT(MethodSorter.DEFAULT);
    
    private final Comparator<Method> fComparator;

    private MethodSorters(Comparator<Method> comparator) {
        this.fComparator= comparator;
    }

    public Comparator<Method> getComparator() {
        return fComparator;
    }
}
