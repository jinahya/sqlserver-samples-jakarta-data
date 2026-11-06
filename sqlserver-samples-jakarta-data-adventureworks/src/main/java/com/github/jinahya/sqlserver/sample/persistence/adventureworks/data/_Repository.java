package com.github.jinahya.sqlserver.sample.persistence.adventureworks.data;

import jakarta.data.repository.CrudRepository;

/**
 * The base of every repository of an {@code @Entity} of the {@code AdventureWorks} database, for whatever all of them should
 * offer.
 * <p>
 * Jakarta Data needs no counterpart of Spring Data's {@code @NoRepositoryBean}: only an interface annotated
 * {@link jakarta.data.repository.Repository @Repository} gets an implementation, and this one is not annotated.
 * <p>
 * A subinterface must <em>also</em> name {@link CrudRepository} directly, with its concrete types:
 * <pre>{@code
 * @Repository
 * public interface CustomerRepository
 *         extends _Repository<Customer, Integer>,
 *                 CrudRepository<Customer, Integer> {
 * }
 * }</pre>
 * Without that second supertype, {@code hibernate-processor} cannot resolve the entity type of an inherited lifecycle
 * method through a type variable, and fails with "repository does not have a well-defined primary entity type for
 * inherited member 'deleteById'".
 *
 * @param <T> the type of the entity.
 * @param <K> the type of the entity's id; upstream's {@code <Entity>Id} class of an entity with an
 *            {@link jakarta.persistence.IdClass @IdClass} or an {@link jakarta.persistence.EmbeddedId @EmbeddedId}.
 */
public interface _Repository<T, K>
        extends CrudRepository<T, K> {

}
