package org.ld.com.mapper;

import org.ld.com.model.AccountModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 继承第一个参数为实体类，第二个为主键类型
 * 1.当我们继承JpaRepository接口后，我们就自动具备了如下数据访问方法：
 * List<T> findAll();
 * List<T> findAll(Sort var1);
 * List<T> findAll(Iterable<ID> var1);
 * <S extends T> List<S> save(Iterable<S> var1);
 * void flush();
 * <S extends T> S saveAndFlush(S var1);
 * void deleteInBatch(Iterable<T> var1);
 * void deleteAllInBatch();
 * T getOne(ID var1);
 * <S extends T> List<S> findAll(Example<S> var1);
 * <S extends T> List<S> findAll(Example<S> var1, Sort var2);
 */
public interface AccountMapper extends JpaRepository<AccountModel, String> {

}
