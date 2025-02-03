package org.koreait.member.controllers;

import lombok.RequiredArgsConstructor;
import org.koreait.member.services.TempTokenService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TokenController {
    private final TempTokenService tempTokenService;

    public String redirect() {

        return null;
    }
}
