package com.crud.crud.Controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class GeneralRestController {

    @GetMapping({ "/protected" })
    public String protectedEndpoint() {
        return "Protected Endpoint Response";
    }
}
