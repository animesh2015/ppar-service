package io.swagger.api;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-29T07:00:55.980193590Z[GMT]")
public class ApiException extends Exception {
    private int code;
    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
    }
}
