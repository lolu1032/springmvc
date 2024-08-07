package hello.springmvc.basic.requestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller("/mapping/users")
public class MappingClassController {

    /**
     * GET /mapping/users
     */
    @GetMapping
    public String user() {
        return "get Users";
    }

    /**
     * POST /mapping/users
     */
    @PostMapping
    public String addUser() {
        return "post users";
    }
    /**
     * GET /mapping/users/{userId}
     */
    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId){
        return "get UserId = " + userId;
    }
    /**
     * PATCH /mapping/users/{userId}
     */
    @PatchMapping("/{userId}")
    public String upateUser(@PathVariable String userId) {
        return "update userId = " + userId;
    }
    /**
     * DELETE /mapping/users/{userId}
     */
    @DeleteMapping("{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "delete userId = " + userId;
    }
}
