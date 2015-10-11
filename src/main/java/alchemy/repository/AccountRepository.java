package alchemy.repository;

import alchemy.model.Account;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mbranca on 10/10/15.
 */
public interface AccountRepository extends CrudRepository<Account, Long> {

}
