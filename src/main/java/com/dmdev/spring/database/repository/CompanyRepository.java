package com.dmdev.spring.database.repository;

import com.dmdev.spring.bpp.Auditing;
import com.dmdev.spring.bpp.Transaction;
import com.dmdev.spring.database.entity.Company;
import com.dmdev.spring.database.pool.ConnectionPool;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Repository
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Transaction
@Auditing
@RequiredArgsConstructor
public class CompanyRepository implements CrudRepository<Integer, Company> {

    private final ConnectionPool pool1;
    private final List<ConnectionPool> pools;
    @Value("${db.pool.size}")
    private final Integer poolSize;

    @PostConstruct
    private void init() {
        log.warn("CompanyRepository init");
    }

    @Override
    public Optional<Company> findById(Integer id) {
        log.warn("Find Company by id: " + id);
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company entity) {
        log.warn("Delete Company: " + entity);
    }
}
