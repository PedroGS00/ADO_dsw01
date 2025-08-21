package br.com.carstore.servlet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String carName = request.getParameter("car-name");
        String carColor = request.getParameter("car-color");

        Map<String, String> Json = new HashMap<>();
        Json.put("nome_carro", carName);
        Json.put("cor_carro", carColor);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String resposta = gson.toJson(Json);

        request.setAttribute("response", resposta);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}