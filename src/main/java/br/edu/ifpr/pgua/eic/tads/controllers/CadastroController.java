package br.edu.ifpr.pgua.eic.tads.controllers;
import java.util.HashMap;
import java.util.Map;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public class CadastroController {

    public Handler get = ctx -> {
        ctx.redirect("cadastro.html");

    };
    
}
