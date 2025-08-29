package br.edu.ifpr.pgua.eic.tads;

import java.util.ArrayList;
import br.edu.ifpr.pgua.eic.tads.models.*;
import br.edu.ifpr.pgua.eic.tads.controllers.IndexController;
import br.edu.ifpr.pgua.eic.tads.controllers.CadastroController;
import br.edu.ifpr.pgua.eic.tads.utils.JavalinUtils;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class Main {
    public static ArrayList<Contato> databaseContato = new ArrayList<>();
    public static void main(String[] args) {
        /*Contato contato = new Contato("Ana", "alcarlesso3@gmail.com", "12345678");
        Agenda agenda = new Agenda("INfo24", "ONline");

        agenda.adicionarContato(contato);
        System.out.println(agenda);
    }
}  */


        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("/public", Location.CLASSPATH);
        }).start(7000);

        CadastroController cadastroController = new CadastroController();

        app.get("/", ctx -> {
            ctx.redirect("/index.html");
        });

        app.get("/cadastro", cadastroController.get );
    
    }

}

