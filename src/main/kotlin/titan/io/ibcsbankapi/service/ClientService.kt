package titan.io.ibcsbankapi.service

import org.jetbrains.annotations.NotNull
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import titan.io.ibcsbankapi.model.Client
import titan.io.ibcsbankapi.repository.ClientRepository

@Service
class ClientService {

    @Autowired
    lateinit var clientRepository: ClientRepository

    // get all client
    fun getAllClient(): MutableList<Client> {
        return clientRepository.findAll()
    }
    // get client by id
    fun getClientById(@NotNull id: Int): Client?{
        return clientRepository.findById(id).orElse(null)
    }
    // get client by nid
    fun getClientByNid(@NotNull nid: Int): Client?{
        return clientRepository.findByNid(nid)
    }
    // post all client
    fun postAllClient(@NotNull clientList: List<Client>): MutableList<Client>{
        return clientRepository.saveAll(clientList)
    }
    // post one client
    fun postOneClient(@NotNull client: Client): Client{
        return clientRepository.save(client)
    }
    // delete one client by id
    fun deleteClientById(@NotNull id: Int): String{
        val client_: Client?  = clientRepository.findById(id).orElse(null)

        return if(client_ == null){
            "client not found, id: ${id}"
        }else{
            clientRepository.deleteById(id)
            "client deleted, id: ${id}"
        }
    }
    // delete one client by obj
    fun deleteClientByObj(@NotNull client: Client): String{
        val client_: Client? = clientRepository.findById(client.id).orElse(null)
        return if(client_ == null){
            "client not found ${client.id}"
        }else{
            clientRepository.delete(client)
            "client deleted, id: ${client.id}"
        }
    }
    // update one client by obj
    fun updateClientByObj(@NotNull client: Client): Client?{
        val client_ : Client?= clientRepository.findById(client.id).orElse(null)
        return if(client_ == null){
            null
        }else{
            client_.name = client.name
            client_.nid = client.nid
            client_.address = client.address
            client_.age = client.age
            client_.gender = client.gender
            client_.email = client.email
            client_.password = client.password
            client_.balance = client.balance

            clientRepository.save(client_)
        }
    }

}