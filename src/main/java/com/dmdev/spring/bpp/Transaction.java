package com.dmdev.spring.bpp;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Для всех классов помеченных @Transaction будет перед вызовом метода открываться транзакция,
 * далее будет выполняться вызванный метод, и по его завершению будет закрываться транзакция.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Transaction {
}
