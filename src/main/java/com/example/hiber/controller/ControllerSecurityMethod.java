package com.example.hiber.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class ControllerSecurityMethod {

        @GetMapping("/read")
        @Secured({"ROLE_read"})
        public String read() {
            return "READ";
        }

        @GetMapping("/write")
        @RolesAllowed({"ROLE_write"})
        public String write() {
            return "WRITE";
        }

        @GetMapping("/delete")
        @PostAuthorize("hasAnyRole('write', 'delete')")
        public String delete() {
            return "DELETE";
        }

        @GetMapping("/name")
        @PreAuthorize("#name == authentication.principal.username")
        public String whoIs(@RequestParam(value = "name") String name) {
            return "Прекрасно, " + name + "! " + " Вы можете использовать этот метод";
        }
}
