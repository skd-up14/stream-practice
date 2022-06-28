/**
 * 
 */
package com.souvik.streams;

/**
 * @author Souvik_Das
 *
 */
@FunctionalInterface
public interface TriFunction<T, U, S, R> {

	R apply(T t, U u, S s);

}
