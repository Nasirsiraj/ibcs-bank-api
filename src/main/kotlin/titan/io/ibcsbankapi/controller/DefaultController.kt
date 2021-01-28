package titan.io.ibcsbankapi.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping

@Controller
@CrossOrigin(origins = arrayOf("*"), allowedHeaders = arrayOf("*"))
class DefaultController {
    @GetMapping("/")
    fun getDefaultPage(): String{
        return "index.html"
    }
}