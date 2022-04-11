package org.example;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {

    public HelloWorld() {
        System.out.println("HelloWorld started!");
    }

    public String getMessage() {
        Movie movie = Api.getMovie("Titanic", "1997");
        return movie.toString();
    }
}