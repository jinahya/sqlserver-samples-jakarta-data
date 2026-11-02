/**
 * What the Jakarta Data repositories of the {@code AdventureWorks} database share: {@link _Repository}.
 * <p>
 * The repositories themselves live in one {@code data} package per schema, next to the entities of that schema
 * ({@code com.github.jinahya.sqlserver.sample.persistence.adventureworks.<schema>.data}). Each is an interface annotated
 * {@link jakarta.data.repository.Repository @Repository}, named {@code <Entity>Repository}; its implementation, a
 * {@code <Name>_} class in the same package, is generated at compile time by Hibernate Data Repositories and runs on a
 * {@link org.hibernate.StatelessSession}.
 * <p>
 * The package is {@link NullMarked}: every parameter and return type here is non-null unless marked
 * {@code @Nullable}.
 */
@NullMarked
package com.github.jinahya.sqlserver.sample.persistence.adventureworks.data;

import org.jspecify.annotations.NullMarked;
