package titan.io.ibcsbankapi.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import titan.io.ibcsbankapi.model.Client

@Repository
interface ClientRepository: JpaRepository<Client, Int> {

}
