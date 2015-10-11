package alchemy.repository;

import alchemy.model.Transfer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mbranca on 10/10/15.
 */
public interface TransferRepository extends CrudRepository<Transfer, Long>{

    public Iterable<Transfer> findBySourceIdOrDestinationId(
            final Long sourceAccountId,
            final Long destinationAccountId);
}
