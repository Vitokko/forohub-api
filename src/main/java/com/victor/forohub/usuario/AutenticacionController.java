package com.victor.forohub.usuario;

import com.victor.forohub.infra.security.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class AutenticacionController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public DatosJWTToken autenticarUsuario(@RequestBody DatosAutenticacionUsuario datos) {
        var authenticationToken = new UsernamePasswordAuthenticationToken(datos.login(), datos.clave());
        var authentication = authenticationManager.authenticate(authenticationToken);

        var jwtToken = tokenService.generarToken((Usuario) authentication.getPrincipal());
        return new DatosJWTToken(jwtToken);
    }
}
