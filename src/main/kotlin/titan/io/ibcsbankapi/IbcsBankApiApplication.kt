package titan.io.ibcsbankapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IbcsBankApiApplication

fun main(args: Array<String>) {
    runApplication<IbcsBankApiApplication>(*args)
}