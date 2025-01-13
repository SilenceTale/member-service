package org.koreait.member.jwt;

import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.http.HttpServletRequest;
import org.koreait.global.exceptions.UnAuthorizedException;
import org.koreait.member.services.MemberInfoService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.security.Key;

@Lazy
@Service
@EnableConfigurationProperties(JwtProperties.class)
public class TokenService {

    private final JwtProperties properties;
    private final MemberInfoService infoService;

    private Key key;

    public TokenService(JwtProperties properties, MemberInfoService infoService) {
        this.properties = properties;
        this.infoService = infoService;

        byte[] keyBytes = Decoders.BASE64.decode(properties.getSecret());
        this.key = Keys.hmacShaKeyFor(keyBytes);
    }

    /**
     * JWT 토큰 생성
     *
     * @param email
     * @return
     */
    public String create(String email) {

        return null;

    }

    /**
     * 토큰으로 인증 처리(로그인 처리)
     *
     * 토큰은 요청 헤더에 실려서 같이 전달 :
     *          Authorization: Bearer 토큰
     * @param token
     * @return
     */
    public Authentication authentication(String token) {

        return null;
    }

    public Authentication authentication(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (!StringUtils.hasText(authHeader)) {
            throw new UnAuthorizedException();
        }

        String token = authHeader.substring(7);

        return authentication(token); // <- 주 메서드
    }
}
