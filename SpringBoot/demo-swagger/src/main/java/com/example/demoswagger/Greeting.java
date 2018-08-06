
package com.example.demoswagger;


import io.swagger.annotations.ApiModelProperty;

public class Greeting {

    private final long id;
    private final String content;
    @ApiModelProperty(notes = "The system generated greeting message" , readOnly =true)

    private String message;

    public Greeting(long id, String content, String message) {
        this.id = id;
        this.content = content;
        this.message = message;
    }
    public Greeting( String message,String content) {
        id = -1;
        this.content = content;
        this.message = message;
    }

    public Greeting(long l, String format) {
        id = l;
        this.content = "content";
        this.message = format;
    }


    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }
}
