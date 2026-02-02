package com.jb.todo_management_system.utils;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtils 
{
    private final String SECRET ="J34UJ34UJ34UJ34UJ34UJ34UJ34UJ34UJ34UJ34UJ34UJ34UJ34U";
    private final long EXPIRATION = 1000*604800;

    private final Key securityKey = Keys.hmacShaKeyFor(SECRET.getBytes(StandardCharsets.UTF_8));

    public String generateToken(String email)
    {
        return Jwts.builder()
                   .setSubject(email)
                   .setIssuedAt(new Date(System.currentTimeMillis()))
                   .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION))
                   .signWith(securityKey, SignatureAlgorithm.HS256)
                   .compact();

    }


    public String extractEmail(String token)
    {
        return Jwts.parserBuilder()
                    .setSigningKey(securityKey)
                    .build()
                    .parseClaimsJws(token)
                    .getBody()
                    .getSubject();
    }

    
    public boolean validateJwtToken(String token)
    {
        try
        {
            extractEmail(token);
            return true;
        }
        catch(JwtException exception)
        {
            return false;
        }
    }
    
}
