package myFirstSrpingKotlinApp.Controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/show")
class ExampleController {

    @GetMapping("/show")
    fun show(text: String) = text

}