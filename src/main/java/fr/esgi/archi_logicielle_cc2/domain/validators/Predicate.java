package fr.esgi.archi_logicielle_cc2.domain.validators;

public interface Predicate<T> {

    boolean validate(T entity);
}
