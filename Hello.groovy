@RestController
class Hello {
    @RequestMapping("/")
    String home() {
        [ "Hello World!", "Ahoj svet" ]
    }
}
