package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data;

import jakarta.enterprise.inject.Disposes;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Singleton;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The base of the integration tests of a repository, on the {@value #PERSISTENCE_UNIT_NAME} unit: the
 * {@code FutonManufacturing} database of the SQL Server upstream's {@code compose.sh} brings up on {@code localhost:1433}.
 * <p>
 * The sample data is the fixture. A test reads the rows that are there, and anything it writes it does inside a
 * transaction it rolls back.
 * <p>
 * Run with {@code -Pfailsafe}; see {@code _mvn_verify.sh}.
 *
 * @param <R> the type of the repository under test.
 * @param <T> the type of the entity of the repository.
 * @param <K> the type of the entity's id.
 */
@AddBeanClasses(_Repository_IT.EntityManagerFactoryProducer.class)
public abstract class _Repository_IT<R extends _Repository<T, K>, T, K>
        extends __Repository_TestBase<R, T, K> {

    /**
     * The name of the persistence unit the integration tests run on. The value is {@value}.
     */
    public static final String PERSISTENCE_UNIT_NAME = "futonmanufacturing-it";

    /**
     * Produces the factory of the {@value #PERSISTENCE_UNIT_NAME} unit, and closes it when the container shuts down.
     * <p>
     * {@code @Singleton}, not {@code @ApplicationScoped}: the generated class's {@code unwrap(SessionFactory.class)} on
     * a client proxy throws {@code ClassCastException}.
     */
    static class EntityManagerFactoryProducer {

        @Produces
        @Singleton
        EntityManagerFactory produceEntityManagerFactory() {
            return Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }

        void disposeEntityManagerFactory(@Disposes final EntityManagerFactory entityManagerFactory) {
            entityManagerFactory.close();
        }
    }

    // -----------------------------------------------------------------------------------------------------------------
    /**
     * Creates a new instance for the specified repository and its types.
     *
     * @param repositoryClass the repository under test.
     * @param entityClass     the entity of the repository.
     * @param keyClass        the type of the entity's id.
     */
    protected _Repository_IT(final Class<R> repositoryClass, final Class<T> entityClass, final Class<K> keyClass) {
        super(repositoryClass, entityClass, keyClass);
    }
}
