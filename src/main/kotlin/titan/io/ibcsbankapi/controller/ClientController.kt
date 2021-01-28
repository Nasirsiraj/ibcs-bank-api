package titan.io.ibcsbankapi.controller

import org.jetbrains.annotations.NotNull
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import titan.io.ibcsbankapi.model.Client
import titan.io.ibcsbankapi.service.ClientService

@Controller
@CrossOrigin(origins = arrayOf("*"), allowedHeaders = arrayOf("*"))
class ClientController {

    @Autowired
    lateinit var clientService: ClientService

    // get all client
    @GetMapping("/clients")
    fun getAllClient(): MutableList<Client>{
        return clientService.getAllClient()
    }
    // get client by id
    @GetMapping("/client/{id}")
    fun getClientById(@PathVariable @NotNull id: Int): Client?{
        return clientService.getClientById(id)
    }
    // post all client
    @PostMapping("/clients")
    fun postAllClient(@RequestBody clientList: MutableList<Client>): MutableList<Client>{
        return clientService.postAllClient(clientList)
    }
    // post one client
    @PostMapping("/client")
    fun postOneClient(@RequestBody client: Client): Client{
        return clientService.postOneClient(client)
    }
    // delete client by id
    @DeleteMapping("/client/{id}")
    fun deleteClientById(@PathVariable @NotNull id: Int): String{
        return clientService.deleteClientById(id)
    }
    // delete client by obj
    @DeleteMapping("/client")
    fun deleteClientByObj(@RequestBody @NotNull client: Client): String{
        return clientService.deleteClientByObj(client)
    }
    // update client by obj
    fun updateClientByObj(@RequestBody @NotNull client: Client): Client?{
        return clientService.updateClientByObj(client)
    }
}
