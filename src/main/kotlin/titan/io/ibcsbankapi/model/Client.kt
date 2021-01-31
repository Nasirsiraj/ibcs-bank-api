package titan.io.ibcsbankapi.model

import javax.persistence.*

@Entity
@Table(name="client")
class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0
    var name: String = ""
    var nid: Int = 0
    var address: String = ""
    var age: Int = 0
    var gender: String = ""
    var email: String = ""
    var password: String = ""
}